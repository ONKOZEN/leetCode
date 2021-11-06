package com.leetCode.hot100;

import com.sun.javafx.sg.prism.web.NGWebView;

public class Solution19 {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        Solution19 solution19 = new Solution19();
        solution19.ite(solution19.removeNthFromEnd(node,1));

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        int size = getSize(head);
        if (n <= 0 || n > size) {
            return head;
        } else if (n == size) {
            return head.next;
        }
        int i = 0;
        ListNode p = head;
        while (i != size - n-1) {
            p = p.next;
            i++;
        }
        ListNode temp = p.next.next;
        p.next.next = null;
        p.next = temp;
        return head;
    }

    public Integer getSize(ListNode head) {
        if (head == null) {
            return 0;
        }
        int flag = 1;
        while (head.next != null) {
            head = head.next;
            flag++;
        }
        return flag;
    }
    public void ite(ListNode head){
        if (head == null) {
            return;
        }
        while (head != null) {
            System.out.print(head.val);
            head = head.next;;
        }
    }
}
