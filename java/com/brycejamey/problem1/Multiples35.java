/* 
* Project Euler Problem 1
* @ http://projecteuler.net/problem=1
*
* This program finds the sum of all the multiples of 3 or 5 below 1000
*
* Solution by Jamey Bryce
*/
package com.brycejamey.problem1;

public class Multiples35 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);

    }
}