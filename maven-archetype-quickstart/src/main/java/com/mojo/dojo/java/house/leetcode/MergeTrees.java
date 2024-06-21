package com.mojo.dojo.java.house.leetcode;



/**
 * Definition for a binary tree node
 * public class TreeNode{
 *  int val;
 *  TreeNode left;
 *  TreeNode right;
 *  TreeNode(){}
 * 
 *  TreeNode(int val) { this.val = val; } 
 * 
 *  Treenode(int val, TreeNode left, TreeNode rigth){
 *      this.val=val;
 *      this.left =  left;
 *      this.right = right;
 *  }
 * 
 * }
 * 
 */
public class MergeTrees {

    public TreeNode MergeTreesSolution(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null) return null;
        if(t1 == null) return t2;
        if(t2 == null) return t1;

        TreeNode output = new TreeNode(t1.val + t2.val);
        output.left = MergeTreesSolution(t1.left, t2.left);
        output.right = MergeTreesSolution(t1.right, t2.right);

        return output;

    }
    
}


/*
 * 
 Fusión de dos Árboles Binarios

Dado dos árboles binarios, escribe una función que los fusione en un nuevo árbol binario. La fusión de dos árboles binarios se realiza de la siguiente manera:

Si ambos nodos en la misma posición son no nulos, sumamos sus valores y el nodo resultante toma este valor.
Si uno de los nodos es nulo, el nodo resultante toma el valor del nodo no nulo.
El proceso se repite recursivamente para los hijos izquierdo y derecho de cada nodo.
Por ejemplo, si tienes los siguientes dos árboles binarios:

Arbol 1
    1
   / \
  3   2
 /   
5    

Arbol 2
    2
   / \
  1   3
   \   \
    4   7

Despues de la fusion:

    3
   / \
  4   5
 / \   \
5   4   7


 * 
 */

