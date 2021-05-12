package cojocaru.anamaria.g1092.dp.builder;


public class ProductDirector {
	Product.ProductBuilder builder;
	public ProductDirector(Product.ProductBuilder builder) {
		this.builder = builder;
	}
	public Product buildJoker() {
		return builder
				.isAvailable()
				.build();
	}
	
	
}
