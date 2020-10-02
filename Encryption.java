package src.com.ajita;

import java.util.Scanner;

public class Encryption {
    public void caeserCipher() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word:");
        String s = scan.nextLine();
        System.out.println("Before encryption:" + s);
        String encrypted = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ')//check for empty at each index of character
                encrypted += Character.toString(s.charAt(i) + 1);
            else
                encrypted += " ";
        }
        System.out.println("After encryption: " + encrypted);
    }

    public static void main(String[] args) {
        Encryption encryption = new Encryption();
        encryption.caeserCipher();//call the function
    }
}







