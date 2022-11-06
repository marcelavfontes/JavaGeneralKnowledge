package com.company.algorithmexercises;

import java.util.HashMap;

public class TwoSum {
    /*
    Given an array of integers, return indices of the two numbers such that they add up
    to a specific target.

    You may assume that each input would have exactly one solution, and you may not use
    the same element twice.

    Example:
    Given nums = [2, 7, 11, 15], target = 9
    Because nums[0] + nums[1] = 2+ 7 = 9
    return [0,1]

    time complexity: O(n)
    space complexity: O(n)
    */

    public int [] twoSumResult(int [] nums, int targetSum) {
        HashMap<Integer, Integer> mappedSoFar = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int diff = targetSum - nums[i];
            if(mappedSoFar.get(diff) != null) {
                result[0] = mappedSoFar.get(diff);
                result[1] = i;
                return result;
            }
            mappedSoFar.put(nums[i], i);
        }

        return result;
    }
}
