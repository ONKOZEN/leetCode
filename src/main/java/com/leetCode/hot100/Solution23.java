package com.leetCode.hot100;

public class Solution23 {
    public static void main(String[] args) {
        Solution23 solution23 = new Solution23();
        ListNode l1 = solution23.create(1,5,3);
        ListNode l2 = solution23.create(2,5,3);
        ListNode l3 = solution23.create(3,5,3);

        ListNode com2 = solution23.mergeTwoLists(l1,l2);
        solution23.show(com2);

    }
    public ListNode create(int start,int length,int step){
        ListNode listNode = new ListNode(start);
        ListNode p = listNode;
        for (int i = 0; i < length; i++) {
            listNode.next = new ListNode(listNode.val+step);
            listNode = listNode.next;
        }
        return p;
    }


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        if(l1.val<l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }
        for (int i = lists.length-2; i >= 0; i--) {
            lists[i] = mergeTwoLists(lists[i],lists[i+1]);
        }
        return lists[0];
    }
    public void show(ListNode listNode){
        while (listNode!=null){
            System.out.print(listNode.val+",");
            listNode = listNode.next;
        }
    }
}
