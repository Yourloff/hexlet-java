package org.power_of_three;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(0)); // false
        System.out.println(isPowerOfThree(1)); // true
        System.out.println(isPowerOfThree(3)); // true
        System.out.println(isPowerOfThree(6)); // false
        System.out.println(isPowerOfThree(9)); // true
        System.out.println(isPowerOfThree(27)); // true
        System.out.println(isPowerOfThree(81)); // true
        System.out.println(isPowerOfThree(111)); // false
    }

    public static Boolean isPowerOfThree(int number) {
        int i = 0;

        while (i < number) {
            int pow = (int) Math.pow(3, i);

            if (pow == number) {
                return true;
            } else if(pow > number) {
                return false;
            }
            i++;
        }
        return false;
    }
}
