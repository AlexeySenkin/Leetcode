package ru.senkin.add_two_numbers;

public class main {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode listNode2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        Solutions solutions = new Solutions();
        System.out.println(solutions.addTwoNumbers(listNode1, listNode2));


    }
}
