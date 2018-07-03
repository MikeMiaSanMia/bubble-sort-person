package com.bsl.finder;

import com.bsl.common.Person;
import com.bsl.common.PersonCollectionProvider;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PersonFinderTest {
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
	 * TASK: Test if the findPersonsByName method properly finds people with given name.
	 * 
	 * Fix any errors the test might have found. 
	 */
	public void shouldFindPersons() {
		// GIVEN
		final PersonFinder personFinder = new PersonFinder();
		final String name = "Henryk";
		final Person kasperczak = new Person(name, "Kasperczak", 1946);
		final Person wieczorek  = new Person(name, "Wieczorek", 1949);

		// WHEN
        Collection<Person> persons = personFinder.findPersonsByName(name, theTeam);
        final int actualCount = persons.size();
        final int expectedCount = 2;

		// THEN
        assertEquals(expectedCount, actualCount);
        assertTrue(persons.contains(kasperczak));
        assertTrue(persons.contains(wieczorek));
	}
	
	@Test
	/**
	 * TASK:
	 * Test if the findPersonsByName method properly returns an empty collection
	 * when searching for people who does not exist in the collection.
	 * 
	 * Fix any errors the test might have found.
	 */
	public void shouldNotFindPersons() {
	    // GIVEN
        final PersonFinder personFinder = new PersonFinder();
        final String name = "Michal";

        // WHEN
        Collection<Person> persons = personFinder.findPersonsByName(name, theTeam);
        final int actualCount = persons.size();
        final int expectedCount = 0;

        // THEN
        assertEquals(expectedCount, actualCount);
	}
}
