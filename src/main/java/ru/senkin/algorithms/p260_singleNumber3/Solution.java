package ru.senkin.algorithms.p260_singleNumber3;

import java.util.Arrays;

public class Solution {
    public Solution() {
    }
    public int[] singleNumber(int[] nums) {
        int[] res = {-1,-1};
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int numI = nums[i];
            if (i == nums.length - 1) {
                res[1] = numI;
                break;
            }
            if (numI == nums[i + 1]) {
                i = i + 1;
            } else {
                if (res[0] == -1) {
                    res[0] = numI;
                } else {
                    res[1] = numI;
                }
            }
        }
        return res;
    }
}
