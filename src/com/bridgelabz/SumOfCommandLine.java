package com.bridgelabz;

import java.util.Scanner;

public class SumOfCommandLine {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int s = input.nextInt();
        int r = input.nextInt();
        int sum = s + r;
        System.out.println("Sum is " + sum);
    }
}