package ro.ase.csie.cts.g1092.lab2.models;

public abstract class Account {
	
	public abstract void deposit(Double amount);
	public abstract void withdraw(Double amount);
	public abstract Object getBalance();
	public abstract void transfer(Account destination, Double amount);
	
}
