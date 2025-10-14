import java.util.Scanner;

public class InversoCaracteresString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Introduce un texto: ");
        String texto = scanner.nextLine();

        // Mostrar el string en orden inverso
        System.out.print("Texto en orden inverso: ");
        for (int i = texto.length() - 1; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }

        System.out.println(); // Nueva línea al final
        scanner.close();
    }
}
