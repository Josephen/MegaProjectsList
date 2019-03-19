package com.company;

public class Sorting {
    void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    void quickSort(int[] arr, int low, int high) {
        if (arr.length == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        int prop = arr[middle];
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < prop) {
                i++;
            }
            while (arr[j] > prop) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(arr, low, j);
        if (high > i)
            quickSort(arr, i, high);
    }

    void printArray(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    void createArray( int[] arr) {
        for (int i = 0; i<arr.length; i++)
            arr[i] = (int) (Math.random()*100);
    }
}
