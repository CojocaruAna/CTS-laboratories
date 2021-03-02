package ro.ase.csie.cts.g1092.lab2.models;

import ro.ase.csie.cts.g1092.lab2.exceptions.IllegalTransferException;
import ro.ase.csie.cts.g1092.lab2.exceptions.InsufficientFundsException;

public abstract class Account {
	
	public abstract void deposit(Double amount);
	public abstract void withdraw(Double amount) throws InsufficientFundsException;
	public abstract Object getBalance();
	public abstract void transfer(Account destination, Double amount) throws InsufficientFundsException, IllegalTransferException;
	
}
