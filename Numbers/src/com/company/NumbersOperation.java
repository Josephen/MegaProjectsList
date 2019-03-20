package com.company;
import java.text.NumberFormat;


public class NumbersOperation {
    NumberFormat nf = NumberFormat.getInstance();

    String piDigits (int number) {
        nf.setMaximumFractionDigits(number);
        return nf.format(Math.PI);
    }

    String eDigits (int number) {
        nf.setMaximumFractionDigits(number);
        return nf.format(Math.E);
    }

    void fibonacciSequence( int number) {
        int num1 = 1;
        int num2 = 1;
        int nextnum;
        System.out.print(num1);
        while (num2 <= number) {
            nextnum = num1 + num2;
            num1 = num2;
            num2 = nextnum;
            System.out.print(", "+num1);
        }
    }

    int isPrime (int number, int start) {
        for (int i = start; i*i <= number; i+=2)
            if(number%i == 0 )
                return i;
            return number;
    }

    void primeFactor (int number) {
        int start = 3;
        while (number != 1)
        if (number %2 == 0) {
            System.out.print("2, ");
            number=number/2;
        }
        else {
            start = isPrime(number, start);
            number/=start;
            System.out.print(start + ", ");
        }
    }
}
