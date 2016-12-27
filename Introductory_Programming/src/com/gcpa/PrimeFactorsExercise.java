package com.gcpa;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactorsExercise {
    public static List<Integer> generate(int n) {
        List<Integer> primeFactors = new ArrayList<>();
        List<Integer> primes = new ArrayList<>();

        if (n > 1) {
            for (int i = 2; i < n + 1; i = i + 1) {
                if (checkPrime(primes, i)) {
                    primes.add(i);
                    if (n % i == 0) primeFactors.add(i);
                }
            }
        }
        return primeFactors;
    }

    public static boolean checkPrime(List<Integer> primeList, int number) {
        for (int i = 0; i < primeList.size(); i = i + 1) {
            if (number % primeList.get(i) == 0) return false;
        }
        return true;
    }

    public static void run() {
        Scanner input = new Scanner(System.in);
        int number;
        List<Integer> returnList;

        System.out.print("Type a number to generate its prime factors and hit enter: ");
        number = input.nextInt();
        returnList = generate(number);

        System.out.println("The list of prime factors generated is:");
        if (returnList.isEmpty()) {
            System.out.println("The list is empty. ");
        }
        else {
            for (int i = 0; i < returnList.size(); i = i + 1) {
                if (i == 0) {
                    System.out.print(returnList.get(i));
                }
                else {
                    System.out.print("," + returnList.get(i));
                }
                if (i == returnList.size() - 1) {
                    System.out.println();
                }
            }
        }

        System.out.println("End of prime factors exercise.");
    }
}
