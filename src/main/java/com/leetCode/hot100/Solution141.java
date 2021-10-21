package com.leetCode.hot100;

public class Solution141 {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
    }

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode pf = head;
        ListNode ps = head;
        while (pf.next != null && pf != null) {
            pf = pf.next.next;
            ps = ps.next;
            if (ps.equals(pf)) {
                return true;
            }
        }
        return false;
    }
}
