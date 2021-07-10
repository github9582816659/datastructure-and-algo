package com.geekforgeeks.Data_Structures_Advance.Mathematics;

public class GCD {

    public int findGCD(int num1, int num2) {

        // find min of num1 & num2, then loop from min until we find no which divides both
        int min = Math.min(num1, num2);

        int result = 1;
        for (int i = min; min > 0 ; min--) {
            if (num1%min == 0 && num2%min == 0) {
                result = min;
                break;
            }
        }

        return result;
    }


    public int findGCDEuclideanAlgo(int num1, int num2) {

        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }

        return num1;
    }

}
