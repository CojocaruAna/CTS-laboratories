package ro.ase.acs.cts.g1092.refactor.phase.services;

public interface MarketingServiceInterface {
	
	public static final int MAX_AGE_ACCOUNT = 10;
	public static final float MAX_FIDELITY_DISCOUNT = 0.15f;
	
	public float getFidelityDiscount(int accountAge);
	
}
