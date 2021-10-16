package com.basic.praticeSet1;

import java.util.Scanner;

public class Kilometers_to_miles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("enter value in Kilometers");
		
		double km= sc.nextFloat();
		double res = (km*0.621371);
		
		System.out.println(km+" kms is equals to "+res+" miles");

	}

}
