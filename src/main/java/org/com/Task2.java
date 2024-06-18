package org.com;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //2. Input four numbers from the keyboard, and display the maximum of them.
        int[] numbers = new int[4];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 4 elements:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scan.next());
        }

        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
           if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Max element is: " + max);
    }
}





