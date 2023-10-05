package ru.senkin.algorithms.p137_singleNumber2;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {0,1,0,1,0,1,99};

        System.out.println(solution.singleNumber(nums));
    }
}
