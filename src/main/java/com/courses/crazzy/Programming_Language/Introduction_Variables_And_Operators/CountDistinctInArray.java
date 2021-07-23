package com.courses.crazzy.Programming_Language.Introduction_Variables_And_Operators;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountDistinctInArray {

    // Count Distinct in an Array : Create HashSet which remove duplicates
    public int countDistinctInArray(int[] a) {
        Set<Integer> hs = new HashSet<Integer>(IntStream.of(a).boxed().collect(Collectors.toList()));
        return hs.size();
    }
}
