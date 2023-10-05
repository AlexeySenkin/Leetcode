package ru.senkin.algorithms.p3_longestSubstringWithoutRepeatingCharacters;

public class Solution {
    public Solution() {
    }

    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int maxSubLen;
        String subStr;
        String subStrPred;
        int posInner = 1;
        int resLen = 0;
        String resStr = "";
        if (len <= 1) {
            resLen = len;
        } else  {
            subStrPred = s.substring(0, 1);
            maxSubLen = 1;

            for (int pos = posInner; pos < len; pos++) {

//                System.out.println(pos);

                for (int i = pos; i < len; i++) {

                    subStr = s.substring(i, i + 1);

                    //posInner = i;

                    if (!subStrPred.contains(subStr)) {
                        subStrPred += subStr;
                        maxSubLen += 1;
                        posInner = i;
                        if (i == len - 1 && resLen < maxSubLen ) {
                            resStr = subStrPred;
                            resLen = maxSubLen;

                        }
                    } else {
                        if (resLen < maxSubLen) {
                            resStr = subStrPred;
                            resLen = maxSubLen;
                        }
                        subStrPred = "";
                        maxSubLen = 0;
                        if (i != len - 1) {
                            posInner = posInner - 1;
                        }
                        break;
                    }

                }
                pos = posInner;
            }
            System.out.print(resStr + ": ");
        }
        return resLen;
    }
}
