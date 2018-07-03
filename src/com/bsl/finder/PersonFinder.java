package com.bsl.finder;

import com.bsl.common.Person;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * TASK 5.a: Provide implementation for the 'findPersonsByName'. It should lookup the persons collection
 * and return a new collection containing Person objects whose Name is equal to 'name' argument.
 */
public final class PersonFinder {
	public Collection<Person> findPersonsByName(final String name, final Collection<Person> persons) {
		return persons.stream()
				.filter(person -> person.getName().equals(name))
				.collect(Collectors.toList());
	}
}
