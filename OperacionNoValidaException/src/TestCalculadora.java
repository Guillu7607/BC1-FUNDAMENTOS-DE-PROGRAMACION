import java.util.Scanner;

public class TestCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        try {
            System.out.print("Introduce el primer número: ");
            int a = Integer.parseInt(scanner.nextLine());

            System.out.print("Introduce el segundo número: ");
            int b = Integer.parseInt(scanner.nextLine());

            System.out.print("Introduce la operación (suma, resta, multiplicacion, division): ");
            String operacion = scanner.nextLine();

            int resultado = calc.calcular(a, b, operacion);
            System.out.println("Resultado: " + resultado);

        } catch (NumberFormatException e) {
            System.out.println("Error: Debes introducir números válidos.");
        } catch (OperacionNoValidaException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
