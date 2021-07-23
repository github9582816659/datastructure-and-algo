package com.courses.crazzy.Data_Structures_Basics.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class InsertInArrayTest {

    InsertInArray insertInArray;
    int[] arr = new int[5];


    @BeforeEach
    void beforeEach() {
        insertInArray = new InsertInArray();
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 20;
    }

    @Test
    void searchInArray_present() {
        int newNo = 7;
        int atIndex = 2;
        int[] nums = insertInArray.insertInArray(arr, newNo, atIndex);
        assertTrue(nums[1] == 7);
    }

    @Test
    void searchInArray_not_present() {
        int newNo = 3;
        int atIndex = 2;
        int[] nums = insertInArray.insertInArray(arr, newNo, atIndex);
        assertTrue(nums[1] == 3);
    }
}