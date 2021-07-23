package com.courses.crazzy.Data_Structures_Basics.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DeleteInArrayTest {

    DeleteInArray deleteInArray;

    @BeforeEach
    void beforeEach() {
        deleteInArray = new DeleteInArray();
    }

    @Test
    void deleteInArray_first() {
        int arr[] = {3,8,12,5,6};
        int item = 12;
        int[] nums = deleteInArray.insertInArray(arr, item);
        System.out.println(Arrays.toString(nums));
        assertTrue(nums[2] == 5);
    }

    @Test
    void deleteInArray_second() {
        int arr[] = {3,8,12,5,6};
        int item = 8;
        int[] nums = deleteInArray.insertInArray(arr, item);
        System.out.println(Arrays.toString(nums));
        assertTrue(nums[1] == 12);
    }
}