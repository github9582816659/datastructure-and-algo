package com.courses.crazzy.Data_Structures_Basics.Arrays;

public class ArrayIsSortedOrNot {

    // Find largest element in a Array : O(n)
    public boolean arrayIsSortedOrNot(int[] arr) {

        boolean isSorted = true;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                isSorted = false;
                break;
            }
        }

        return isSorted;
    }
}
