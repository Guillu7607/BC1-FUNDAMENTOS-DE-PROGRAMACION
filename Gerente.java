public class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, double salario, String departamento, double bono) {
        super(nombre, salario, departamento);
        this.bono = bono;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Bono: " + bono);
    }
}