package com.courses.crazzy.Data_Structures_Basics.Arrays;

public class SearchInArray {

    // Search an element in a Array : O(n)
    public int searchInArray(int[] a, int num) {

        for (int i = 0; i < a.length; i++) {
            if(a[i] == num) return i;
        }

        return -1;
    }
}
