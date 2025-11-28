public class MainEmpleado {
    public static void main(String[] args) {

        Empleado empleado1 = new EmpleadoAsalariado("Ana López", 1500);
        Empleado empleado2 = new EmpleadoPorHoras("Carlos Pérez", 80, 15);

        empleado1.mostrarInfo();
        System.out.println("------------------");
        empleado2.mostrarInfo();
    }
}
