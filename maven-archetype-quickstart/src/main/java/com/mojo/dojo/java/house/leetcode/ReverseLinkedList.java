package com.mojo.dojo.java.house.leetcode;

/*
 * Definition for singly-linked list
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
 */
public class ReverseLinkedList {
    public ListNode ReverseLinkedListSolution(ListNode head){
        ListNode output = null;
        while(head!=null){
            ListNode tmp = head.next;   // 1. Almacena el siguiente nodo
            head.next = output;         // 2. Invierte el enlace del nodo actual
            output = head;              // 3. Mueve output al nodo actual
            head=tmp;                   // 4. Avanza al siguiente nodo en la lista original
        }
        return output;                  // 5. Devuelve la nueva cabeza de la lista invertida
    }
}

/*
 * Dada una lista ligada simple, escribe un algoritmo que invierta la lista. 
 * La lista ligada está compuesta por nodos donde cada nodo tiene un valor entero y una referencia al siguiente nodo en la lista
 * 
 * Ejemplo:
 * Entrada: 1 -> 2 -> 3 -> null
 * Salida: 3 -> 2 -> 1 -> null
 * 
 */