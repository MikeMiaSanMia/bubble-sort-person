package com.bsl.converter;

import com.bsl.common.Person;

import java.util.Collection;

/**
 * TASK 4.a: Implement toCsv(final Person p) method, so that it returns a 
 * String of the form: Name,Surname,YearOfBirth.
 * 
 * TASK 4.b: Implement toCsv(final Collection<Person> p) method, so that it returns a 
 * String with multiple lines - each of them should contain information about 1 person.
 *
 */
public final class PersonConverter {
	public String toCsv(final Person p) {

		return new StringBuilder()
				.append(p.getName())
				.append(",")
				.append(p.getSurname())
				.append(",")
				.append(p.getYearOfBirth()).toString();
	}
	
	public String toCsv(final Collection<Person> p) {
	    StringBuilder result = new StringBuilder();
	    for (Person person : p) {
	        result.append(toCsv(person)).append(";");
        }
	    return result.toString();
	}
}
