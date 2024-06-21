package com.mojo.dojo.java.house.TiposPrimitivos;

//https://en.wikipedia.org/wiki/List_of_Unicode_characters

public class CharExample {
    public static void main(String[] args) {
        // Declaración de variables char con códigos Unicode y decimales
        char h = '\u0048'; // Código Unicode para 'H'
        char o = '\u006F'; // Código Unicode para 'o'
        char l = '\u006C'; // Código Unicode para 'l'
        char a = '\u0061'; // Código Unicode para 'a'
        char espacio = '\u0020'; // Código Unicode para espacio
        char m = 77; // Código decimal para 'M'
        char u = 117; // Código decimal para 'u'
        char n = 110; // Código decimal para 'n'
        char d = 100; // Código decimal para 'd'
        char exclamacion = '\u0021'; // Código Unicode para '!'
        
        // Imprimir la cadena "Hola Mundo!"
        System.out.println("" + h + o + l + a + espacio + m + u + n + d + o + exclamacion);


        int variableSimbolo = '!';
        System.out.println("Un caracter se puede almacenar en un int pero imprime su valor decimal: " + variableSimbolo);
    }
}

