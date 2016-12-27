package com.gcpa;
import java.util.Scanner;

public class TriangleExercises {
    public static void easiestExerciseEver() {
        System.out.println("*");
    }

    public static void drawHorizontalLine(int n) {
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void drawVerticalLine(int n) {
        for (int i = 0; i < n; i = i + 1) {
            System.out.println("*");
        }
    }

    public static void drawRightTriangle(int n) {
        String print = "";
        for (int i = 0; i < n; i = i + 1) {
            print = print + "*";
            System.out.println(print);
        }
    }

    public static void run() {
        Scanner input = new Scanner(System.in);
        int size;

        System.out.println("Easiest exercise ever:");
        easiestExerciseEver();
        System.out.println();

        System.out.print("Please type the size of the horizontal line and hit enter: ");
        size = input.nextInt();
        System.out.println("Draw a horizontal line:");
        drawHorizontalLine(size);
        System.out.println();

        System.out.print("Please type the size of the vertical line and hit enter: ");
        size = input.nextInt();
        System.out.println("Draw a vertical line:");
        drawVerticalLine(size);
        System.out.println();

        System.out.print("Please type the size of the right triangle and hit enter: ");
        size = input.nextInt();
        System.out.println("Draw a right triangle:");
        drawRightTriangle(size);
        System.out.println();

        System.out.println("End of triangle exercises.");
    }
}