package ru.senkin.algorithms.p8_stringToIntegerAtoi;

import static java.lang.Character.*;

public class Solution {
    public Solution() {
    }

    public int myAtoi(String s) {
        //StringBuilder legalChar = new StringBuilder("-+0123456789");
        StringBuilder tmp = new StringBuilder();
        int tmpLen;
        boolean isTmp;
        for (int i = 0; i < s.length(); i++) {

//            for (int j = 0; j < legalChar.length(); j++) {
//                if (s.charAt(i) == legalChar.charAt(j)) {
//                    tmp.append(s.charAt(i));
//                    isTmp = true;
//                    break;
//                }
//                isTmp = false;
//            }
            char tmpI = s.charAt(i);
            if (isDigit(tmpI) || (tmpI == '+') || (tmpI == '-')) {
                tmp.append(tmpI);
                isTmp = true;
            } else {
                isTmp = false;
            }
            tmpLen = tmp.length();

            if ((tmpLen >= 1 && !isTmp)
                || (tmpI != ' ' && tmpLen == 0)) {
                break;
            }
            if ((tmpI == '-' || tmpI == '+') &&
                    (tmpLen > 1)) {
                tmp.deleteCharAt(tmpLen - 1);
                break;
            }
        }

        tmpLen = tmp.length();
        if ((tmpLen == 0)
                || (tmpLen == 1 && (tmp.charAt(0) == '-' | tmp.charAt(0) == '+'))
                || ((tmp.charAt(0) == '-' && tmp.charAt(1) == '+') || (tmp.charAt(0) == '+' && tmp.charAt(1) == '-')))
        {
            return 0;
        }

        try
        {
            return Integer.parseInt(tmp.toString());
        }
        catch (NumberFormatException numberFormatException) {
            if (tmp.charAt(0) == '-') {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }

        }
    }
}
