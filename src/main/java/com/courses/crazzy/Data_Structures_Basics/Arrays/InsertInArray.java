package com.courses.crazzy.Data_Structures_Basics.Arrays;

public class InsertInArray {

    // Insert an element in a Array : O(n)
    // Best case when we need to insert element at end : O(1)
    // Start with moving last index by 1 until we reach index at which we want to insert new element
    public int[] insertInArray(int[] arr, int newNo, int atIndex) {
        atIndex = atIndex-1;
        int length = arr.length;
        // length 5 means last index is 4 (0-4), and we need to start from last index - 1 as we need to move by 1
        // that's why we have length - 2 below
        for (int i = length-2; i >= atIndex; i--) {
            arr[i+1] = arr[i];
        }

        arr[atIndex] = newNo;

        return arr;
    }
}
