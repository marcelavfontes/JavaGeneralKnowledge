package com.company.algorithmexercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {

    @Test
    void shouldReturnCorrectResult() {
        //given
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        int[] input = {1,2,3,4};

        //when
        int[] result = productOfArrayExceptSelf.productResult(input);

        //then
        assertEquals(24,result[0]);
        assertEquals(12,result[1]);
        assertEquals(8,result[2]);
        assertEquals(6,result[3]);
    }

    @Test
    void shouldReturnCorrectResult2() {
        //given
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        int[] input = {-1,1,0,-3,3};

        //when
        int[] result = productOfArrayExceptSelf.productResult(input);

        //then
        assertEquals(0,result[0]);
        assertEquals(0,result[1]);
        assertEquals(9,result[2]);
        assertEquals(0,result[3]);
        assertEquals(0,result[4]);
    }
}