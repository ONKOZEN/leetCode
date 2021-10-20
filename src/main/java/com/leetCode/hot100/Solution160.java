package com.leetCode.hot100;

import java.util.ArrayList;
import java.util.List;

public class Solution160 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(3);
        a.next = b;
        System.out.println(getIntersectionNode(a,b).val);
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == headB) {
            return headA;
        }
        if (headA == null || headB == null) {
            return null;
        }
        List<ListNode> listA = new ArrayList<>();
        List<ListNode> listB = new ArrayList<>();
        while (headA != null) {
            listA.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            listB.add(headB);
            headB = headB.next;
        }
        for (int i = 0; i < listA.size(); i++) {
            for (int j = 0; j < listB.size(); j++) {
                if (listA.get(i) == listB.get(j)) {
                    return listA.get(i);
                }
            }
        }
        return null;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
