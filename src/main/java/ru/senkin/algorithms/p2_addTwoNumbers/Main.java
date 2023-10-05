package ru.senkin.algorithms.p2_addTwoNumbers;

public class Main {
    public static void main(String[] args) {
//        ListNode listNode1 = new ListNode(2, new ListNode(4, new ListNode(3)));
//        ListNode listNode2 = new ListNode(5, new ListNode(6, new ListNode(4)));



        ListNode listNode1 = new ListNode(9, null);
        ListNode listNode2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9))))))))));
        Solution solutions = new Solution();
        System.out.println(solutions.addTwoNumbers(listNode1, listNode2));


    }
}
