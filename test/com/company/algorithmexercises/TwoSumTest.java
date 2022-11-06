package com.company.algorithmexercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void shouldFindTwoNumbersForTarget9() {
        //given
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};

        //when
        int[] result = twoSum.twoSumResult(nums, 9);

        //then
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    void shouldFindAnotherTwoNumbersForTarget9() {
        //given
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 11, 20, 7, 15};

        //when
        int[] result = twoSum.twoSumResult(nums, 9);

        //then
        assertEquals(0, result[0]);
        assertEquals(3, result[1]);
    }
}