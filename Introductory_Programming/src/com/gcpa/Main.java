package com.gcpa;

public class Main {

    public static void main(String[] args) {
        System.out.println("Triangle exercises:");
        TriangleExercises triangle = new TriangleExercises();
        triangle.run();

        System.out.println();
        System.out.println("Diamond exercises:");
        DiamondExercises diamond = new DiamondExercises();
        diamond.run();

        System.out.println();
        System.out.println("FizzBuzz exercise:");
        FizzBuzzExercise fizzbuzz = new FizzBuzzExercise();
        fizzbuzz.run();

        System.out.println();
        System.out.println("Prime factors exercise:");
        PrimeFactorsExercise prime_factors = new PrimeFactorsExercise();
        prime_factors.run();

    }
}
