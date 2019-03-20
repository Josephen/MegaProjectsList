package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        NumbersOperation op = new NumbersOperation();
        int checker;
        int num;
        System.out.println("Enter number:" +"\n" +
                            "1 - PI to the Nth digit" +"\n" +
                            "2 - E to the Nth digit" + "\n" +
                            "3 - Fibonacci sequence" + "\n" +
                            "4 - Prime Factorization");
        checker = In.nextInt();
        switch (checker) {
            case 1: System.out.print("Enter digit number: ");
                    num = In.nextInt();
                    System.out.println(op.piDigits(num));
                    break;
            case 2: System.out.print("Enter digit number: ");
                    num = In.nextInt();
                    System.out.println(op.eDigits(num));
                    break;
            case 3: System.out.print("Enter number to Fibonacci Sequence: ");
                    num = In.nextInt();
                    op.fibonacciSequence(num);
                    break;
            case 4: System.out.print("Enter number: ");
                    num = In.nextInt();
                    op.primeFactor(num);
        }
    }
}
