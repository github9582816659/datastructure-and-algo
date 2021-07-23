package com.courses.crazzy.Object_Oriented_Design.Introduciton_To_Classes_And_Objects;

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
