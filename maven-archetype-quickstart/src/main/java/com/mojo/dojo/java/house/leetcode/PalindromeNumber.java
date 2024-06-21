package com.mojo.dojo.java.house.leetcode;

public class PalindromeNumber {

    public boolean isPalindrome(int x){
        if( x < 0) return false;

        String str = Integer.toString(x);
        for(int  i = 0; i < str.length()/2 ; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    /*
            Para determinar si un número entero es un palíndromo sin convertirlo a una cadena en Java, puedes hacerlo mediante manipulación matemática. 

            1.- Manejo de números negativos: Un número negativo no puede ser un palíndromo.
            2.- Manejo de números que terminan en 0: Un número que termina en 0 (excepto el propio 0) no puede ser un palíndromo.
            3.- Revertir la mitad del número: Revertimos la segunda mitad del número y comparamos con la primera mitad.
    */

    public boolean isPalindromeMath(int x){
        // los numeros negativos no pueden ser un palindromo
        if( x < 0 ) return false;

        // los numeros que terminan en cero no son palindromos
        // El operador de módulo (%) devuelve el resto de la división de x entre 10.
        // Si x % 10 es igual a 0, significa que x es divisible por 10, lo cual implica que el último dígito de x es 0.
        if(x != 0 && x % 10 == 0){
            return false;
        }

        int reversedHalf = 0;
        
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }


        // Cuando el número tiene una cantidad impar de dígitos, descartamos el dígito del medio
        return x == reversedHalf || x == reversedHalf / 10;
    }
}


/*
 El bucle continúa ejecutándose mientras x sea mayor que reversedHalf
  while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        x % 10 obtiene el último dígito de x
        reversedHalf * 10 desplaza los dígitos de reversedHalf una posición a la izquierda.
        x /= 10 elimina el último dígito de x


        Ejemplo 1: Número par de dígitos (1221)
        Inicio:

        x = 1221
        reversedHalf = 0
        
        Primera Iteración:
        reversedHalf = 0 * 10 + 1221 % 10 = 1
        x = 1221 / 10 = 122
        Segunda Iteración:

        reversedHalf = 1 * 10 + 122 % 10 = 12
        x = 122 / 10 = 12
        Fin del Bucle:

        x = 12
        reversedHalf = 12
        La condición x > reversedHalf ya no se cumple, el bucle se detiene.





 */