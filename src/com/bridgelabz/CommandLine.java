package com.bridgelabz;

import java.util.Scanner;

public class CommandLine {
    public static void main(String[] args) {

        Scanner ref = new Scanner(System.in);
        System.out.print("Write any name here:- ");
        String s=ref.nextLine();
        System.out.println("Your given name is:- " +s);
    }
}