/* 
* This file (and all other files that may be in this package)
* are designed to assist in the testing and experimentation 
* that may be required for the solutions to Project Euler
*
* Author: Jamey Bryce
*
*/ 

public class Debugger {
    public static void public static void main(String[] args) {

        //Trying to work out the logic for problem 2:
        int num1;
        int num2;
        int fibNum = 0;

        int sum = 0; // will hold the answer
        while (fibNum < FOUR_MIL) {
            num1 = fibNum;
            num2 = num1 + 1;
            fibNum = num1 + num2;

            if (fibNum % 2 == 0) {
                sum += fibNum;
            }
        }

        System.out.println(sum);
    }
}