/*
 * This class defines a FibonacciNumber object in order to improve code readability
 * in the main class
 * 
 * Author: Jamey Bryce
 */

public class FibonacciNumber {

    private int num1;
    private int num2;

    public FibonacciNumber(int num1, int num2) { // two integers representing the two previous numbers
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

}
