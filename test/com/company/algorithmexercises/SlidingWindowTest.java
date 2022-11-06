package com.company.algorithmexercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlidingWindowTest {

    @Test
    void shouldFindMaxValue5() {
        //given
        SlidingWindow slidingWindow = new SlidingWindow();
        int[] prices = {7, 1, 5, 3, 6, 4};
//        int[] prices = {10, 2, 5, 3, 4, 1, 6};

        //when
        int result = slidingWindow.slidingWindowResult(prices);

        //then
        assertEquals(5, result);
    }
}