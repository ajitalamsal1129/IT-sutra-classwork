package com.ajita;

import java.util.Scanner;

public class WhileRange {
    public static void main(String[] args) {

        boolean a = true; // Enter your age in Range 5-10.
        while (a) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your age");
            int age = scan.nextInt();
            if (age > 10 || age < 5) {
                System.out.println(" You are not in range");
                continue;
            } else {
                System.out.println("Thank you");
                break;
            }
        }
    }
}














