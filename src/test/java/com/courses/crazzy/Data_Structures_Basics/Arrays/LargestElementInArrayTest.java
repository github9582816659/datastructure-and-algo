package com.courses.crazzy.Data_Structures_Basics.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LargestElementInArrayTest {

    LargestElementInArray largestElementInArray;

    @BeforeEach
    void beforeEach() {
        largestElementInArray = new LargestElementInArray();
    }

    @Test
    void findLargestElement() {
        int arr[] = {3,8,12,5,6};
        int largestElementInArray = this.largestElementInArray.findLargestElementInArray(arr);
        System.out.println(largestElementInArray);
        assertTrue(largestElementInArray == 12);
    }

    @Test
    void findLargestElement_second() {
        int arr[] = {3,8,12,5,16,6};
        int largestElementInArray = this.largestElementInArray.findLargestElementInArray(arr);
        System.out.println(largestElementInArray);
        assertTrue(largestElementInArray == 16);
    }

    @Test
    void findLargestElement_third() {
        int arr[] = {3};
        int largestElementInArray = this.largestElementInArray.findLargestElementInArray(arr);
        System.out.println(largestElementInArray);
        assertTrue(largestElementInArray == 3);
    }

    @Test
    void findLargestElement_fourth() {
        int arr[] = {0};
        int largestElementInArray = this.largestElementInArray.findLargestElementInArray(arr);
        System.out.println(largestElementInArray);
        assertTrue(largestElementInArray == 0);
    }

    @Test
    void findLargestElement_fifth() {
        int arr[] = {0,-1,-3,2,5};
        int largestElementInArray = this.largestElementInArray.findLargestElementInArray(arr);
        System.out.println(largestElementInArray);
        assertTrue(largestElementInArray == 5);
    }
}