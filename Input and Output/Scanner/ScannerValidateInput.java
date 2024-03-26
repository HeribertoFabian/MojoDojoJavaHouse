import java.util.InputMismatchException;
import java.util.Scanner;

// La siguiente clase muestra un ejemplo de como usar la clase Scanner para validar
// lo que el usuario ingresó y forzarlo a ingresar el valor correcto
public class ScannerValidateInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer un numero entero
        int number;
        while (true) {
            System.out.println("Ingresa un numero entero: ");
            try {
                number = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: debes ingresar un numero entero");
                scanner.next(); // Limpiar el buffer del scanner
            }
        }
        System.out.println("Numero entero ingresado: " + number);

        // Leer un valor booleano
        boolean flag;
        while (true) {
            System.out.println("Ingresa un valor booleano (true/false)");
            try {
                flag = scanner.nextBoolean();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: debes ingresar un valor booleano true/false");
                scanner.next();
            }
        }
        System.out.println("El valor boelano ingresado es: " + flag);

        // Leer un numero en coma flotante
        double valorDecimal;
        while (true) {
            System.out.println("Ingresa un valor decimal: ");
            try {
                valorDecimal = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("ERROR: debes ingresar un valor decimal");
                scanner.next(); // Limpiar el buffer
            }
        }
        System.out.println("El valor decimal ingresado es: " + valorDecimal);

        scanner.close();
    }

}
