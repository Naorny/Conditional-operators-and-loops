package org.com;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //2. Input four numbers from the keyboard, and display the maximum of them.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int a = scan.nextInt();
        System.out.print("Enter the 2nd number: ");
        int b = scan.nextInt();
        System.out.print("Enter the 3d number: ");
        int c = scan.nextInt();
        System.out.print("Enter the 4th number: ");
        int d = scan.nextInt();

        int sum1 = a+b+c;
        int sum2 = a+b;

        if (d > sum1) {
            System.out.println("Maximum is " + d);
        }else{
            if (c > sum2) {
                System.out.println("Maximum is " + c);
            }else{
                if (a>b){
                    System.out.println("Maximum is " + a);
                }else{
                    System.out.println("Maximum is " + b);
                }
        }} }}




