package com.ajita;

public class Arrayuppercase {
    public static void main(String[] args) { //print capital from missle to end
        String[] names = {"John", "jack", "raj", "rhyan", "donald"};
        for (int i = 0; i < names.length; i++)
           if (i >= 2)
              System.out.println(names[i].toUpperCase());
            else
                System.out.println(names[i]);


    }
}
