package com.basic.praticeSet1;

import java.util.Scanner;

public class Addition_of_3_nums {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter 1st num");
		
		int n1=sc.nextInt(); 		System.out.println("Enter 2nd num");

		int n2= sc.nextInt();		System.out.println("Enter 3rd num");

		int n3=sc.nextInt();
		
		System.out.println("The sum of 3 nos.= "+(n1+n2+n3));
	}

}
