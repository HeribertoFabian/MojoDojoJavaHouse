package com.mojo.dojo.java.house.leetcode;


public class InvertTree {
    
    public static void main(String[] args) {
        
    }
}

class InvertTreeSolution{

    public TreeNode invertNode(TreeNode root){
        invert(root);
        return root;
    }

    private void invert(TreeNode node){
        if(node == null) return;

        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;

        invert(node.left);
        invert(node.right);
    }
}


/**
 Dado un árbol binario, escribe una función que invierta el árbol. La inversión de un árbol binario implica intercambiar los hijos izquierdo y derecho de todos los nodos en el árbol.

Por ejemplo, si tienes el siguiente árbol binario:

    4
   / \
  2   7
 / \ / \
1  3 6  9

Después de invertirlo, debería quedar así:

    4
   / \
  7   2
 / \ / \
9  6 3  1



 */