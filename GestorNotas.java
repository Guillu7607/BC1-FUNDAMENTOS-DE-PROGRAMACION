import java.util.Scanner;

public class GestorNotas {

    private static final int MAX_ESTUDIANTES = 10;

  
    private static String[] nombres = new String[MAX_ESTUDIANTES];
    private static double[] notas = new double[MAX_ESTUDIANTES];
    private static int cantidad = 0; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Elige una opción: ");
            while (!sc.hasNextInt()) {
                System.out.print("Introduce un número válido: ");
                sc.next();
            }
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1 -> registrarEstudiante(sc);
                case 2 -> calcularPromedioGeneral();
                case 3 -> mostrarEstadisticas();
                case 4 -> buscarEstudiante(sc);
                case 5 -> System.out.println("\n Saliendo del programa...");
                default -> System.out.println(" Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 5);

        sc.close();
    }

     private static void mostrarMenu() {
        System.out.println("\nGESTOR DE NOTAS");
        System.out.println("1. Registrar nuevo estudiante");
        System.out.println("2. Calcular promedio y calificación global");
        System.out.println("3. Mostrar estadísticas alumnos");
        System.out.println("4. Buscar un estudiante por nombre");
        System.out.println("5. Salir");
    }

    private static void registrarEstudiante(Scanner sc) {
        if (cantidad >= MAX_ESTUDIANTES) {
            System.out.println("\n No se pueden registrar más estudiantes (límite alcanzado).");
            return;
        }

        System.out.print("Introduce el nombre del estudiante: ");
        String nombre = sc.nextLine();

        double nota = -1;
        while (nota < 0 || nota > 10) {
            System.out.print("Introduce la nota (0-10): ");
            if (sc.hasNextDouble()) {
                nota = sc.nextDouble();
                sc.nextLine();
                if (nota < 0 || nota > 10) {
                    System.out.println(" La nota debe estar entre 0 y 10.");
                }
            } else {
                System.out.println(" Entrada no válida. Introduce un número.");
                sc.next();
            }
        }

        nombres[cantidad] = nombre;
        notas[cantidad] = nota;
        cantidad++;

        System.out.println(" Estudiante registrado correctamente.");
    }

    private static void calcularPromedioGeneral() {
        if (cantidad == 0) {
            System.out.println("\n No hay estudiantes registrados.");
            return;
        }

        double suma = 0;
        for (int i = 0; i < cantidad; i++) {
            suma += notas[i];
        }

        double promedio = suma / cantidad;
        String calificacion = (promedio >= 5) ? "Aprobado" : "Suspendido";

        System.out.printf("\nPromedio general: %.2f -> %s%n", promedio, calificacion);
    }

    private static void mostrarEstadisticas() {
        if (cantidad == 0) {
            System.out.println("\n No hay estudiantes registrados.");
            return;
        }

        double max = notas[0];
        double min = notas[0];
        int aprobados = 0, suspensos = 0;

        for (int i = 0; i < cantidad; i++) {
            if (notas[i] > max) max = notas[i];
            if (notas[i] < min) min = notas[i];
            if (notas[i] >= 6) aprobados++;
            else suspensos++;
        }

        System.out.println("\n--- Estadísticas ---");
        System.out.println("Nota más alta: " + max);
        System.out.println("Nota más baja: " + min);
        System.out.println("Cantidad de aprobados (≥6): " + aprobados);
        System.out.println("Cantidad de suspensos (<6): " + suspensos);
    }


   private static void buscarEstudiante(Scanner sc) {
        if (cantidad == 0) {
            System.out.println("\n No hay estudiantes registrados.");
            return;
        }

        System.out.print("Introduce el nombre a buscar: ");
        String nombreBuscado = sc.nextLine().trim();

        boolean encontrado = false;
        for (int i = 0; i < cantidad; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscado)) {
                System.out.println("🔹 " + nombres[i] + " tiene una nota de " + notas[i]);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println(" No se encontró ningún estudiante con ese nombre.");
        }
    }
}
