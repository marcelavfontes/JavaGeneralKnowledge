package com.company.algorithmexercises;

public class ProductOfArrayExceptSelf {
    /*
    Given an integer array nums, return an array answer such that answer[i] is
    equal to the product of all them elements of nums except nums[i].

    You must write an algorithm that runs in O(n) time
    and without using the division operation.

    Example:
    Input: [1,2,3,4]
    Output: [24,12,8,6]

    Input: [-1,1,0,-3,3]
    Output: [0,0,9,0,0]

    because we didn't use auxiliary arrays for prefix and postfix (used the result array
    to calculate the values) space complexity is constant.
    time complexity: O(n)
    space complexity: O(1)
     */

    public int[] productResult(int[] nums) {
        int[] result = new int[nums.length];
        int prefixValue = 1;
        int postfixValue = 1;

        for (int i = 0; i < nums.length; i++) {
            result[i] = prefixValue;
            prefixValue = prefixValue * nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = postfixValue * result[i];
            postfixValue = postfixValue * nums[i];
        }
        return result;
    }
}
