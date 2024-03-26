import java.util.Scanner;

public class ScannerBasic {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario desde la consola
        Scanner scanner = new Scanner(System.in);

        // Leer una cadena
        System.out.print("Ingresa una cadena: ");
        String inputString = scanner.nextLine();
        System.out.println("Cadena ingresada: " + inputString);

        // Leer un entero
        System.out.print("Ingresa un número entero: ");
        int inputInt = scanner.nextInt();
        System.out.println("Número entero ingresado: " + inputInt);

        // Limpiar el buffer después de leer un int para evitar problemas de lectura
        scanner.nextLine();

        // Leer un número en coma flotante
        System.out.print("Ingresa un número en coma flotante: ");
        double inputDouble = scanner.nextDouble();
        System.out.println("Número en coma flotante ingresado: " + inputDouble);

        // Limpiar el buffer después de leer un double para evitar problemas de lectura
        scanner.nextLine();

        // Leer un booleano
        System.out.print("Ingresa un valor booleano (true/false): ");
        boolean inputBoolean = scanner.nextBoolean();
        System.out.println("Valor booleano ingresado: " + inputBoolean);

        // Limpiar el buffer después de leer un boolean para evitar problemas de lectura
        scanner.nextLine();

        // Leer un número largo
        System.out.print("Ingresa un número largo: ");
        long inputLong = scanner.nextLong();
        System.out.println("Número largo ingresado: " + inputLong);

        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }
}
