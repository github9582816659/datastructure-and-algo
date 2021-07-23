package com.courses.crazzy.Data_Structures_Basics.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayIsSortedOrNotTest {

    ArrayIsSortedOrNot arrayIsSortedOrNot;

    @BeforeEach()
    void beforeEach() {
        arrayIsSortedOrNot = new ArrayIsSortedOrNot();
    }

    @Test
    void setArrayIsSortedOrNot() {
        int arr[] = {1,2,3,4,5};
        boolean result = arrayIsSortedOrNot.arrayIsSortedOrNot(arr);
        System.out.println(result);
        assertTrue(result);
    }

    @Test
    void setArrayIsSortedOrNot_second() {
        int arr[] = {1,2,3,4,6,5};
        boolean result = arrayIsSortedOrNot.arrayIsSortedOrNot(arr);
        System.out.println(result);
        assertFalse(result);
    }

    @Test
    void setArrayIsSortedOrNot_third() {
        int arr[] = {1};
        boolean result = arrayIsSortedOrNot.arrayIsSortedOrNot(arr);
        System.out.println(result);
        assertTrue(result);
    }
}