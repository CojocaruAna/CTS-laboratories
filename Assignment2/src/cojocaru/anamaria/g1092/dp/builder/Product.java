package cojocaru.anamaria.g1092.dp.builder;


public class Product {
	String name;
	int price;
	boolean isAvailable;
	
	private Product() {
		
	}
	
	private Product(String name,int price,boolean isAvailable) {
		super();
		this.name = name;
		this.price = price;
		this.isAvailable = isAvailable;
	}
	public static class ProductBuilder{
		private Product product = null;
		
		public ProductBuilder(String name,int price) {
			product = new Product();
			product.name = name;
			product.price = price;
			
		}
		
	}
	public ProductBuilder isAvailable() {
		product.isAvailable = true;
		return this;
	}
	
	
	public Product build() {
		return this.product;
	}
	
}
