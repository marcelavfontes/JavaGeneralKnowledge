package com.company.algorithmexercises;

public class MaximumSubarray {
    /*
    Given an integer array nums, find the contiguous subarray (containing at least one number)
    which has the largest sum and return its sum

    Example:
    Input: [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    [4,-1,2,1] has the largest sum = 6
     */

    public int MaximumSubarrayResult(int[] nums){
        int maxSub = nums[0];
        int curSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if(curSum < 0){
                curSum = 0;
            }
            curSum += nums[i];
            if (maxSub < curSum){
                maxSub = curSum;
            }
        }
        return maxSub;
    }
}
