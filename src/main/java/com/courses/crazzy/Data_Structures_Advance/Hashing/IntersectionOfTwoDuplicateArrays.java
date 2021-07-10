package com.geekforgeeks.Data_Structures_Advance.Hashing;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoDuplicateArrays {

    public int findIntersectionOfTwoDuplicateArrays(int[] a, int[] b) {

        // int[] a = {10,20,10,30}
        // int[] b = {20,10,10,40}

        // sort any 1 array and then loop from other, once find match, increase count and remove that element from the set
        Set<Integer> hs = new HashSet<>();
        for (int num: a) {
            hs.add(num);
        }
        int count = 0;
        for (int num: b) {
            if (hs.contains(num)) {
                count++;
                hs.remove(num);
            }
        }

        return count;
    }
}
