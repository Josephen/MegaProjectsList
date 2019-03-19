package com.company;

public class Collatz {
    private int steps =0;
    void CollatzCalculate (int number) {
        steps++;
        steps++;
        if (number % 2 == 0)
            number = number / 2;
        else
            number = number*3+1;
        if (number == 1) {
            System.out.println("Number equal 1!");
            System.out.println("Number of steps: " + steps);
        }
        else {
            System.out.println(number + ' ');
            CollatzCalculate(number);
        }
    }
}
