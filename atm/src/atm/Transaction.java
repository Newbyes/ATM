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