package com.mojo.dojo.java.house.leetcode;


public class TwoSumBruteForce {
 
    public int[] twoSum(int[] nums, int target){
        int[] output = new int[2];

        for(int i = 0; i<nums.length; i++){
            for(int y = i+1; y<nums.length; y++){
                if(nums[i] +  nums[y] == target){
                    output[0]=i;
                    output[1]=y;
                    return output;
                }
            }
        }
        return output;
    }
}


/*
 Dado un array de enteros nums y un entero target, devuelve los índices de los dos números tales que sumen target.

Puedes asumir que cada entrada tendrá exactamente una solución y no puedes usar el mismo elemento dos veces.

Puedes devolver la respuesta en cualquier orden.

Ejemplo 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Porque nums[0] + nums[1] == 9, devolvemos [0, 1].

Ejemplo 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
 */