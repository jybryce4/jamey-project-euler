/*
 * Project Euler Problem 3
 * @ http://projecteuler.net/problem=3
 * 
 * This program finds the largest prime factor of 600851475143
 * 
 * Solution by Jamey Bryce
 */

package com.brycejamey.problem3;

import java.math.BigInteger;

public class LargePrimeFactor {
    /*
     * A composite number N can be represented as a product of its prime factors
     * General: N = p1 * p2 * p3 * ... pn-1 * pn, where n > 0 and n is an integer
     * 
     * The method below takes a BigInteger as an argument and returns the largest
     * prime factor of it.
     */
    public static long findFactors(BigInteger n) {
        Long number = n.longValue();
        Long largestPrimeDivisor = (long) 0;
        for (Long index = (long) 0; index < number; index++) {
            if (number % index == 0 && isPrimeDivisor(number) && index > largestPrimeDivisor) {
                largestPrimeDivisor = index;
            }
        }

        return largestPrimeDivisor;
    }

    public static boolean isPrimeDivisor(Long n) {
        Long size = (long) 0;
        for (Long index = n; index > 0; index--) {
            if (n % index == 0) {
                size++;
            }
        }

        if (size == 2) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        // Set-up
        String NUM = "600851475143L";
        final BigInteger N = new BigInteger(NUM);

        System.out.println(findFactors(N));
    }
}