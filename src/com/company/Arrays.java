package com.company;

public class Arrays {

    public Arrays() {
        //
    }
    int[] arr1 = {1,2,3,4,5}; // known data array

    int[] arr2 = new int[10]; // by default all data will be zero

    public void arrayOperations() {
        System.out.println(arr1); // this is will not print the array and its elements
        System.out.println(arr2); // this will print reference var containing hashcode for real array contents
        System.out.println(arr1[1] + "\n"); // this prints the array element which is at index 1 (indexing starts from zero)

        for (int i : arr1) {
            System.out.print(arr1[i-1] + " ");
        }
    }
}
