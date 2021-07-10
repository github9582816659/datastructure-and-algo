package com.geekforgeeks.Data_Structures_Advance.Hashing;

import java.util.HashSet;
import java.util.Set;

public class PairToFindSumInArray {

    public boolean pairToFindSumInArray(int[] a, int sum) {

        Set<Integer> hs = new HashSet<>();

        for (int num: a) {
            if(!hs.contains(sum - num)) {
                hs.add(num);
            } else {
                return true;
            }
        }

        return false;
    }
}
