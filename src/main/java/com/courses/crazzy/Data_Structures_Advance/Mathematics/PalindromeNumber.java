package com.geekforgeeks.Data_Structures_Advance.Mathematics;

public class PalindromeNumber {

    public boolean checkForPalindrome(int number) {

        int originalNum = number;

        // Using String to concat the numbers in reverse order
        String reverse = "";

        while (number > 0) {
            int last = number % 10;
            reverse += last;

            number = number / 10;
        }

        if (Integer.valueOf(reverse) == originalNum) return true;

        return false;
    }
}
