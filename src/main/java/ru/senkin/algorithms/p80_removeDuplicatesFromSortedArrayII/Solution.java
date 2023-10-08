package ru.senkin.algorithms.p80_removeDuplicatesFromSortedArrayII;

public class Solution {
    public Solution() {
    }

    public int removeDuplicates(int[] nums) {
        int res = 0;
        boolean isPred;
        int curI = 0;
        for (int i = 0; i <= nums.length-1; i++) {

            if (i > 0) {
                 isPred = nums[i] > nums[i - 1];
            } else {
                isPred = true;
            }

            if (i != nums.length-1 && nums[i] == nums[i + 1]) {
                curI = 1;
            } else {
                curI = 0;
            }

            if (isPred) {
                i = i + curI;
            }
            else {
                for (int j = i; j < nums.length-1; j++) {
                   nums[j] = nums[j + 1];
                }
                res += 1;
                nums[nums.length - res] = -1;
                if (i != nums.length-1) {
                    i -= 1;
                }
            }
            if (res + i == nums.length - 1) {
                break;
            }
        }
        return nums.length - res;

    }

}
