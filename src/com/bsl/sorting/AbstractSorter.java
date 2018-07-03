package com.bsl.sorting;

import java.util.Collection;

public abstract class AbstractSorter<T> {
	public abstract Collection<T> sort(Collection<T> collection);
}
