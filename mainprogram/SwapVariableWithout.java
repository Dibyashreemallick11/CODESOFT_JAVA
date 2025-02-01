package com.mainprogram;

import java.util.Scanner;

public class SwapVariableWithout{
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=s.nextInt();
		System.out.println("Enter second number");
		int b=s.nextInt();
		
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+"" +b);
		
		
	}
}


// a=2,b=3 ... change the value of variables with out using third variable