package MojoDojoJavaHouse.TiposPrimitivos;

public class OperadoresEjemplo {
    public static void main(String[] args) {
        // Declaración e inicialización de variables
        int a = 5;
        int b = 3;
        int c = 7;
        int d = 2;
        
        // Operadores de incremento y decremento
        int e = ++a; // Incremento de 'a' y asignación a 'e' (aumento antes de la evaluación)
        int f = b--; // Decremento de 'b' y asignación a 'f' (disminución después de la evaluación)
        
        // Operaciones aritméticas
        int suma = a + b * c / d; // Suma de 'a' y resultado de la operación b * c / d
        int resta = a - b; // Resta de 'a' y 'b'
        int multiplicacion = a * b; // Multiplicación de 'a' y 'b'
        int division = a / b; // División de 'a' y 'b'
        
        // Imprimir resultados
        System.out.println("El valor de a después de incremento es: " + a);
        System.out.println("El valor de b después de decremento es: " + b);
        System.out.println("La suma de a y b * c / d es: " + suma);
        System.out.println("La resta de a y b es: " + resta);
        System.out.println("La multiplicación de a y b es: " + multiplicacion);
        System.out.println("La división de a y b es: " + division);
    }
}
