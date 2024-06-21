package com.mojo.dojo.java.house.leetcode;

import java.util.List;

//Definition for a Node
  public class Node{
  public int val;
   public List<Node> children;
  
   public Node(){}
  
   public Node(int _val){
       val = _val;
   }
  
   public Node(int val, List<Node> _children){
       this.val = val;
       children = _children;
   }
  }
 