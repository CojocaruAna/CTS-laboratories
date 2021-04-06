package ro.ase.acs.g1092.assignment;

import ro.ase.acs.g1092.assignment.exceptions.InvalidValueException;

public class BankAccount {
	public static final float BROKER_FEE = .0125f;
	public static final float DAYS_IN_A_YEAR = 365;

	private double loanValue, monthlyRate;
	private int daysActive;
	TypeOfBankAccount bankAccountType;
	
	public BankAccount(double loanValue, double monthlyRate, TypeOfBankAccount bankAccountType) throws InvalidValueException {
		if (loanValue < 0) {
			throw new InvalidValueException("Loan value cannot be a negative value!");
		}
		if (monthlyRate < 0) {
			throw new InvalidValueException("Monthly rate has to be a positive number.");
		}
		this.loanValue = loanValue;
		this.monthlyRate = monthlyRate;
		this.bankAccountType = bankAccountType;
	}

	public double getLoanValue() {
		System.out.println("The value of the loan is: " + this.loanValue);
		return loanValue;
	}

	public double getMonthlyRate() {
		System.out.println("The value of the rate is: " + monthlyRate);
		return this.monthlyRate;
	}

	public void setLoanValue(double loanValue) throws InvalidValueException {
		if (loanValue < 0) {
			throw new InvalidValueException("The loan isn't a positive number!");
		}
		this.loanValue = loanValue;
	}

	public String getAccountInfo() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(System.getProperty("line.separator"));
		stringBuilder.append("ACCOUNT DETAILS");
		stringBuilder.append(System.getProperty("line.separator"));
		stringBuilder.append("Loan value: ");
		stringBuilder.append(this.loanValue);
		stringBuilder.append("Monthly rate: ");
		stringBuilder.append(this.monthlyRate);
		stringBuilder.append("Days active: ");
		stringBuilder.append(this.daysActive);
		stringBuilder.append("Account type: ");
		stringBuilder.append(this.bankAccountType);
		stringBuilder.append(System.getProperty("line.separator"));
		return stringBuilder.toString();
	}

	public static double getDifferenceBetweenInterestAndPrincipal(BankAccount bankAccount) {
		return (bankAccount.daysActive / DAYS_IN_A_YEAR) - bankAccount.loanValue;
	}
	
	public static double getBankAccountInterestFee(BankAccount bankAccount) {
		return Math.pow(bankAccount.monthlyRate, getDifferenceBetweenInterestAndPrincipal(bankAccount));
	}
	
	public static double getLoanValueAfterApplyingInterestFee(BankAccount bankAccount) {
		return bankAccount.loanValue * getBankAccountInterestFee(bankAccount);
	}
	
	public static double getAccountFinalFee(BankAccount bankAccount) {
		return BROKER_FEE * getLoanValueAfterApplyingInterestFee(bankAccount);
	}
	
	public static double getPremiumAndSuperPremiumBankAccountsTotalFeeValue(BankAccount[] bankAccounts) {
		double totalFee = 0.0;
		for (int i = 0; i < bankAccounts.length; i++) {
			if (bankAccounts[i].bankAccountType == TypeOfBankAccount.PREMIUM || bankAccounts[i].bankAccountType == TypeOfBankAccount.SUPER_PREMIUM) {
				totalFee += getAccountFinalFee(bankAccounts[i]);
			}
		}
		return totalFee;
	}

	
	
	
}