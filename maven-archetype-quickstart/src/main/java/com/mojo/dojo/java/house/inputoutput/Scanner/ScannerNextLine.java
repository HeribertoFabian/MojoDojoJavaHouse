package com.mojo.dojo.java.house.inputoutput.Scanner;

import java.util.Scanner;

/*
 * El siguiente codigo muestra como usar la clase Scanner para leer un texto con mas de una linea
 */
public class ScannerNextLine {
    public static void main(String[] args) {
        // iniciamos la clase scanner con un constructor que recibe el texto usando el
        // delimitador \n para saltos de linea
        Scanner scanner = new Scanner("Out of the night that covers me,\n" +
                "Black as the pit from pole to pole,\n" +
                "I thank whatever gods may be\n" +
                "For my unconquerable soul.\n" +
                "\n" +
                "In the fell clutch of circumstance\n" +
                "I have not winced nor cried aloud.\n" +
                "Under the bludgeonings of chance\n" +
                "My head is bloody, but unbowed.\n" +
                "\n" +
                "Beyond this place of wrath and tears\n" +
                "Looms but the Horror of the shade,\n" +
                "And yet the menace of the years\n" +
                "Finds, and shall find me, unafraid.\n" +
                "\n" +
                "It matters not how strait the gate,\n" +
                "How charged with punishments the scroll,\n" +
                "I am the master of my fate,\n" +
                "I am the captain of my soul");

        // el metodo hasNextLine sirve para saber si aun existe una linea por leer
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine()); // se imprime
        }

        // cerramos el scanner
        scanner.close();
    }
}
