package com.mojo.dojo.java.house.leetcode;

import java.util.HashMap;
import java.util.Map;


public class TwoSumHashMap {
    
    public int[] twoSum(int[] nums, int target){
        int[] output = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){ // Recorre el array nums
            if(map.containsKey(nums[i])){ // Si el número actual ya está en el mapa, significa que hemos encontrado el complemento
                output[0] = map.get(nums[i]); // Obtiene el índice del complemento desde el mapa
                output[1] = i; // El índice del número actual es el segundo índice
                return output; // Retorna el resultado
            }
            map.put(target - nums[i], i); // Guarda el complemento (target - nums[i]) y el índice actual en el mapa
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