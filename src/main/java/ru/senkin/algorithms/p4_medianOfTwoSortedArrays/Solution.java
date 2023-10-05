package ru.senkin.algorithms.p4_medianOfTwoSortedArrays;

import java.util.Arrays;

public class Solution {
    public Solution() {
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int len = nums1.length + nums2.length;
        if (len > 0) {
            int[] arrayRes = new int[nums1.length + nums2.length];

            System.arraycopy(nums1, 0, arrayRes, 0, nums1.length);
            if (arrayRes.length - nums1.length >= 0)
                System.arraycopy(nums2, 0, arrayRes, nums1.length, arrayRes.length - nums1.length);

            Arrays.sort(arrayRes);

            int halfLen = len / 2;
            int halfLen_1 = len / 2 - 1;

            if (len == 1) {
                return arrayRes[0];
            } else if (len % 2 > 0) {
                return arrayRes[halfLen];
            }
            else {
                return (double)((arrayRes[halfLen_1] + arrayRes[halfLen])) / 2;
            }
        } else {
            return 0;
        }
    }
}
