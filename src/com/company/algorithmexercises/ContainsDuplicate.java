package com.company.algorithmexercises;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    /*
    Given an integer array nums, return true if any value appears at least twice
    in the array, and return false if every element is distinct

    Example:
    Input: [1,2,3,1]
    Output: true

    Input: [1,2,3,4]
    Output: false

    by sorting the array - and then just checking the neighbors
    time complexity: O(nlogn)
    space complexity: O(1)

    by using hashmap
    time complexity: O(n)
    space complexity: O(n)
    */

    public boolean containsDuplicateResult(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
               return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }

}
