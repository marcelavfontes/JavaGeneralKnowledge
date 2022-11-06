package com.company.algorithmexercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    void shouldReturnTrueForDuplicates() {
        //given
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
//        int[] nums = {1,2,3,1};
//        int[] nums = {1,2,3,4,2,3};
        int[] nums = {1,2,3,4,5,2};

        //when
        boolean result = containsDuplicate.containsDuplicateResult(nums);

        //then
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseForNonDuplicateValues() {
        //given
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = {1,2,3,4};

        //when
        boolean result = containsDuplicate.containsDuplicateResult(nums);

        //then
        assertFalse(result);
    }
}