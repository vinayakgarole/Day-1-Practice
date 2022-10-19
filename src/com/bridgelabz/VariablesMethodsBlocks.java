package com.bridgelabz;

public class VariablesMethodsBlocks {

    static int a = 20;     // VARIABLE

    static void display()   // METHOD
    {
        System.out.println("This is my static method");
    }

    static {
        System.out.println("This is my static block");   // BLOCK
    }
}
class demo2 {
    public static void main(String[] args) {
        System.out.println("This is my static variable " + VariablesMethodsBlocks.a);
        VariablesMethodsBlocks.display();
    }
}