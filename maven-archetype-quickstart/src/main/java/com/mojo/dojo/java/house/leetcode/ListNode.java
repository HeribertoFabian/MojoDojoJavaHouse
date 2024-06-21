package com.mojo.dojo.java.house.leetcode;

public class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode node) { 
        this.val = val; 
        this.next = node;
    }
}
