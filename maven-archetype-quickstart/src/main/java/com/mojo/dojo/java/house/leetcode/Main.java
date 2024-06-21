package com.mojo.dojo.java.house.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int[] values = {4, 2, 7, 1, 3, 6, 9};
        TreeNode root = createBinaryTreeFromArray(values);

        System.out.println("Original Tree:");
        printTree(root);

        InvertTreeSolution solution = new InvertTreeSolution();
        TreeNode invertedRoot = solution.invertNode(root);

        System.out.println("Inverted Tree:");
        printTree(invertedRoot);
    }

    // Método para crear un árbol binario a partir de un array
    public static TreeNode createBinaryTreeFromArray(int[] values) {
        if (values.length == 0) return null;

        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (i < values.length) {
            TreeNode current = queue.poll();
            if (i < values.length) {
                current.left = new TreeNode(values[i++]);
                queue.add(current.left);
            }
            if (i < values.length) {
                current.right = new TreeNode(values[i++]);
                queue.add(current.right);
            }
        }
        return root;
    }

    // Método para imprimir el árbol (recorrido en niveles)
    public static void printTree(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.val + " ");
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        System.out.println();
    }
}
