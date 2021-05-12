package cojocaru.anamaria.g1092.simplefactory;

public class FactoryPattern {
	public static void main(String[] args) {
	      BuyFactory shapeFactory = new  BuyFactory();

	      
	      Bought product1 = shapeFactory.getName("CIRCLE");

	      product1.buy();

	
	      Bought product2 = shapeFactory.getName("RECTANGLE");

	    
	      product2.buy();

	     
	   }
}
