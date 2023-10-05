package ru.senkin.algorithms.p11_containerWithMostWater;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arrayHeight = {1000,0,0,1000};
        //int[] arrayHeight = {18,17,6};
        System.out.println(solution.maxArea(arrayHeight));
    }
}
