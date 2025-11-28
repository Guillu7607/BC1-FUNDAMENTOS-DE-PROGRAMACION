public class EmpleadoPorHoras extends Empleado {
    private double horasTrabajadas;
    private double pagoPorHora;

    public EmpleadoPorHoras(String nombre, double horasTrabajadas, double pagoPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public double calcularSalario() {
        return  pagoPorHora;
    }
}
