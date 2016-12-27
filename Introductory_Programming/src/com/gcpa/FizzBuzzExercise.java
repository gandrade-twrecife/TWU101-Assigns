package com.gcpa;

public class FizzBuzzExercise {
    public static void FizzBuzz() {
        for (int i = 1; i < 101; i = i + 1) {
            if (i%3 == 0 || i%5 == 0) {
                if (i%3 == 0) {
                    System.out.print("Fizz");
                }
                if (i%5 == 0) {
                    System.out.print("Buzz");
                }
            }
            else System.out.print(i);
            System.out.println();
        }
    }

    public static void run() {
        FizzBuzz();
        System.out.println("End of FizzBuzz exercise. ");
    }
}