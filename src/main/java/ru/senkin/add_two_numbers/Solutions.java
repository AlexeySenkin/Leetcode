package ru.senkin.add_two_numbers;

public class Solutions {
    public Solutions() {
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int number1 = 0;
        int number2 = 0;

        ListNode curListNode = l1;
        int r = 1;
        boolean condition = (l1 != null);
        while (condition) {
            number1 += curListNode.val * r;
            r *= 10;
            condition = curListNode.next != null;
            curListNode = curListNode.next;
        };

        curListNode = l2;
        r = 1;
        condition = (l2 != null);;
        while (condition) {
            number2 += curListNode.val * r;
            r *= 10;
            condition = curListNode.next != null;
            curListNode = curListNode.next;
        }
        String strNumber =  String.valueOf(number1 + number2);

        int resNumberLen = strNumber.length();

        ListNode curr = new ListNode(Integer.parseInt(strNumber.substring(resNumberLen - 1, resNumberLen)));
        ListNode temp;

        for (int i = resNumberLen - 2; i >= 0; i--) {

            temp =  new ListNode(Integer.parseInt(strNumber.substring(i, i + 1)),null);

            curr.next = temp;

            curr = curr.next;


        };

        ListNode resListNode = curr;

        condition = (resListNode != null);
        while (condition) {
            System.out.println(resListNode.val);
            condition = resListNode.next != null;
            resListNode = resListNode.next;
        }

        return resListNode;
    }
}
