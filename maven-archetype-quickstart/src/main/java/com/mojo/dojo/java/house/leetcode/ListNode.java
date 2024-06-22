package com.mojo.dojo.java.house.leetcode;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode node) { 
        this.val = val; 
        this.next = node;
    }
}
