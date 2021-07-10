package com.geekforgeeks.Data_Structures_Advance.Hashing;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithSumGivenNo {

    // a0,a1,a2....ai-1,ai,ai+1,.....aj....an-1
    // or a0 .... ai-1 (sum) + ai .... aj (sum) == a0 .... aj (sum)
    // or x +  y = z
    // or z - y = x
    public boolean subArrayWithSumZero(int[] a, int sum) {

        int preSum = 0;

        Set<Integer> hs = new HashSet<>();
        for(int i=0; i < a.length; i++) {

            preSum+=a[i];

            if(hs.contains(preSum - sum)) {
                return true;
            }

            // if array contains 0 or sum of numbers is 0
            if(preSum == 0) {
                return true;
            }

            hs.add(preSum);

        }

        return false;
    }
}
