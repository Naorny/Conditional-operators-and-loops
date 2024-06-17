package org.com;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //4. Enter two names from the keyboard, and if the names are the same,
        // display the message "The names are identical".
        // If the names are different but their lengths are equal,
        // display the message "The lengths of the names are equal".

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String name1 = scan.nextLine();
        System.out.print("Enter the second name: ");
        String name2 = scan.nextLine();

        if (name1.length() == name2.length()){
            if (name1 == name2){
             System.out.println("The names are identical");
            }else{
                System.out.println("The lengths of the names are equal");
            }}else{
                System.out.println("The names are different");

            }
        }
    }

