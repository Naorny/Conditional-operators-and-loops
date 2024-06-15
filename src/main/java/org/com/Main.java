package org.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. Enter two numbers from the keyboard and display the minimum of them.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scan.nextInt();
        System.out.print("Enter the second number: ");
        int b = scan.nextInt();
        if (a!=b){
            if (a>b) {
                System.out.println("Minimum is " + b);
            }else{
                System.out.println("Minimum is " + a);
            }}else{
                System.out.println("The numbers are equal");
            }
        }
    }




