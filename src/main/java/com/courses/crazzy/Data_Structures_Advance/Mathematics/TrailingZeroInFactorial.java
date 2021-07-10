package com.geekforgeeks.Data_Structures_Advance.Mathematics;

public class TrailingZeroInFactorial {

    public int findTrailingZeroInFactorial(int number) {

        int result = 1;

        for (int i = 2; i <= number; i++) {
            result = result * i;
        }

        int count = 0;
        while (result > 0) {
            if (result%10 == 0) {
                count++;
            }

            result = result/10;
        }

        return count;
    }

    public int findTrailingZeroInFactorialEfficientSolution(int number) {

        int res = 0;

        for (int i = 5; i <= number; i=i*5) {
            res = res + number/i;
        }

        return res;

    }
}
