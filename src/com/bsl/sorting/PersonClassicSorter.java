package com.bsl.sorting;

import com.bsl.common.Person;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/**
 * TASK 3.a: Provide implementation for the sort method. Use sorting mechanism build into Java SDK.
 * 
 * This method does NOT have to return a new collection.
 */
public class PersonClassicSorter extends AbstractSorter<Person> {

	@Override
	public Collection<Person> sort(Collection<Person> collection) {
	    ((List<Person>) collection).sort(Comparator.comparing(Person::getSurname));
        return collection;
	}
}
