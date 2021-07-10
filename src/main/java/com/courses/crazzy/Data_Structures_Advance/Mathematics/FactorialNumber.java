package com.geekforgeeks.Data_Structures_Advance.Mathematics;

public class FactorialNumber {

    public int findFactorial(int number) {

        int result = 1;

        for (int i = 2; i <= number; i++) {
            result = result * i;
        }

        return result;
    }
}
