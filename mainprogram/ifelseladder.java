package com.mainprogram;

import java.util.Scanner;

public class ifelseladder {
	public static void main(String[] args) {
		System.out.println("Enter your age");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		if (age>21) {
			if (age>55)
				System.out.println("senior citizen account");
			else if(age<55)
				System.out.println("savings account");
		} else if (age<21)
			System.out.println("ineligible");
			
		}
		
	}


