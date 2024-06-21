package com.mojo.dojo.java.house.leetcode;


import java.util.ArrayList;
import java.util.List;


/*
 * Given a non-negative integer numRows, generate the first numRows 
 * of Pascal's triangle
 */

public class PascalTriangle {
    
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> output = new ArrayList<>();

        List<Integer> cur = new ArrayList<>();              // cur es una lista que representará la fila actual del triángulo de Pascal.
        for(int i = 0; i<numRows;i++){                      // Se inicia un bucle for que se ejecutará numRows veces para generar cada fila.
            cur.add(0,1);                                   // En cada iteración del bucle, se añade 1 al principio de la lista cur.
            
            for(int x =1; x<cur.size() -1; x++){               // Este bucle interno se utiliza para actualizar los elementos de cur, excepto el primero y el último
                cur.set(x, cur.get(x) + cur.get(x+1));       // Cada elemento en cur (excepto los extremos) se actualiza a la suma de sí mismo y el siguiente elemento en la lista.       
            }

            output.add(new ArrayList<>(cur));               // Después de actualizar los elementos de la fila cur, se añade una copia de cur a output.
        }
        return output;
    }
}


/*
 El triángulo de Pascal es una estructura en la que cada número es la suma de los dos números directamente arriba de él en la fila anterior. La primera fila es solo 1, y cada fila comienza y termina con 1.

Por ejemplo, los primeros 5 niveles del triángulo de Pascal son:

    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1



 */