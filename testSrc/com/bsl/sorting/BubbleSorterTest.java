package com.bsl.sorting;

import com.bsl.common.Person;
import com.bsl.common.PersonCollectionProvider;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;


public final class BubbleSorterTest {
	
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
	 * This method should test if PersonBubbleSorter works.
	 * 
	 * Fix any errors the test might have found.
	 */
	public void shouldSortCollection() {
		// GIVEN
		final PersonBubbleSorter personBubbleSorter = new PersonBubbleSorter();
		final int firstIndex = 0;
		final int lastIndex = theTeam.size() - 1;

		// WHEN
		theTeam = personBubbleSorter.sort(theTeam);
        final Person expectedPersonFirst = new Person("Miroslaw", "Bulzacki", 1951);
        final Person expectedPersonLast = new Person("Wladyslaw", "Zmuda", 1954);

        // THEN
        assertEquals(expectedPersonFirst, ((List<Person>) theTeam).get(firstIndex));
        assertEquals(expectedPersonLast, ((List<Person>) theTeam).get(lastIndex));
	}
}
