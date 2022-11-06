package com.company.algorithmexercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {

    @Test
    void shouldReturnMaxSumOfSubArray() {
        //given
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int[] input = {-2,1,-3,4,-1,2,1,-5,4};

        //when
        int result = maximumSubarray.MaximumSubarrayResult(input);

        //then
        assertEquals(6, result);
    }
}