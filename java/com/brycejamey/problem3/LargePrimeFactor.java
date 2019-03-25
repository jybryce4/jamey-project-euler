/*
 * Project Euler Problem 3
 * @ http://projecteuler.net/problem=3
 * 
 * This program finds the largest prime factor of 600851475143
 * 
 * Solution by Jamey Bryce
 */

package com.brycejamey.problem3;

public class LargePrimeFactor {
    /*
     * A composite number N can be represented as a product of its prime factors
     * General: N = p1 * p2 * p3 * ... pn-1 * pn, where n > 0 and n is an integer
     * 
     * I want the LARGEST factor. The method below takes a long as an argument and
     * returns the largest prime factor of it.
     * 
     */
    public static long findFactors(long n) {
        long number = n;
        long largestPrimeDivisor = 0;

        int count = 2;
        while (count * count <= number) {
            if (number % count == 0) {
                number /= count;
                largestPrimeDivisor = count;
            } else {
                count++;
            }
        }
        if (number > largestPrimeDivisor) {
            largestPrimeDivisor = number;
        }

        return largestPrimeDivisor;
    }

    public static void main(String[] args) {
        // Set-up
        long N = 600851475143L;

        System.out.println(findFactors(N));
    }
}