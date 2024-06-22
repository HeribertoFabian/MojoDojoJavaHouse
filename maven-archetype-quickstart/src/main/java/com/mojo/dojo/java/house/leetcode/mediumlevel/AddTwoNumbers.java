package com.mojo.dojo.java.house.leetcode.mediumlevel;

import com.mojo.dojo.java.house.leetcode.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class AddTwoNumbers {
    
    public static void main(String[] args) {

        ListNode nodo3 = new ListNode(3);
        ListNode nodo4 = new ListNode(4, nodo3);
        ListNode nodo2 = new ListNode(2, nodo4);

        ListNode l1 = nodo2;

        ListNode nodo4b = new ListNode(4);
        ListNode nodo6b = new ListNode(6, nodo4b);
        ListNode nodo5b = new ListNode(5, nodo6b);

        ListNode l2 = nodo5b;

        AddTwoNumbers obj = new AddTwoNumbers();
        obj.printList(l1);
        System.out.println("");
        obj.printList(l2);
        System.out.println("OUTPUT:");
        obj.printList(obj.addTwoNumbers(l1, l2));


        
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry =0;

        if(l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;

        while(l1 != null || l2 != null || carry != 0){
            int sum = carry;

            if(l1!=null){
                sum+=l1.val;
                l1 = l1.next;
            }

            if(l2!=null){
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new ListNode(sum%10);
            current = current.next;
        }

        return dummyHead.next;
    }


        // Método para imprimir los valores de la lista enlazada
        public void printList(ListNode node) {

            while (node != null) {
                System.out.print(node.val + " ");
                node = node.next;
            }
        }
}

/*
 
 You are given two non-empty linked lists representing two non-negative integers. 
 The digits are stored in reverse order, and each of their nodes contains a single digit. 
 Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
 */