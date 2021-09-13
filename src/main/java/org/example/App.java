package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //declare variables
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        //scan user input
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();

        //determine if numbers are the same
        if((a == b) || (a == c) || (b == c)) {
            System.out.println("Please enter 3 different numbers next time.");
            System.exit(0);
        }
        //if not, find the biggest number
        else if((a > b) && (a > c))
            System.out.println("The largest number is " + a + ".");
        else if((b > a) && (b > c))
            System.out.println("The largest number is " + b + ".");
        else
            System.out.println("The largest number is " + c + ".");

        sc.close();
    }
}