package com.leetCode.hot100;

public class Solution206 {
    public static void main(String[] args) {

    }
    public ListNode reverseList(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode pre = head;
        ListNode cur = null;
        while (pre!=null){
            ListNode temp = pre.next;
            pre.next = cur;
            cur = pre;
            pre = temp;
        }
        return cur;
    }
}
