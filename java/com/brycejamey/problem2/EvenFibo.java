/*
 * Project Euler Problem 2 
 * @ http://projecteuler.net/problem=2
 * 
 * This program finds the sum of the even-valued
 * Fibonacci numbers under four million
 * 
 * Solution by Jamey Bryce
 */

package com.brycejamey.problem2;

public class EvenFibo {

    public static void main(String[] args) {
        //FibbnoacciNumber fibo = new FibonacciNumber(n1, n2);

        final int FOUR_MIL = 4000000; 

        int fibNum = 1;
        int sum = 0;

        int num1;
        int num2 = 0;

        for (int i = 0; i < 10; i++) {
            num1 = ; //having some difficulties will proceed with other idea (FibonacciNumber.java)

            System.out.println("Num1: " + num1); // "debugger"

            num2 = fibNum++ - num1;

            fibNum = num1 + num2;
            System.out.println("Fibo: " + fibNum); // "debugger"

            if (fibNum % 2 == 0) {
                sum += fibNum;
                System.out.println("Sum: " + sum);
            }
        }

    }

}