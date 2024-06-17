package org.com;

import java.util.Scanner;

public class Task5and6 {
    public static void main(String[] args) {
        //5. Enter the name and age from the keyboard.
        // If the age is less than 18, display the message "Grow up more"
        //6. Enter name and age from the keyboard.
        // If the age is more than 20, display the message "18 is enough".

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you name: ");
        String name = scan.nextLine();
        System.out.println("Enter you age: ");
        int age = scan.nextInt();

        if (age < 18) {
            System.out.println("Grow up more");
        } else if (age >= 20) {
            System.out.println("18 is enough");
        } else {
            System.out.println(name + "! There is not message for you age.");
        }
    }
}