package com.mojo.dojo.java.house.leetcode;

import java.util.Arrays;

public class ContainsDuplicate {
    
    public boolean containsDuplicateSolution(int[] nums){
        Arrays.sort(nums);

        for(int i = 1; i<nums.length; i++){
            if(nums[i] == nums[i-1])
            return true;
        }

        return false;
    }
}

/*
 Dado un arreglo de enteros, encontrar si el arreglo contiene elementos duplicados
 Tu función deberia retornar true si alguno de los valores aparece al menos dos veces en el array
 y deberia retornar false si todos los elementos son distintos

 Example1
 Input: [1,2,3,1]
 Output: true

 Example 2: 
 Input: [1,2,3,4]
 Output: false
 */