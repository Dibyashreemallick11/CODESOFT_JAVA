package com.mainprogram;

import java.util.Scanner;

public class Swapmain {
	public static void main(String[] args) {
		//swap two variables using third variables
		int a , b , temp;
		System.out.println("Enter 2 values to swap");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		temp = a;
		a=b;
		b=temp;
		System.out.println("Values of first variables:" + a);
		System.out.println("Values of second variables:"+ b);
	}
}


	
	

