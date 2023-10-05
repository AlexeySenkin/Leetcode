package ru.senkin.algorithms.p260_singleNumber3;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {1,2,1,3,2,5};

        System.out.println(solution.singleNumber(nums)[0]);
        System.out.println(solution.singleNumber(nums)[1]);
    }
}
