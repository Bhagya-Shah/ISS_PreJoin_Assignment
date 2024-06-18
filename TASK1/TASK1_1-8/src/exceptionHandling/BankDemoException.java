package exceptionHandling;

class InsufficientFundException extends Exception {
	private double amount;

	public InsufficientFundException(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}
}

public class BankDemoException {
	private double balance;
	private int accNumber;

	public BankDemoException(int accNumber) {
		this.setAccNumber(accNumber);
	}

	public double getBalance() {
		return balance;
	}

	public void depositMoney(double amount) {
		balance += amount;
		System.out.println("Deposited Succesfully "+amount);
	}

	public void withdrawMoney(double amount) throws InsufficientFundException {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Withdraw succesfully "+amount);
		} else {
			throw new InsufficientFundException(amount - balance);
		}
	}

	public static void main(String[] args) {
		BankDemoException acc45 = new BankDemoException(45);
		try {
			acc45.depositMoney(5000.00);
			acc45.withdrawMoney(3500.00);
			acc45.withdrawMoney(2500.00);
		} catch (InsufficientFundException e) {
			System.out.println("Insufficient Fund of "+ e.getAmount());
			e.printStackTrace();
		}
	}

	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
}
