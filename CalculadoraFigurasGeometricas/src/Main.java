import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Figura[] figuras = new Figura[20];
        int contador = 0;

        int opcion = 0;
        do {
            System.out.println("\n=== MENÚ ===");
            System.out.println("1. Crear Círculo");
            System.out.println("2. Crear Rectángulo");
            System.out.println("3. Crear Triángulo");
            System.out.println("4. Mostrar resumen de figuras");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1 -> {
                        System.out.print("Introduce el radio: ");
                        double radio = leerNumeroPositivo(sc);
                        figuras[contador++] = new Circulo(radio);

                        mostrarResultados(figuras[contador - 1]);
                    }

                    case 2 -> {
                        System.out.print("Introduce la base: ");
                        double base = leerNumeroPositivo(sc);
                        System.out.print("Introduce la altura: ");
                        double altura = leerNumeroPositivo(sc);
                        figuras[contador++] = new Rectangulo(base, altura);

                        mostrarResultados(figuras[contador - 1]);
                    }

                    case 3 -> {
                        System.out.print("Introduce lado 1: ");
                        double l1 = leerNumeroPositivo(sc);
                        System.out.print("Introduce lado 2: ");
                        double l2 = leerNumeroPositivo(sc);
                        System.out.print("Introduce lado 3: ");
                        double l3 = leerNumeroPositivo(sc);

                        figuras[contador++] = new Triangulo(l1, l2, l3);

                        mostrarResultados(figuras[contador - 1]);
                    }

                    case 4 -> {
                        System.out.println("\n=== RESUMEN DE FIGURAS ===");
                        for (int i = 0; i < contador; i++) {
                            Figura f = figuras[i];
                            System.out.printf("%d. %s | Área: %.2f | Perímetro: %.2f\n",
                                    i + 1,
                                    f.toString(),
                                    f.calcularArea(),
                                    f.calcularPerimetro());
                        }
                    }

                    case 5 -> System.out.println("Saliendo del programa...");

                    default -> System.out.println("Opción no válida.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: ingrese un número válido.");
                sc.nextLine();
            }

        } while (opcion != 5);

        sc.close();
    }

    // Valida que un número sea positivo
    public static double leerNumeroPositivo(Scanner sc) {
        double num;
        while (true) {
            try {
                num = sc.nextDouble();
                if (num <= 0) {
                    System.out.print("Debe ser positivo. Intente de nuevo: ");
                } else {
                    return num;
                }
            } catch (InputMismatchException e) {
                System.out.print("Entrada inválida. Intente de nuevo: ");
                sc.nextLine();
            }
        }
    }

    // Función para mostrar área y perímetro
    public static void mostrarResultados(Figura f) {
        System.out.printf("\nÁrea: %.2f\n", f.calcularArea());
        System.out.printf("Perímetro: %.2f\n\n", f.calcularPerimetro());
    }
}
