package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	Sorting arr = new Sorting();
	System.out.print("Array number: ");
	int n= in.nextInt();
    int[] array = new int [n];

    //Bubble sort
    arr.createArray(array);
    System.out.print("Array: ");
    arr.printArray(array);
    arr.bubbleSort(array);
    System.out.print("Bubble Sort: ");
    arr.printArray(array);
    arr.createArray(array);

    //QuickSort
    System.out.print("Array: ");
    arr.printArray(array);
    int low = 0;
    int high = array.length - 1;
    System.out.print("Quick Sort: ");
    arr.quickSort(array, low, high);
    System.out.print("Quick Sort: ");
    arr.printArray(array);
    }
}
