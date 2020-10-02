package com.ajita;

import java.util.Scanner;

public class Javaclasswork {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("What is your age?");
        int age = scan.nextInt();
        System.out.println(" Hi " + (name) + " ," + " you will be " + ( age + 10 ) + " years after 10 years ");



    }
}
