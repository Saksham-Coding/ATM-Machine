package bankapp;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to ATM Machine:");
		System.out.println("-------------------------------------------");
		Solution s=new Solution();
		Bank b=new ATM();
		while (true)
		{
			System.out.println("1:Deposit\n2:Withdraw\n3:Check Balance\n4:Exit");
			int choice=sc.nextInt();
			System.out.println("------------------");
			switch(choice)
			{
			case 1:
				System.out.println("Enter Amount to be Deposit");
				int dAmnt=sc.nextInt();
				b.deposit(dAmnt);
				System.out.println("------------------");break;
			case 2:
				System.out.println("Enter Amount to be Withdraw");
				//int wAmnt=sc.nextInt();
				b.withdraw(sc.nextInt());//b.withdraw(wAmnt);
				System.out.println("------------------");break;
			case 3:
				b.checkBalance();
				System.out.println("------------------");break;
			case 4:
				System.out.println("ThankYou For Visiting");
				System.out.println("*********************");
				System.exit(0);
			default :
				System.out.println("Invalid");
				System.out.println("------------------");
				System.out.println();

			}

		}
	}
}
