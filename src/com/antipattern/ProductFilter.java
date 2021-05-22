package com.antipattern;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ProductFilter {
	public List<Product> filterByColor(List<Product> productList, Color color){		
		return productList.stream().filter(product -> product.getColor() == color).collect(Collectors.toList());		
	}
	
	public List<Product> filterBySize(List<Product> productList, Size size){		
		return productList.stream().filter(product -> product.getSize() == size).collect(Collectors.toList());		
	}
	
	public List<Product> filterBySizeAndColor(List<Product> productList, Color color, Size size){		
		return productList.stream().filter(product -> product.getColor() == color && product.getSize() == size).collect(Collectors.toList());		
	}
	
	
}
