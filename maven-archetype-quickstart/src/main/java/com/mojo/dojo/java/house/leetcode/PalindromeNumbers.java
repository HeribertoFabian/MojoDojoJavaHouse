package com.mojo.dojo.java.house.leetcode;

public class PalindromeNumbers {
    public boolean isPalindrome(ListNode head){
        if(head == null) return true;
        ListNode fast = head;
        ListNode slow = head;

         
        
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;          // fast se mueve dos nodos a la vez mientras que slow se mueve uno a la vez.
            slow = slow.next;               // Cuando fast llega al final de la lista, slow estará en el medio de la lista.
        }

        ListNode tmp = reverseLinkedList(slow); //Se invierte la segunda mitad de la lista a partir del nodo donde está slow.

        while(tmp != null){
            if(tmp.val != head.val){
                return false;
            }else{
                tmp = tmp.next;
                head = head.next;
            }
        }

        return true;
    }

    public ListNode reverseLinkedList(ListNode root){
        ListNode output = null;

        while(root != null){
            ListNode tmp = root.next;
            root.next = output;
            output = root;
            root = tmp;
        }

        return output;
    }
}


/*
 * Given a singly linked list, determine if it is a palindrome
 * 
 * Example 1
 * Input: 1 -> 2
 * Output: false
 * 
 * Example 2 
 * Input: 1->2->2->1
 * Output: true
 */