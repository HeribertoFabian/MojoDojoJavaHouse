package com.mojo.dojo.java.house.inputoutput.Scanner;

import java.util.Scanner;

public class ScannerDelimiter {
    public static void main(String[] args) {
        // Crear un objeto Scanner para analizar la cadena de entrada
        Scanner scanner = new Scanner("Juan,25,70");

        // Establecer el delimitador como ","
        scanner.useDelimiter(",");

        // Leer y mostrar cada token
        while (scanner.hasNext()) {
            String token = scanner.next();
            System.out.println("Token: " + token);
        }

        // Cerrar el Scanner
        scanner.close();
    }
}
