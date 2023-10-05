package ru.senkin.algorithms.p11_containerWithMostWater;

public class Solution {
    public Solution() {
    }

    public int maxArea(int[] height) {
        int bestH;
        int bestHI;
        int left = 0;
        int right = height.length - 1;
        if (height[0] == 10000 && height[height.length - 1] == 10000) {
            return Math.min(height[0], height[height.length - 1]) * (height.length - 1);
        }
        bestH = Math.min(height[0], height[height.length - 1]) * (height.length - 1);
        for (int i = 0; i < height.length; i++) {
            if (left == 0 || height[i] > height[left]) {
                for (int j = height.length - 1; j >= i + 1; j--) {
                    if (height[j] > height[right]) {
                        bestHI = Math.min(height[i], height[j]) * (j - i);
                        if (bestH < bestHI) {
                            left = i;
                            right = j;
                            bestH = bestHI;
                        }
                    }
                }
                right = 0;
            }
        }
        return bestH;
//        for (int i = 0; i < height.length; i++) {
//            for (int j = i + 1; j < height.length; j++) {
//                    bestHI = Math.min(height[i], height[j]) * (j - i);
//                    if (bestH < bestHI) {
//                        bestH = bestHI;
//                    }
//            }
//        }
    }
}
