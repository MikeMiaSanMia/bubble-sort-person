package com.bsl.sorting;

import com.bsl.common.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * TASK 2.a: Implement 'transformCollection' method. It should convert a Collection into an array.
 * TASK 2.b: Implement 'transformArray' method. It should convert an array into Collection.
 * TASK 2.c: Implement 'sort' method using Bubble Sort algorithm.
 */
public final class PersonBubbleSorter extends AbstractSorter<Person> {

	@Override
	public Collection<Person> sort(final Collection<Person> collection) {
		final Person[] persons = transformCollection(collection);

		sort(persons);

		return transformArray(persons);
	}
	
	private void sort(final Person[] array) {
	    int counter = array.length;
	    while (counter > 1) {
            for (int i = 0; i < counter - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    final Person temporary = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temporary;
                }
            }
            counter--;
        }
	}

	private Person[] transformCollection(final Collection<Person> collection) {

		return collection.toArray(new Person[collection.size()]);
	}
	
	private Collection<Person> transformArray(final Person[] persons) {

		return new ArrayList<>(Arrays.asList(persons));
	}
}
