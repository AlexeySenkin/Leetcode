package ru.senkin.algorithms.p2_addTwoNumbers;

import java.math.BigInteger;
import java.util.ArrayList;

public class Solution {
    public Solution() {
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        BigInteger number1 = BigInteger.valueOf(0);
        BigInteger number2 = BigInteger.valueOf(0);

        ListNode curListNode = l1;
        BigInteger r = BigInteger.valueOf(1);
        boolean condition = (l1 != null);
        while (condition) {
            number1 = number1.add(r.multiply(BigInteger.valueOf(curListNode.val)));
            r = r.multiply(BigInteger.valueOf(10));
            condition = curListNode.next != null;
            curListNode = curListNode.next;
        }

        curListNode = l2;
        r = BigInteger.valueOf(1);
        condition = (l2 != null);
        while (condition) {
            number2 = number2.add(r.multiply(BigInteger.valueOf(curListNode.val)));
            r = r.multiply(BigInteger.valueOf(10));
            condition = curListNode.next != null;
            curListNode = curListNode.next;
        }
        BigInteger num = number1.add(number2);
        String strNumber = num.toString();

//        System.out.println(number1);
//        System.out.println(number2);
//        System.out.println(strNumber);

        int resNumberLen = strNumber.length();

        //ListNode curr = new ListNode(Integer.parseInt(strNumber.substring(resNumberLen - 1, resNumberLen)));

        ArrayList<ListNode> arrayList = new ArrayList<>();

        for (int i = resNumberLen - 1; i >= 0; i--) {
            arrayList.add(new ListNode(Integer.parseInt(strNumber.substring(i, i + 1)),null));
        }

        for (int i = 0; i < arrayList.size(); i++) {
            if (i < arrayList.size() - 1) {
                arrayList.get(i).next = arrayList.get(i + 1);
            } else {
                arrayList.get(i).next = null;
            }

        }

        ListNode resListNode = arrayList.get(0);

//        condition = (resListNode != null);
//        while (condition) {
//            System.out.print(resListNode.val + ",");
//            condition = resListNode.next != null;
//            resListNode = resListNode.next;
//        }

        return resListNode;
    }
}
