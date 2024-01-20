package org.example;

import java.util.Scanner;

public class Master {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        int c =a+b;
        System.out.println("Addition of both number:" +c);
        int d= a-b;
        System.out.println("Subtraction of both number:" +d);
    }


}
