package ru.senkin.algorithms.p1_twoSums;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arrayRes = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arrayRes[0] = i;
                    arrayRes[1] = j;
                    break;
                }
            }
        }
        return arrayRes;
    }
}
