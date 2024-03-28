package MojoDojoJavaHouse.TiposPrimitivos;


public class Primitivos {
    //Tipos enteros

    /*
     * byte 8 bits
     * short 16 bits
     * int 32 bits
     * long 64 bits
     * float 32 bits
     * double 64 bits
     */

     /*
      Estos tipos primitivos son eficientes en cuanto a memoria y rendimiento, 
      ya que representan valores directamente en la memoria y no requieren objetos adicionales. 
      Además, son inmutables, lo que significa que una vez que se ha asignado 
      un valor a un tipo primitivo, no se puede cambiar directamente.
      */


      /*
      Se consciente de donde se almacenan los tipos primitivos
      cuando son variables locales se almacenan en el stack
      Cuando son variables de instancia se almacenan en el heap

      Cuidado con crear demasiadas variables locales ya que puedes encontrarte con un stack overflow       
       */

       public static void main(String[] args) {
        
        // PRIMITIVOS ENTEROS
        byte b = 120;
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte:" + Byte.MAX_VALUE);

        short s =32766;
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short:" + Short.MAX_VALUE);

        int i = 2147483646;
        System.out.println("Valor minimo int:" + Integer.MIN_VALUE);
        System.out.println("Valor maximo int:" + Integer.MAX_VALUE);

        long l = 9223372036854775807L;
        System.out.println("Valor minimo long:" + Long.MIN_VALUE);
        System.out.println("Valor maximo long:" + Long.MAX_VALUE);

        //PRIMITIVOS PUNTO FLOTANTE

        //float: por default los valores decimales en Java son de tipo double
        //por lo cual para declarar una variable de tipo float explicitamente puede ser así

        float f = 10.0F;
        f=11.0F;
        f= (float) 12.0;
        System.out.println("valor minimo float: " + Float.MIN_VALUE);
        System.out.println("valor maximo float: " + Float.MAX_VALUE);
        System.out.println("valor minimo en representacion decimal: " + String.format("%.0f", Float.MAX_VALUE));

        double d = 10;
        System.out.println("valor minimo double: " + Double.MIN_VALUE);
        System.out.println("valor maximo double: " + Double.MAX_VALUE);
        System.out.println("valor minimo en representacion decimal: " + String.format("%.0f", Double.MAX_VALUE));
       }
}
