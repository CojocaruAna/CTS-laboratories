package ro.ase.acs.cts.g1092.refactor.phase.services;

public class MarketingEasternStrategy implements MarketingServiceInterface {
	@Override
	public float getFidelityDiscount(int accountAge) {
		return 0.5f;
	}

}
