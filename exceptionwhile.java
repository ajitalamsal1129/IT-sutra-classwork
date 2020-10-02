package com.ajita;

import com.sun.jdi.event.ExceptionEvent;

import java.util.Scanner;

public class exceptionwhile {
    public static <InputMismatchExceptionn> void main(String[] args) {

        boolean a = true; // Enter your age in Range 5-10.
        while (a) {
            try {
            Scanner scan = new Scanner(System.in);
                System.out.println("Enter your age in range 5-10");
               int age = scan.nextInt();
                if (age >= 5 && age <= 10) {
                    System.out.println(" Thank you");
                    break;
                } else {
                    System.out.println("You entered out of range");
                }
            } catch (Exception e) {
                System.out.println("Exception occured");
                continue;
            }
        }
    }

}







