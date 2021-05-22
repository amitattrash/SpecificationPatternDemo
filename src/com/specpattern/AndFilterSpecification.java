package com.specpattern;

public class AndFilterSpecification<T> implements ISpecification<T>{
	private ISpecification<T> first;
	private ISpecification<T> second;
	public AndFilterSpecification(ISpecification<T> first, ISpecification<T> second) {
		this.first =first;
		this.second = second;
	}

	@Override
	public boolean isSatisfied(T item) {
		return first.isSatisfied(item) && second.isSatisfied(item);
	}
 
}
