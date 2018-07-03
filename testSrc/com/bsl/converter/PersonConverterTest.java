package com.bsl.converter;

import com.bsl.common.Person;
import com.bsl.common.PersonCollectionProvider;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class PersonConverterTest {
	
	private Collection<Person> theTeam = null;
	
	@Before
	public void beforeTest() {
		theTeam = PersonCollectionProvider.prepare();
	}
	
	public void afterTest() {
		theTeam = null;
	}	
	
	@Test
	/**
	 * TASK: Provide implementation for this test - it should check if the Person object
	 * has been properly converted to the format specified in PersonConverter class.
	 * 
	 * Fix any errors the test might have found.
	 */
	public void shouldConvertPerson() {
		// GIVEN
        final Person person = new Person("Jan", "Tomaszewski", 1948);
        final PersonConverter personConverter = new PersonConverter();

		// WHEN
        final String actual = personConverter.toCsv(person);
        final String expected = "Jan,Tomaszewski,1948";

		// THEN
        assertEquals(expected, actual);
	}
	
	@Test
	/**
	 * TASK: Provide implementation for this test - it should check if the output of the
	 * method: PersonConverter.toCsv(final Collection<Person> p) returned a CSV String
	 * that contains the same number of records as the input Collection.
	 * 
	 * Fix any errors the test might have found. 
	 */
	public void shouldConvertPersonCollectionCheckNumberOfRecords() {
	    // GIVEN
        final PersonConverter personConverter = new PersonConverter();

        // WHEN
        final String result = personConverter.toCsv(theTeam);
        final int actualPersonsCount = result.length() - result.replace(";", "").length();
        final int expectedPersonsCount = theTeam.size();

        // THEN
        assertEquals(expectedPersonsCount, actualPersonsCount);
	}
}
