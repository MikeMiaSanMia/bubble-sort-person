package com.bsl.common;

import java.util.ArrayList;
import java.util.Collection;

public final class PersonCollectionProvider {
	private PersonCollectionProvider() {
		
	}
	
	public static Collection<Person> prepare() {
		final Collection<Person> persons = new ArrayList<Person>();

		persons.add(new Person("Wladyslaw", "Zmuda", 1954));
		persons.add(new Person("Henryk", "Wieczorek", 1949));
		persons.add(new Person("Kazimierz", "Deyna", 1947));
		persons.add(new Person("Jan", "Domarski", 1946));
		persons.add(new Person("Andrzej", "Fisher", 1952));
		persons.add(new Person("Robert", "Gadocha", 1946));
		persons.add(new Person("Jerzy", "Gorgon", 1949));
		persons.add(new Person("Zbigniew", "Gut", 1949));
		persons.add(new Person("Roman", "Jakboczak", 1946));
		persons.add(new Person("Zygmunt", "Kalinowski", 1949));
		persons.add(new Person("Zdzislaw", "Kapka", 1954));
		persons.add(new Person("Henryk", "Kasperczak", 1946));
		persons.add(new Person("Kazimierz", "Kmiecik", 1951));
		persons.add(new Person("Marek", "Kusto", 1954));
		persons.add(new Person("Grzegorz", "Lato", 1950));
		persons.add(new Person("Zygmunt", "Maszczyk", 1945));
		persons.add(new Person("Adam", "Musial", 1948));
		persons.add(new Person("Andrzej", "Szarmach", 1950));
		persons.add(new Person("Antoni", "Szymanowski", 1951));
		persons.add(new Person("Jan", "Tomaszewski", 1948));
		persons.add(new Person("Leslaw", "Cmikiewicz", 1948));
		persons.add(new Person("Miroslaw", "Bulzacki", 1951));

		return persons;
	}
}
