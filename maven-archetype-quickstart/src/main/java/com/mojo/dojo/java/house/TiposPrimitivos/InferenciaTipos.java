package com.mojo.dojo.java.house.TiposPrimitivos;

public class InferenciaTipos {
    public static void main(String[] args) {

        // la palabra reservada var se introdujo en java 10
        var mensaje = "Hola, mundo!";
        // Debido a que un String no es un tipo primitivo se puede conocer el tipo de dato mediante el metodo getClass().getSimpleName() de la clase Object
        System.out.println("El tipo de la variable 'mensaje' es: " + mensaje.getClass().getSimpleName()); 






        // Declaración de variables con inferencia de tipo para diferentes tipos
        // primitivos
        var numeroInt = 10;
        var numeroByte = (byte) 10;
        var numeroShort = (short) 10;
        var numeroLong = 10L;
        var numeroFloat = 10.0f;
        var numeroDouble = 10.0;
        var caracter = 'A';
        var booleano = true;

        // Para las variables de tipo primitivo que no tienen acceso a los metodos de la clase object  se puede inferir de la siguiente forma
        System.out.println("El tipo de dato inferido por 'var' para numeroInt es: " + obtenerTipoDato(numeroInt));
        System.out.println("El tipo de dato inferido por 'var' para numeroByte es: " + obtenerTipoDato(numeroByte));
        System.out.println("El tipo de dato inferido por 'var' para numeroShort es: " + obtenerTipoDato(numeroShort));
        System.out.println("El tipo de dato inferido por 'var' para numeroLong es: " + obtenerTipoDato(numeroLong));
        System.out.println("El tipo de dato inferido por 'var' para numeroFloat es: " + obtenerTipoDato(numeroFloat));
        System.out.println("El tipo de dato inferido por 'var' para numeroDouble es: " + obtenerTipoDato(numeroDouble));
        System.out.println("El tipo de dato inferido por 'var' para caracter es: " + obtenerTipoDato(caracter));
        System.out.println("El tipo de dato inferido por 'var' para booleano es: " + obtenerTipoDato(booleano));

    }

    public static String obtenerTipoDato(Object variable) {
        if (variable instanceof Integer) {
            return "int";
        } else if (variable instanceof Byte) {
            return "byte";
        } else if (variable instanceof Short) {
            return "short";
        } else if (variable instanceof Long) {
            return "long";
        } else if (variable instanceof Float) {
            return "float";
        } else if (variable instanceof Double) {
            return "double";
        } else if (variable instanceof Character) {
            return "char";
        } else if (variable instanceof Boolean) {
            return "boolean";
        } else {
            return "desconocido";
        }
    }
}
