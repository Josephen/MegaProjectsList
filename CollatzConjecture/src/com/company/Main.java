package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Collatz ob = new Collatz();
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        ob.CollatzCalculate(num);
    }
}
