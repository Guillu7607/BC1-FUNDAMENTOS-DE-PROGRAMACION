public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto
    public abstract double calcularSalario();

    // Método común
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario calculado: " + calcularSalario());
    }
}
