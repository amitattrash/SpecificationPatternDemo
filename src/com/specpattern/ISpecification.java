package com.specpattern;

import java.util.List;

public interface ISpecification<T> {
	public boolean isSatisfied(T spec);
}
