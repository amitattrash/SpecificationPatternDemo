package com.specpattern;

public class ColorSpecification implements ISpecification<Product>{
	private Color color;
	public ColorSpecification(Color color) {
		this.color = color;
	}

	@Override
	public boolean isSatisfied(Product product) {
		return product.getColor() == color;
	}
}
