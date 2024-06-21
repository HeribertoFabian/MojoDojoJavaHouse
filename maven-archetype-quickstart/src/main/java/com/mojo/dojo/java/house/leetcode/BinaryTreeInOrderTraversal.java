package com.mojo.dojo.java.house.leetcode;

import java.util.ArrayList;
import java.util.List;

/*
 // Definición de la clase TreeNode
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) { 
        this.val = val; 
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

 */
public class BinaryTreeInOrderTraversal {
    
    public List<Integer> inOrderTraversal(TreeNode root){
        List<Integer> output = new ArrayList<>();
        helper(root, output);
        return output;
    }

    public void helper(TreeNode root, List<Integer> output){
        if(root == null) return;

        // Recorrer el subárbol izquierdo
        helper(root.left, output);
        // Visitar el nodo raíz
        output.add(root.val);
        // Recorrer el subárbol derecho
        helper(root.right, output);
    }
}

/*
 * Given the root of a binary tree, return the inorder traversal of its node's value
 */

 /*

 Se requiere realizar un recorrido inorder (en orden) de un árbol binario. En un recorrido inorder, se visitan los nodos en el siguiente orden:

    1.- Primero, se visita el subárbol izquierdo.
    2.- Luego, se visita el nodo raíz.
    3.- Finalmente, se visita el subárbol derecho.

  */