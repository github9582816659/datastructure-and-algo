package com.geekforgeeks.Data_Structures_Advance.Hashing;

import java.util.HashMap;

public class FrequencyOfEachElementInArrayAnyOrder {

    public HashMap<Integer,Integer> frequencyOfEachElementInArrayAnyOrder(int[] a) {

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num: a) {
            hm.put(num, hm.getOrDefault(num,0)+1);
        }

        return hm;
    }
}
