package com.courses.crazzy.Data_Structures_Basics.Arrays;

public class LargestElementInArray {

    // Find largest element in a Array : O(n)
    public int findLargestElementInArray(int[] arr) {

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }
}
