package com.mojo.dojo.java.house.leetcode;

public class ListNodesOrders {
    public static ListNode createListInOrder(int[] arr) {
        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return head;
    }

    public static ListNode createListInReverseOrder(int[] arr) {
        if (arr.length == 0) return null;

        ListNode head = null;

        for (int i = 0; i < arr.length; i++) {
            head = new ListNode(arr[i], head);
        }

        return head;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print("->");
            }
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] input = {2, 3, 4};

        // Crear listas
        ListNode listInOrder = createListInOrder(input);
        ListNode listInReverseOrder = createListInReverseOrder(input);

        // Imprimir listas
        System.out.print("List in order: ");
        printList(listInOrder);

        System.out.print("List in reverse order: ");
        printList(listInReverseOrder);
    }
}

