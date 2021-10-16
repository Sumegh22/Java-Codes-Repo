package com.basic.praticeSet1;

import java.util.Scanner;

public class Is_entered_value_an_integer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value to check if the value is an Int");
		System.out.println(sc.hasNextInt());
		
	}

}
