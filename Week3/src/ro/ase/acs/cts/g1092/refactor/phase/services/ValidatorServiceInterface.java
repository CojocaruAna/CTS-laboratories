package ro.ase.acs.cts.g1092.refactor.phase.services;

import ro.ase.acs.cts.g1092.refactor.exceptions.InvalidAgeException;
import ro.ase.acs.cts.g1092.refactor.exceptions.InvalidPriceException;

public interface ValidatorServiceInterface {
	public void validatePrice(float price) throws InvalidPriceException;
	public void validateAge(int accountAge) throws InvalidAgeException;
}
