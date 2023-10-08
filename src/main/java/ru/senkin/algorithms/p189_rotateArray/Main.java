package ru.senkin.algorithms.p189_rotateArray;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        //int[]  num = {-1,-100,3,99};
        int[]  num = {1,2,3,4,5,6,7};

        int k = 3;
        solution.rotate(num, k);
    }
}
