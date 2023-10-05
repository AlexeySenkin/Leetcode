package ru.senkin.algorithms.p50_powNx;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        double x = 1.0000000000001;
//        int n = -2147483648;
        double x = 2;
        int n = 10;
        //System.out.println(Math.pow(x, n));
        System.out.println(solution.myPow(x, n));
    }
}
