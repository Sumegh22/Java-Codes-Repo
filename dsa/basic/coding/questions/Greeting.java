package com.basic.coding.questions;

import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("What is your name ?..");
		String name= sc.nextLine();
		
		System.out.println("\nhello "+name+" have a nice day ahead");
		
	}

}
