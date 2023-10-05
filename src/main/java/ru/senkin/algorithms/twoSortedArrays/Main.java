package ru.senkin.algorithms.twoSortedArrays;

public class Main {
    public static void main(String[] args) {
        Solution solutions = new Solution();
        int[] array1 = {};
        int[] array2 = {1};

//        int[] array1 = {1,3};
//        int[] array2 = {2};

//        int[] array1 = {0,0,0,0,0};
//        int[] array2 = {-1,0,0,0,0,0,1};
        System.out.println(solutions.findMedianSortedArrays(array1, array2));

    }
}
