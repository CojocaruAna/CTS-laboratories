package cojocaru.anamaria.g1092.simplefactory;

public class BuyFactory {
	
	   public Bought getName(String productPrice){
	      if(productPrice == null){
	         return null;
	      }		
	      if(productPrice.equalsIgnoreCase("BEAUTY")){
	         return new BeautyProduct();
	         
	      } else if(productPrice.equalsIgnoreCase("SKINCARE")){
	         return new SkinCareProduct();
	         
	      }
	      
	      return null;
	   }
}
