package com.mainprogram;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		System.out.println("please enter your age");
	
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		if(age>21) 
			System.out.println("eligible");
			else if(age<21)
			System.out.println(" ineligible");

			
		}
		
	}

	


