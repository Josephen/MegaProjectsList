package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        EratosthenesSolution ob = new EratosthenesSolution();
        System.out.print("Enter Range: ");
        int number = in.nextInt();
        ob.primeNumbers(number);
    }
}
