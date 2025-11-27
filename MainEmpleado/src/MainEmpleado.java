public class MainEmpleado {
    public static void main(String[] args) {
        Empleado empleado1 = new EmpleadoAsalariado("Ana", 1000);
        Empleado empleado2 = new EmpleadoPorHoras("Ana", 8, 10);

        System.out.println(empleado1.nombre + " - salario" + empleado1.calcularSalario);
        System.out.println(empleado2.nombre + " - salario" + empleado2.calcularSalario);
    }
}
