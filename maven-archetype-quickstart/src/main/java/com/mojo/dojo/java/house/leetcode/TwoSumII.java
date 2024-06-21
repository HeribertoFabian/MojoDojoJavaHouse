package com.mojo.dojo.java.house.leetcode;

public class TwoSumII {
    public int[] twoSumSolution(int[] arre, int target){
        int[] output = new int[2];

        int start = 0;
        int end = arre.length - 1;
        while(start<end){
            int sum = arre[start] + arre[end];
            if (sum == target) {    // Si sum es igual a target, hemos encontrado la solución y retornamos los índices (incrementados en 1 porque la respuesta debe ser 1-based).
                output[0]=start+1;
                output[1]=end+1;
                return output;
            }
            else if (sum > target){         // Si la suma es mayor que el objetivo
                end --;                     // necesitamos una suma menor. Dado que el array está ordenado, podemos intentar disminuir la suma moviendo el puntero end a la izquierda.
            }
            else if (sum < target) {        // Si la suma es menor que el objetivo
                start++;                    // ecesitamos una suma mayor. Dado que el array está ordenado de forma ascendente, podemos intentar aumentar la suma moviendo el puntero start a la derecha.
            }
        }
        return output;

    }
}


/*
 * Given an array of integers that is already sorted in ascending order, find two numbers such that
 * they add up to a specific target number.
 * 
 * The function twoSum should return indices of the two numbers, such that they add up to the target,
 * where index1 must be less than index2
 * 
 * Note: 
 *  - Your returned answers (both index1 and index2) are not zero-based
 *  - You may assume that each input would have exactly one solution and you may not use the same element twice
 * 
 * Example:
 * Input: numbers = [2,7,11,15], target= 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9, Therefore index1 = 1 and index2=2
 */

 
 /*    SPANISH VERSION
  * Dado un array de enteros ordenado en orden ascendente y un entero objetivo, encuentra dos números en el array que sumen el objetivo dado. 
  Devuelve los índices de los dos números (no los valores) en una base 1 (es decir, los índices son 1-based, no 0-based).
  */