import java.util.Scanner;

public class TestEmpleado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Registro de Empleado ===");

        // Nombre
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = sc.nextLine();

        // Puesto
        System.out.print("Ingrese el puesto (Gerente / Desarrollador): ");
        String puesto = sc.nextLine().toLowerCase();

        // Salario
        System.out.print("Ingrese el salario: ");
        double salario = sc.nextDouble();
        sc.nextLine(); // limpiar buffer

        // Departamento
        System.out.print("Ingrese el departamento: ");
        String departamento = sc.nextLine();

        Empleado empleado;

        if (puesto.equals("gerente")) {
            // Si es gerente
            System.out.print("Ingrese el bono: ");
            double bono = sc.nextDouble();

            empleado = new Gerente(nombre, salario, departamento, bono);

        } else if (puesto.equals("desarrollador")) {
            // Si es desarrollador
            System.out.print("Ingrese el lenguaje de programación: ");
            String lenguaje = sc.nextLine();

            empleado = new Desarrollador(nombre, salario, departamento, lenguaje);

        } else {
            System.out.println("Puesto inválido. Se creará como empleado genérico.");
            empleado = new Empleado(nombre, salario, departamento);
        }

        // Mostrar resultados
        System.out.println("\n=== Información del Empleado ===");
        empleado.mostrarInformacion();

        sc.close();
    }
}
