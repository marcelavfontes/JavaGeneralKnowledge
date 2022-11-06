package com.company.algorithmexercises;

public class SlidingWindow {
    /*
    Best time to buy and sell stock

    buy low, sell high. Design an algorithm to find the maximum profit.
    Note that you cannot sell a stock before you nuy one.

    Example:
    Input: [7, 1, 5, 3, 6, 4]
    Output: 5
    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
    Not 7-1 = 6, as selling price needs to be larger than buying price.

    time complexity: O(n)
    space complexity: O(1)
    */

    public int slidingWindowResult(int[] prices) {
        int leftPointer = 0;
        int leftValue = 0;
        int rightValue = 0;
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            leftValue = prices[leftPointer];
            rightValue = prices[i];

            if ((leftValue < rightValue)) {
                if (maxProfit < (rightValue - leftValue)) {
                    maxProfit = rightValue - leftValue;
                }
            } else {
                leftPointer = i;
            }
        }
        return maxProfit;
    }

    public int anotherSolution(int[] prices) {
        int l = 0;
        int r = 1;
        int maxProfit = 0;

        while (l <= r) {
            if (prices[l] < prices[r]) {
                int newProfit = prices[r] - prices[l];
                if (maxProfit < newProfit) {
                    maxProfit = newProfit;
                }
            } else {
                l = r;
            }
            r++;
        }
        return maxProfit;
    }
}
