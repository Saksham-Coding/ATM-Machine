package bankapp;

public class ATM implements Bank{

	int balance=10000;
	
	@Override
	public void deposit(int amount) 
	{
		System.out.println("Depositing Rs."+amount);
		balance=balance+amount;
		System.out.println("Amount Deposited Successfully");
	}
	@Override
	public void withdraw(int amount) {
		if(amount<=balance) {
		System.out.println("Withdrawing Rs."+amount);
		balance-=amount; // balance=balance-amount;
		System.out.println("Amount Withdrawn Successfully");
		}
		else
			System.out.println("Insufficient Balance");
		}
	
	@Override
	public void checkBalance() {
		System.out.println("Available Balance: Rs."+balance);
	}
}
