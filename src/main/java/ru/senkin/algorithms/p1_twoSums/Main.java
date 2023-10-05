package ru.senkin.algorithms.p1_twoSums;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {2,7,11,1};
        int target = 9;
        Solution solutions = new Solution();

        int[] res = solutions.twoSum(array1, target);
        for (int re : res) {
            System.out.print(re + ",");
        }
    }
}
