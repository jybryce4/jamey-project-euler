/*
 * Project Euler Problem 2 This program finds the sum of the even-valued
 * Fibonacci numbers under four million
 * 
 * Solution by Jamey Bryce
 */

package com.brycejamey.problem2;

public class EvenFibo {
    public static void main(String[] args) {

        // System.out.println(sum);

    }

    public int fibbSumm() {

        final int FOUR_MIL = 4000000; // declared final to avoid hard-coding four million

        int sum = 0;

        int num1;
        int num2;

        int counter;

        int fibNum = 0;

        for (int i = 0; i <= FOUR_MIL; i++) {
            num1 = i;
            num2 = i + 1;
            fibNum = num1 + num2;

            if (fibNum % 2 == 0) {
                sum += fibNum;
            }
        }

        return sum;
    }
}
