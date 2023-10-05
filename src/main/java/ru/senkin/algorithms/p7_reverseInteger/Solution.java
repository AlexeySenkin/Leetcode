package ru.senkin.algorithms.p7_reverseInteger;

public class Solution {
    public Solution() {
    }

    int reverse(int x) {
        int resX;
        StringBuilder strX = new StringBuilder(String.valueOf(x));
        strX.reverse();
        if (strX.charAt(strX.length() - 1)=='-') {
            strX.replace(1,strX.length(),strX.toString());
            strX.deleteCharAt(strX.length()-1);
            strX.setCharAt(0,'-');
        }
        try {
            resX = Integer.parseInt(strX.toString());
            return resX;
        } catch (NumberFormatException numberFormatException) {
            return 0;
        }
    }

}
