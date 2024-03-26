import java.util.Scanner;

/*
 * Clase que muestra el uso de findInLine y findWithinHorizon
 */
public class ScannerFind {

    public static void main(String[] args) {
        // Crear un objeto Scanner para analizar la cadena de entrada
        Scanner scanner = new Scanner("Nombre: Juan\nEdad: 25\nPeso: 70 kg");

        // Utilizar findInLine para buscar y extraer la edad
        int index = 1;
        while (scanner.hasNextLine()) {
            scanner.findInLine("Edad: "); // Solo busca en la linea actual
            if (scanner.hasNextInt()) {
                int edad = scanner.nextInt();
                System.out.println("Edad: " + edad + " encontrado en la linea " + index);
                break;
            } else {
                System.out.println("Edad no encontrada en la linea " + index);
                index++;
            }
            scanner.nextLine();
        }

        // Utilizar findWithinHorizon para buscar y extraer el peso
        scanner.findWithinHorizon("Peso: \\d+", 0);
        String peso = scanner.match().group().replaceAll("\\D+", ""); // Eliminar no dígitos
        System.out.println("Peso: " + peso);

        // Cerrar el Scanner
        scanner.close();
    }

}
