package com.specpattern;

import java.util.List;
import java.util.stream.Collectors;

public class ProductFilter implements IFilter<Product>{
	@Override
	public List<Product> filter(List<Product> items, ISpecification<Product> spec) {
		return items.stream().filter(product -> spec.isSatisfied(product)).collect(Collectors.toList());
	}
}
