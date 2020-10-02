package com.ajita;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();//read user input
        System.out.println("What is your age?");
        int age = scan.nextInt();
        if (age > 0 && age <= 10) {
            System.out.println(" Hi " + (name) + " ," + " you will be " + (age + 1) + " years after 1 years ");
        } else if (age > 10 && age <= 30) {
            System.out.println(" Hi " + (name) + " ," + " you will be " + (age + 3) + " years after 3 years ");
        } else if (age > 30 && age <= 50) {
            System.out.println(" Hi " + (name) + " ," + " you will be " + (age + 5) + " years after 5 years ");
        } else {
            System.out.println(" Hi " + (name) + " ," + " you will be " + (age + 10) + " years after 10 years ");
        }
    }
}












