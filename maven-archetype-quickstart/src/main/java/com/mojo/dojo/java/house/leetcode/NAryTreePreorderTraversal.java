package com.mojo.dojo.java.house.leetcode;

import java.util.ArrayList;
import java.util.List;

/*

    // Definición de la clase Node para el árbol N-ario
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, List<Node> children) {
            this.val = val;
            this.children = children;
        }
    }

 */
public class NAryTreePreorderTraversal {
    
    public List<Integer> preorder(Node root){
        List<Integer> output = new ArrayList<>();
        helper(root, output);
        return output;
    }

    public void helper(Node root, List<Integer> output){
        if(root == null) return;                            //Esto maneja el caso donde el árbol está vacío o se ha llegado a un nodo sin hijos.

        output.add(root.val);                               //Si el nodo no es null, su valor (root.val) se agrega a la lista output. 
                                                            //Este es el primer paso en el recorrido de preorden (visitar el nodo).
         
        /*
         *El bucle for garantiza que los hijos se procesen en el orden en que aparecen en la lista children. 
         Dado que i comienza en 0 y se incrementa en cada iteración, los hijos se recorren secuencialmente de izquierda a derecha.
         */
        for(int i = 0; i < root.children.size(); i++){
            helper(root.children.get(i), output);
        }
    }

}

/*
 * Given an n-ary tree, return the preorder traversal of its node's values
 * 
 * Nary-Tree input serialization is represented in their level order traversal,
 * each group of children is separated by the null value 
 */

 /*
    Este problema consiste en recorrer un árbol N-ario en orden de preorden. En un árbol N-ario, 
    cada nodo puede tener hasta N hijos, a diferencia de un árbol binario donde cada nodo tiene como máximo dos hijos.

    En el recorrido de preorden, se sigue el siguiente orden:
    1.- Visitar el nodo raíz.
    2.- Recorrer cada subárbol de los hijos en orden de izquierda a derecha.

  */