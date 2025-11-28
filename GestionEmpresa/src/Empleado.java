public class Empleado {
    String nombre;
    double salario;
    String departamento;

    public Empleado(String nombre, double salario, String departamento) {
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre +
                " | Salario: " + salario +
                " | Departamento: " + departamento);
    }
}
