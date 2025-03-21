package com.mt.leetcode;

public class ListMerge {

    public static void main(String[] args) {

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode head = new ListNode();
        ListNode tmp = head;

        while (list1.next != null && list2.next != null) {
            if(list1.val < list2.val) {
                tmp.next = new ListNode(list1.val);
                tmp = tmp.next;
                list1 = list1.next;
            } else {
                tmp.next = new ListNode(list2.val);
                tmp = tmp.next;
                list2 = list2.next;
            }
        }

        while (list1.next != null) {
            tmp.next = new ListNode(list1.val);
            tmp = tmp.next;
        }

        while (list2.next != null) {
            tmp.next = new ListNode(list2.val);
            tmp = tmp.next;
        }

        return head.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
