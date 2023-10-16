package ru.senkin.algorithms.p189_rotateArray;

public class Solution {

    public Solution() {
    }

    public void rotate(int[] nums, int k) {
//        int num;
        int nk;
        if (nums.length != 1) {
            if (k > nums.length)  {
                nk = k % (nums.length);
            } else {
                nk = k;
            }

        } else {
            return;
        }

        int[] numsTemp = new int[nums.length];
        for (int i = 0; i < nk; i++) {
            numsTemp[i] = nums[i + nums.length - nk];
        }
        for (int i = 0; i < numsTemp.length - nk; i++) {
            numsTemp[nk+i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = numsTemp[i];
        }

//        for (int i = 1; i <= nk; i++) {
//            num = nums[nums.length - 1];
//            for (int j = nums.length - 1; j > 0; j--) {
//                nums[j] = nums[j - 1];
//            }
//            nums[0] = num;
//        }


        System.out.println(nums[0]);


    }
}
