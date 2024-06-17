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

        int sum1 = a + b;

        if (c > sum1) {
            if (a > b){
            System.out.println("Descending order of numbers: " + c + " " + a + " " + b);
            }else{
                System.out.println("Descending order of numbers: " + c + " " + b + " " + a);
            }}else if (b > a && a > c){
                System.out.println("Descending order of numbers: " + b + " " + a + " " + c);
            }else if (b > c && c > a){
                System.out.println("Descending order of numbers: " + b + " " + c + " " + a);
            }else if (a > b && b > c){
                System.out.println("Descending order of numbers: " + a + " " + b + " " + c);
            }else if (a > b && c > b){
                System.out.println("Descending order of numbers: " + a + " " + c + " " + b);
            }
        }
    }


