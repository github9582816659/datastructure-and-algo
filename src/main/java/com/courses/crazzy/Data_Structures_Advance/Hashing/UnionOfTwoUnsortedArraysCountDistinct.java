package com.geekforgeeks.Data_Structures_Advance.Hashing;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoUnsortedArraysCountDistinct {

    public int findUnionOfTwoUnsortedArraysCountDistinct(int[] a, int[] b) {

        Set<Integer> hs = new HashSet<>();
        for (int num:a) {
            hs.add(num);
        }

        for (int num:b) {
            hs.add(num);
        }

        return hs.size();
    }
}
