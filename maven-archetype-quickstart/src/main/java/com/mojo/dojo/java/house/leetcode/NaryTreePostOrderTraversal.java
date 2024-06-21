package com.mojo.dojo.java.house.leetcode;

import java.util.ArrayList;
import java.util.List;


/*
 * //Definition for a Node
 * class Node{
 *  public int val;
 *  public List<Node> children;
 * 
 *  public Node(){}
 * 
 *  public Node(int _val){
 *      val = _val;
 *  }
 * 
 *  public Node(int val, List<Node> _children){
 *      val = _val;
 *      children = _children;
 *  }
 * }
 */


public class NaryTreePostOrderTraversal {
    public List<Integer> postOrder(Node root){
        List<Integer> output = new ArrayList<>();
        helper(root, output);
        return output;
    }

    public void helper(Node root, List<Integer> output){
        if(root == null) return;

        //for(int i = 0; i<root.children.size(); i++){
        // Recorrer todos los hijos del nodo actual
        for(Node child: root.children){
            helper(child, output);
        }
        // Añadir el valor del nodo actual a la lista
        output.add(root.val);
    }
}


/*
 * Given an n-ary tree, return the postorder traversal of its node's values.
 * Nary-Trere input serialization is represented in their level order traversal
 * each group of children is separated by the null value (see examples)
 */

 