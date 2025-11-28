import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("\nElige la calculadora:");
        System.out.println("1. Básica");
        System.out.println("2. Científica");
        System.out.print("Opción (Pon 1 o 2): ");
        int opcion = sc.nextInt();

        Calculable calculadora;

        switch (opcion) {
            case 1:
                calculadora = new CalculadoraBasica();
                break;

            case 2:
                calculadora = new CalculadoraCientifica();
                break;

            default:
                System.out.println("Opción no válida.");
                sc.close();
                return;
        }

        System.out.println();
        calculadora.calcular(num1, num2);

        sc.close();
    }
}