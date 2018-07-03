package com.bsl.common;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * TASK: Provide implementation for the test cases described below.
 *
 */
public class PersonTest {
	@Test
	/**
	 * Test if Person class supports natural ordering. Fix any errors the test might
	 * have found.
	 */
	public void shouldSupportNaturalOrder() {
		// GIVEN
		final List<Person> persons = new ArrayList<>();

		final String krecinaAndKapkaName = "Zdzislaw";
		final String deynaName = "Kazimierz";
		final String krecinaSurname = "krecina";
		final String deynaSurname = "Deyna";
		final String kapkaSurname = "Kapka";
		final int krecinaAndKapkaYearOfBirth = 1954;
		final int deynaYearOfBirth = 1947;

		final Person krecina = new Person(krecinaAndKapkaName, krecinaSurname, krecinaAndKapkaYearOfBirth);
		final Person deyna = new Person(deynaName, deynaSurname, deynaYearOfBirth);
		final Person kapka = new Person(krecinaAndKapkaName, kapkaSurname, krecinaAndKapkaYearOfBirth);

		persons.add(krecina);
		persons.add(deyna);
		persons.add(kapka);

		// WHEN
		Collections.sort(persons);
		final Person expectedFirst = deyna;
		final Person expectedMiddle = kapka;
		final Person expectedLast = krecina;

		// THEN
		assertEquals(expectedFirst, persons.get(0));
		assertEquals(expectedMiddle, persons.get(1));
		assertEquals(expectedLast, persons.get(2));
	}
	
	@Test
	/**
	 * Test if the only constructor of Person class correctly assigns values to fields. Fix any errors the test might
	 * have found.
	 */
	public void shouldProperlyConstructPerson() {
	    // GIVEN
        final String name = "Andrzej";
        final String surname = "Szarmach";
        final int yearOfBirth = 1950;
        final Person person = new Person(name, surname, yearOfBirth);

        // WHEN
        final String expectedName = name;
        final String expectedSurname = surname;
        final int expectedYearOfBirth = yearOfBirth;

        // THEN
        assertEquals(expectedName, person.getName());
        assertEquals(expectedSurname, person.getSurname());
        assertEquals(expectedYearOfBirth, person.getYearOfBirth());
	}
	
	@Test
	/**
	 * Construct 2 instances of the Person class. Use default values defined as constants in this Test class.
	 * 
	 * Then test if 'equals' method correctly returns 'true' when comparing them. Fix any errors the test might
	 * have found.
	 */
	public void shouldBeEqual() {
		// GIVEN
        final String name = "Robert";
        final String surname = "Gadocha";
        final int yearOfBirth = 1946;

        final Person personFirst = new Person(name, surname, yearOfBirth);
        final Person personSecond = new Person(name, surname, yearOfBirth);

        // WHEN

        // THEN
        assertTrue(personFirst.equals(personSecond));
	}

	@Test
	/**
	 * Test added by me to check if Person class properly use method introduceYourself()
	 */
	public void shouldProperlyIntroduce() {
	    // GIVEN
        final Person personFirst = new Person("Leslaw", "Cmikiewicz", 1948);
        final Person personLast = new Person("Grzegorz", "Lato", 1950);

        // WHEN
        final String expectedStringFirst = "My name is Leslaw Cmikiewicz and I am 70 years old.";
        final String expectedStringLast = "My name is Grzegorz Lato and I am 68 years old.";

        // THEN
        assertEquals(expectedStringFirst, personFirst.introduceYourself());
        assertEquals(expectedStringLast, personLast.introduceYourself());
	}
}
