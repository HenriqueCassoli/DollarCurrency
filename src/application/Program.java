package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is dollar price ?");	
		double price = sc.nextDouble();
		
		
		System.out.print("How many dollar will be bought ?");
		double bought = sc.nextDouble();
		
		double result =CurrencyConverter.paid(price, bought);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		
		
		sc.close();
		
	}

}
