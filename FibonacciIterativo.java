import java.util.Scanner;

public class FibonacciIterativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Que términos de la sucesión de Fibonacci quieres ver? : ");
        int n = scanner.nextInt();

        int a = 0, b = 1;

        System.out.println("Sucesion de Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }

        scanner.close();
    }
}