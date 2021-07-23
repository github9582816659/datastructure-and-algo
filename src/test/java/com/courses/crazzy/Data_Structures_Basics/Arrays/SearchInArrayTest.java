package com.courses.crazzy.Data_Structures_Basics.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SearchInArrayTest {

    SearchInArray searchInArray;

    @BeforeEach
    void beforeEach() {
        searchInArray = new SearchInArray();
    }

    @Test
    void searchInArray_present() {
        int arr[] = {1,2,3,4,5};
        int num = 4;
        int result = searchInArray.searchInArray(arr, num);
        assertTrue(result > 0);
    }

    @Test
    void searchInArray_not_present() {
        int arr[] = {1,2,3,4,5};
        int num = 6;
        int result = searchInArray.searchInArray(arr, num);
        assertTrue(result == -1);
    }
}