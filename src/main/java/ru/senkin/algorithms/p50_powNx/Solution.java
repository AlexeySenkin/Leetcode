package ru.senkin.algorithms.p50_powNx;

public class Solution {
    public Solution() {

    }

    public double myPow(double x, int n) {
        double res = x;
        double minX;
        if ((n == 0) || (x == 1) || ((x == -1) && (n % 2 == 0))) {
            return 1;
        }
        if ((x == -1) && (n % 2 == 1)) {
            return -1;
        }
        if ( n == - 1) {
            return 1 / x;
        }
        if ( n == 1) {
            return x;
        }
        if (n < 0) {
            res = 1 / res;
        }
        if (n == Integer.MIN_VALUE) {
            if (x > 1.1) {
                return 0;
            }
            n = Integer.MAX_VALUE;
        }



        minX = res;
        int absN;

        if (n % 2 == 0) {
            res = res * res ;
        } else {
            res = res * res * res ;
        }
        minX = minX * minX ;
        absN = Math.abs(n / 2);


        for (int i = 1; i < absN; i++) {
            res = res * minX;

        }
        return res;
    }
}
