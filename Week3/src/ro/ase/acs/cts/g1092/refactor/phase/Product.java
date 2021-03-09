package ro.ase.acs.cts.g1092.refactor.phase;

import java.nio.channels.UnsupportedAddressTypeException;

public class Product {
	
	public static final int MAX_AGE_ACCOUNT = 10;
	public static final float MAX_FIDELITY_DISCOUNT = 0.15f;
	
	public float computePriceWithDiscount(ProductType productType, float initialPrice, int accountAge)
	  {
	    float finalPrice = 0;
	    float fidelityDiscount = (accountAge > MAX_AGE_ACCOUNT) ? MAX_FIDELITY_DISCOUNT : (float)accountAge/100; 
	    
	    
	    switch(productType) {
	    case NEW:
	    	finalPrice = initialPrice;
	    	break;
	    case DISCOUNTED:
	    	finalPrice = (initialPrice - (ProductType.DISCOUNTED.getDiscount() * initialPrice)) - fidelityDiscount * (initialPrice - (ProductType.DISCOUNTED.getDiscount() * initialPrice));
	    	break;
	    case LIMITED_STOCK:
	    	finalPrice = (initialPrice - (ProductType.LIMITED_STOCK.getDiscount() * initialPrice)) - fidelityDiscount * (initialPrice - (ProductType.LIMITED_STOCK.getDiscount() * initialPrice));
	    	break;
	    case LEGACY:
	    	finalPrice = (initialPrice - (ProductType.LEGACY.getDiscount() * initialPrice)) - fidelityDiscount * (initialPrice - (ProductType.LEGACY.getDiscount() * initialPrice));
	    	break;
	    	default:
	    		throw new UnsupportedOperationException("the enum not covered");
	    }
	    return finalPrice;
	  }
	  
}