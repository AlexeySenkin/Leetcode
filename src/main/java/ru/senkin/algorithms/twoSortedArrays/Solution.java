package ru.senkin.algorithms.twoSortedArrays;

import java.util.Arrays;

public class Solution {

    public Solution() {
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        if (len > 0)
            {
            int[] arrayRes = new int[nums1.length + nums2.length];

                System.arraycopy(nums1, 0, arrayRes, 0, nums1.length);
                if (arrayRes.length - nums1.length >= 0)
                    System.arraycopy(nums2, 0, arrayRes, nums1.length, arrayRes.length - nums1.length);

            Arrays.sort(arrayRes);

//            for (int i = 0; i < arrayRes.length; i++) {
//                if (i < arrayRes.length - 1)  {
//                    System.out.print(arrayRes[i] + " ");
//                } else {
//                    System.out.println(arrayRes[i]);
//                }
//
//            }

//            System.out.println("len = " + len);
//            System.out.println("len1 = " + (len / 2 - 1));
//            System.out.println("len2 = " + len / 2 );
//
////            System.out.println(arrayRes[len / 2]);
////            System.out.println(arrayRes[len / 2 + 1]);

            if (len == 1) {
                return arrayRes[0];
            } else if (len % 2 > 0) {
                return arrayRes[len / 2];
            }
            else {
                return (double)((arrayRes[len / 2 - 1] + arrayRes[len / 2])) / 2;
            }
        } else {
            return 0;
        }
    }
}
