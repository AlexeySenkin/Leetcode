package ru.senkin.algorithms.p189_rotateArray;

public class Solution {

    public Solution() {
    }

    public void rotate(int[] nums, int k) {
        int num;
        int nk = k % nums.length;
        System.out.println(nums.length);
        System.out.println(nk);


//        for (int i = 1; i <= nk; i++) {
//            num = nums[nums.length - 1];
//            for (int j = nums.length - 1; j > 0; j--) {
//                nums[j] = nums[j - 1];
//            }
//            nums[0] = num;
//        }


        for (int i = 0; i < nk; i++) {
            num = nums[i];
            nums[i] = nums[i + nk];
            nums[i + nk] = num;
        }
        if (nk < nums.length / 2) {
            num = nums[nk];
            for (int i = nk; i < nums.length - 1; i++) {
                nums[i] = nums[i + 1];
            }
            nums[nums.length - 1] = num;
        }





    }
}
