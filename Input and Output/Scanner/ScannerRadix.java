import java.util.Scanner;

public class ScannerRadix {
    public static void main(String[] args) {
        // Crear un objeto Scanner que lea la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Establecer la base numérica a hexadecimal
        scanner.useRadix(16);

        // Leer un número hexadecimal
        System.out.print("Ingresa un número hexadecimal: ");
        int hexadecimalNumber = scanner.nextInt();

        // Mostrar el número hexadecimal leído
        System.out.println("Número hexadecimal leído: " + hexadecimalNumber);

        // Establecer la base numérica a binaria
        scanner.useRadix(2);

        // Leer un número binario
        System.out.print("Ingresa un número binario: ");
        int binaryNumber = scanner.nextInt();

        // Mostrar el número binario leído
        System.out.println("Número binario leído: " + binaryNumber);

        // Cerrar el Scanner
        scanner.close();
    }
}
