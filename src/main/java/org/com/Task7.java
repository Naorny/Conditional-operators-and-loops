package org.com;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //7. For seven attempts to guess a number.
        // At each attempt you will see a message - "Little" or "Much".
        // If you guess within seven attempts,
        // the message "Guessed :)" will be displayed and the program will terminate.
        // If after 7 attempts the number is not guessed,
        // the message "Did not guess :(" is displayed and the program terminates.
        // You use a code to generate the secret number:
        // Random random = new Random();
        // int secret;
        // Generate a number from 0 to 20
        // secret = random.nextInt(20 + 1);

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int secret;
        secret = random.nextInt(20 + 1);
        //System.out.println("The secret number is : " + secret);

        for (int i = 1; i <= 7; i++) {
            System.out.print("Please enter your " + i + " number: ");
            int number = scan.nextInt();
            if (number != secret) {
                if (number > secret) {
                    System.out.println("Much");
                }else{
                    System.out.println("Little");
                }}else{
                      System.out.println("Guessed :)");
                      break;
                }
             if (i == 7) {
                 System.out.println("Did not guess :(");
             }
          }
      }
}