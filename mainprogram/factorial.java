package com.mainprogram;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		System.out.println("Enter the whose factorial is to be calculated ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int factorial = 1 , i=1;
		while (a>=i) {
			factorial = factorial*i;
			i++;
		}
		System.out.println("Factorial for"+ a +" is: "+ factorial );
		
		
	}

}
