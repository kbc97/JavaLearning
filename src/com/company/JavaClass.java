package com.company;

public class JavaClass {
//    constructor
    public JavaClass() {
        System.out.println("Constructor which gets automatically called when object created");
    }

    int k = 9;
    public void printField() {
        System.out.println("Value of k:" + this.k);
    }
}
