public class GestionEmpresa {

    // Array global de empleados (máximo 10)
    static Empleado[] empleados = new Empleado[10];
    static int contador = 0;

    // Método para contratar empleados
    public static void contratarEmpleado(String nombre, double salario, String departamento) {
        if (contador < empleados.length) {
            empleados[contador] = new Empleado(nombre, salario, departamento);
            System.out.println("Empleado contratado: " + nombre);
            contador++;
        } else {
            System.out.println("No se pueden contratar más empleados (límite alcanzado).");
        }
    }

    // Mostrar lista de empleados
    public static void mostrarEmpleados() {
        System.out.println("\n--- Lista de Empleados ---");
        for (int i = 0; i < contador; i++) {
            empleados[i].mostrarInfo();
        }
    }

    // Calcular nómina total
    public static double calcularNomina() {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            total += empleados[i].salario;
        }
        return total;
    }

    // Buscar empleado por nombre
    public static void buscarEmpleado(String nombre) {
        System.out.println("\nBuscando empleado: " + nombre);
        boolean encontrado = false;

        for (int i = 0; i < contador; i++) {
            if (empleados[i].nombre.equalsIgnoreCase(nombre)) {
                System.out.println("Empleado encontrado:");
                empleados[i].mostrarInfo();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No existe un empleado con ese nombre.");
        }
    }

    // Método main para demostrar funcionamiento
    public static void main(String[] args) {

        // Contratación de 4 empleados
        contratarEmpleado("Ana",   1500, "Ventas");
        contratarEmpleado("Luis",  1800, "Marketing");
        contratarEmpleado("Marta", 2000, "Finanzas");
        contratarEmpleado("Pedro", 1700, "Recursos Humanos");

        // Mostrar todos los empleados
        mostrarEmpleados();

        // Calcular y mostrar la nómina total
        System.out.println("\nNómina total: " + calcularNomina() + " €");

        // Buscar empleados
        buscarEmpleado("Marta");
        buscarEmpleado("Carlos"); // no existe

    }
}
