package ro.ase.acs.cts.g1092.refactor.phase.services;

public class Marketing2021Strategy implements MarketingServiceInterface{

	@Override
	public float getFidelityDiscount(int accountAge) {
		
		return (accountAge > MAX_AGE_ACCOUNT) ? MAX_FIDELITY_DISCOUNT : (float) accountAge / 100;
	}

}
