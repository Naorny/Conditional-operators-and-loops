package org.com;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //3. Enter three numbers from the keyboard and display them in descending order.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int a = scan.nextInt();
        System.out.print("Enter the 2nd number: ");
        int b = scan.nextInt();
        System.out.print("Enter the 3d number: ");
        int c = scan.nextInt();

        if (c >= a && c >= b) {
            if (a >= b) {
                System.out.println("Descending order of numbers: " + c + " " + a + " " + b);
            } else {
                System.out.println("Descending order of numbers: " + c + " " + b + " " + a);
            }
        }

        if (b >= a && b >= c) {
            if (a >= c) {
                System.out.println("Descending order of numbers: " + b + " " + a + " " + c);
            } else {
                System.out.println("Descending order of numbers: " + b + " " + c + " " + a);
            }
        }

        if (a >= b && a >= c) {
            if (b >= c) {
                System.out.println("Descending order of numbers: " + a + " " + b + " " + c);
            } else {
                System.out.println("Descending order of numbers: " + a + " " + c + " " + b);
            }
        }
    }
}


