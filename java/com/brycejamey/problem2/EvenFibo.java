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

        final int FOUR_MIL = 4000000; // to prevent hard coding

        long fibNum1 = 1;
        long fibNum2 = 1;
        long evenSum = 0; // answer at the end

        long currentFibNum = 0;
        while (currentFibNum < FOUR_MIL) {
            if ((currentFibNum % 2) == 0) {
                evenSum += currentFibNum;
            }

            currentFibNum = fibNum1 + fibNum2;
            fibNum2 = fibNum1;
            fibNum1 = currentFibNum;
        }

        System.out.println(evenSum);

    }

}