package ru.senkin.algorithms.p15._3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public Solution() {
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>(new ArrayList<>());
        //int[] numsTemp = Arrays.stream(nums).distinct().toArray();
        //nums = Arrays.copyOf(numsTemp, numsTemp.length);
        Arrays.sort(nums);

        int point0 = 0;
        int point1 = 1;
        int point2 = nums.length - 1;
        int sum;

        while (point0 < point1 && point1 < point2) {
                sum = nums[point0] + nums[point1] + nums[point2];
                if (sum == 0) {
                    List<Integer> res = new ArrayList<>();
                    res.add(nums[point0]);
                    res.add(nums[point1]);
                    res.add(nums[point2]);
                    if (lists.size() == 0) {
                        lists.add(res);
                    } else {
                        for (int j = 0; j < lists.size(); j++) {
                            if (!lists.contains(res)) {
                                lists.add(res);
                                break;
                            }
                        }
                    }
                    point2 -= 1;
                } else if (sum < 0) {
                    point1 += 1;
                } else {
                    point2 -= 1;
                }
                if (point2 - point1 == 0) {
                    point0 += 1;
                    point1 = point0 + 1;
                    point2 = nums.length - 1;
                }
            }
        return lists;
     }
}
