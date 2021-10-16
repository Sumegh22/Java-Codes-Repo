package com.basic.praticeSet1;

import java.util.Scanner;

public class GPA_of_3subjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Marks of subject1");
		float a=sc.nextInt();  		System.out.println("Marks of subject1");

		float b=sc.nextInt();  		System.out.println("Marks of subject2");

		float c=sc.nextInt();   		
		
		float res = (a+b+c)/30;
		System.out.println("Gpa of 3 subjects ="+res);

	}

}
