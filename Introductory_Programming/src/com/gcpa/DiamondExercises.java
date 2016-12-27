package com.gcpa;
import java.util.Scanner;

public class DiamondExercises {
    public static void isoscelesTriangle(int n) {
        String print = "";
        for (int i = 0; i < n; i = i + 1) {
            if (i == 0) print = "*";
            else print = print + "**";

            for (int j = n - i - 1; j > 0; j = j - 1) {
                System.out.print(" ");
            }
            System.out.println(print);
        }
    }

    public static void diamond(int n) {
        String print = "";
        for (int i = 0; i < n; i = i + 1) {
            if (i == 0) print = "*";
            else print = print + "**";
            for (int j = n - i - 1; j > 0; j = j - 1) {
                System.out.print(" ");
            }
            System.out.println(print);
        }

        for (int i = 1; i < n; i = i + 1) {
            print = print.substring(2);
            for (int j = i - 1; j >= 0; j = j - 1) {
                System.out.print(" ");
            }
            System.out.println(print);
        }
    }

    public static void diamondName(int n, String name) {
        String print = "";
        for (int i = 0; i < n; i = i + 1) {
            if (i == 0) print = "*";
            else print = print + "**";
            if (i == n-1) {
                System.out.println(name);
            }
            else {
                for (int j = n - i - 1; j > 0; j = j - 1) {
                    System.out.print(" ");
                }
                System.out.println(print);
            }
        }

        for (int i = 1; i < n; i = i + 1) {
            print = print.substring(2);
            for (int j = i - 1; j >= 0; j = j - 1) {
                System.out.print(" ");
            }
            System.out.println(print);
        }
    }

    public static void run() {
        Scanner input = new Scanner(System.in);
        int size;
        String name;

        System.out.print("Please type the size of the isosceles triangle and hit enter: ");
        size = input.nextInt();
        System.out.println("Isosceles triangle: ");
        isoscelesTriangle(size);
        System.out.println();

        System.out.print("Please type the size of the diamond and hit enter: ");
        size = input.nextInt();
        System.out.println("Diamond:");
        diamond(size);
        System.out.println();

        System.out.print("Please type the size of the diamond with your name and hit enter: ");
        size = input.nextInt();
        System.out.print("Please type your name and hit enter: ");
        name = input.next();
        System.out.println("Diamond with name:");
        diamondName(size, name);
        System.out.println();

        System.out.println("End of diamond exercises.");
    }
}