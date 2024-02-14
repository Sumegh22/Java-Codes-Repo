package com.basic.coding.questions.set2;

import java.util.Scanner;

public class Encrypt_grade_by_type_casting {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Grade to encrypt: ");


        String g= sc.nextLine();

        if (g.length()>1)
        {System.out.println("invalid entry");		}

        else
        {

            char[] Ca= g.toCharArray();

            char newV = (char) (Ca[0]+8);

            System.out.println("Encrypted grade = "+newV);

        }

    }

}
