package ru.senkin.algorithms.p4_medianOfTwoSortedArrays;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1,2};
        int[] nums2 = {3,4};

        System.out.println(solution.findMedianSortedArrays(nums1,nums2));
    }
}
