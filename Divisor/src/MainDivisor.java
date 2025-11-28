import java.util.Scanner;

public class MainDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Divisor divisor = new Divisor();

        try {
            System.out.print("Introduce el primer número (a): ");
            int a = Integer.parseInt(scanner.nextLine());

            System.out.print("Introduce el segundo número (b): ");
            int b = Integer.parseInt(scanner.nextLine());

            int resultado = divisor.dividir(a, b);
            System.out.println("Resultado de la división: " + resultado);

        } catch (NumberFormatException e) {
            System.out.println("Error: Debes introducir números enteros válidos.");

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
