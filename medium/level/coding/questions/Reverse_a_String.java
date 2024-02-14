package com.medium.level.coding.questions;

import java.util.Scanner;

public class Reverse_a_String {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter any String to reverse");
		
	String s= sc.nextLine();
	
	int flag = s.length()-1;
	
	for (int i=0;i<s.length();i++)
	{
		System.out.print(s.charAt(flag));
		flag--;
	}
	

	}

}
