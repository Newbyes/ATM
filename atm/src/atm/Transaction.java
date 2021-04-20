package Main;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int withdraw, deposit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Balance in your Account: ");
		int balance = sc.nextInt();
        Scanner s = new Scanner(System.in);

        while(true)
        {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");
            int n = s.nextInt();

            switch(n)
            {
                case 1:
                System.out.print("Enter money to be withdrawn:");
                withdraw = s.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Please collect your money");
                    System.out.println("Remaining Balance in Your Account is: "+balance);
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;

                case 2:
                System.out.print("Enter money to be deposited:");
                deposit = s.nextInt();
                balance = balance + deposit;
                System.out.println("Your Money has been successfully deposited");
                System.out.println("Balance after deposit is: "+balance);
                System.out.println("");
                break;

                case 3:
                System.out.println("Balance : "+balance);
                System.out.println("");
                break;