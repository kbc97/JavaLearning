package com.company;

public class IterativeConditionalStatements {
    public IterativeConditionalStatements() {
        System.out.println("Iterative Statements");
    }

    int number = 0, maxMultiplier = 11;

    public void tableOfNumber(int number, String loop) {
        switch (loop.toLowerCase()) {
            case "for":
                forLoop(number);
                break;
            case "while":
                whileLoop(number);
                break;
            case "dowhile":
                doWhileLoop(number);
                break;
            default:
                System.out.println("Key: \"" + loop + "\" does not match");
                break;
        }

}

    private void doWhileLoop(int number) {

        System.out.println("\nArithmetic Table of Number (via DO WHILE Loop): " + number + "\n");
        if (number<=0) {
            System.out.println("Please set the number more than Zero. Current value of number is: " + number);
        }
        else {
            int i=1;
            do {
                System.out.println(number + " multiplied by " + i + " is: " + number*i);
                i++;
            } while (i<maxMultiplier);
        }
    }

    private void whileLoop(int number) {

        System.out.println("Arithmetic Table of Number (via WHILE Loop): " + number + "\n");
        if (number<=0) {
            System.out.println("Please set the number more than Zero. Current value of number is: " + number);
        }
        else {
            int i=1;
            while(i<maxMultiplier) {
                System.out.println(number + " multiplied by " + i + " is: " + number*i);
                i++;
            }
        }
    }

    private void forLoop(int number) {

        System.out.println("Arithmetic Table of Number (via FOR Loop): " + number + "\n");
        if (number<=0) {
            System.out.println("Please set the number more than Zero. Current value of number is: " + number);
        }
        else {
            for (int i=1;i<maxMultiplier;i++) {
                System.out.println(number + " multiplied by " + i + " is: " + number*i);
            }
        }
    }
}
