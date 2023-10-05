package ru.senkin.algorithms.p136_singleNumber;

public class Solution {
    public Solution() {
    }
    public int singleNumber(int[] nums) {
//        int[] val = new int[10];
//        for (int i = 0; i < nums.length; i++) {
//            val[nums[i] - 1] = val[nums[i] - 1] ^ nums[i];
//        }
//        int res = 0;
//        for (int i = 0; i < val.length; i++) {
//            res += val[i];
//        }

        int res = 0;
        for (int num : nums) {
            res = res ^ num;
        }
        return res;
    }
}
