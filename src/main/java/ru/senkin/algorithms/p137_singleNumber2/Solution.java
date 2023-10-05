package ru.senkin.algorithms.p137_singleNumber2;

import java.util.Arrays;

public class Solution {
    public Solution() {
    }
    public int singleNumber(int[] nums) {
       int res = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                res = nums[i];
                break;
            }
            if (nums[i]==nums[i + 1]) {
                i = i + 2;
            } else {
                res = nums[i];
                break;
            }
        }
        return res;
    }
}
