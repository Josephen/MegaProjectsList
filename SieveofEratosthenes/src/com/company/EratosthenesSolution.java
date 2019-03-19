package com.company;

public class EratosthenesSolution {
    void primeNumbers (int num) {
        boolean array[] = new boolean[num+1];
        for (int i = 0; i < array.length; i++)
            array[i] = true;

        for (int j = 2; j*j <= num; j++)
                for (int i = j*j; i <= num; i+=j)
                    array[i]=false;

        for (int i=2; i <= num; i++)
            if (array[i] == true)
                System.out.print(i + " ");
    }
}
