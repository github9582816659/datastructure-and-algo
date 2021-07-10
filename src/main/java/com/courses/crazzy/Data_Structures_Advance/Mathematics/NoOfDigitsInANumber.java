package com.geekforgeeks.Data_Structures_Advance.Mathematics;

import org.springframework.stereotype.Component;

@Component
public class NoOfDigitsInANumber {

    public int findNoOfDigits(int number) {

        // Count No Of Digites
        int count = 0;

        // Loop unit Number become Zero
        while (number > 0) {

            // Divide no by 10 will give no of times it runs & %10 will give remainder
            number = number/10;
            count++;
        }

        return count;
    }
}
