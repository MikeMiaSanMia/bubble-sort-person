package com.bsl.common;

import java.time.Year;
import java.util.Objects;

/**
 * TASK 1.a: Provide Person class with Natural Order using Surname field.
 * TASK 1.b: Implement toString method.
 * TASK 1.c: Implement 'introduceYourself' method.
 * TASK 1.d: Provide implementation to any other methods you would normally do.
 */
public final class Person implements Comparable<Person>{
	private final String name;
	private final String surname;
	private final int yearOfBirth;
	
	public Person(final String name, final String surname, final int yearOfBirth) {
		this.name = name;
		this.surname = surname;
		this.yearOfBirth = yearOfBirth;	
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	
	/**
	 * TASK 1.c: Implement this method, so the returned String object is of the format
	 * similar to the example: My name is Jan Kowalski and I am 40 years old. 
	 * @return
	 */
	public String introduceYourself() {
	    final int age = Year.now().getValue() - yearOfBirth;
		return new StringBuilder("My name is ")
                .append(name)
                .append(" ")
                .append(surname)
                .append(" and I am ")
                .append(age)
                .append(" years old.").toString();
	}

    @Override
    public int compareTo(Person o) {
        return (surname.toLowerCase()).compareTo(o.surname.toLowerCase());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return yearOfBirth == person.yearOfBirth &&
                Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, surname, yearOfBirth);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
