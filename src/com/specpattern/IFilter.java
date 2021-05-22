package com.specpattern;

import java.util.List;

public interface IFilter<T> {
	public List<T> filter(List<T> items, ISpecification<T> spec);
}
