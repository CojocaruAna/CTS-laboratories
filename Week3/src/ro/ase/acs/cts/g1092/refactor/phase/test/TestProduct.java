package ro.ase.acs.cts.g1092.refactor.phase.test;

import java.util.ArrayList;

import ro.ase.acs.cts.g1092.refactor.exceptions.InvalidAgeException;
import ro.ase.acs.cts.g1092.refactor.exceptions.InvalidPriceException;
import ro.ase.acs.cts.g1092.refactor.phase.Product;
import ro.ase.acs.cts.g1092.refactor.phase.ProductType;
import ro.ase.acs.cts.g1092.refactor.phase.services.Marketing2021Strategy;
import ro.ase.acs.cts.g1092.refactor.phase.services.ValidatorService;
import ro.ase.acs.cts.g1092.refactor.phase.services.MarketingEasternStrategy;
import ro.ase.acs.cts.g1092.refactor.phase.services.MarketingServiceInterface;

public class TestProduct {
	
	public static ArrayList<Object> services = new ArrayList<>();
	
	public static void startup() {
		//load services
		services.add(new ValidatorService());
		services.add(new Marketing2021Strategy());
	}

	public static void main(String[] args) {
		
		
		startup();
		
		//Product product = new Product();
		Product product = new Product(
				new Marketing2021Strategy(),
				new ValidatorService());
		
		try {
			float finalPrice = 
					product.computePriceWithDiscount(ProductType.DISCOUNTED, 100, 5);
			System.out.println("The final price is " + finalPrice);
			
			product.setMarketingService(new MarketingEasternStrategy());
			
			finalPrice = 
					product.computePriceWithDiscount(ProductType.DISCOUNTED, 100, 5);
			System.out.println("The final price is " + finalPrice);
			
			product.setMarketingService(new MarketingServiceInterface() {
				
				@Override
				public float getFidelityDiscount(int accountAge) {
					return 0.3f;
				}
			});
			
			finalPrice = 
					product.computePriceWithDiscount(ProductType.DISCOUNTED, 100, 5);
			System.out.println("The final price is " + finalPrice);
			
			
		} catch (InvalidPriceException e) {
			e.printStackTrace();
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		
		
	}

}