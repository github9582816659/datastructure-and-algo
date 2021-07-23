package com.courses.crazzy.Data_Structures_Basics.Arrays;

public class DeleteInArray {

    // Delete an element in a Array : O(n)
    public int[] insertInArray(int[] arr, int item) {

        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                break;
            }
        }

        if (i == arr.length-1) {
            return arr;
        }

        for (int j = i; j < arr.length-1; j++) {
             arr[j] = arr[j+1];
        }

        arr[arr.length-1] = 0;

        return arr;
    }
}
