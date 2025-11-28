import java.util.Scanner;

public class EjemploNumberFormatException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        String entrada = scanner.nextLine();

        try {
            int numero = Integer.parseInt(entrada);  // Puede lanzar NumberFormatException
            System.out.println("Has introducido el número: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: El valor introducido no es un número válido.");
        }

        scanner.close();
    }
}