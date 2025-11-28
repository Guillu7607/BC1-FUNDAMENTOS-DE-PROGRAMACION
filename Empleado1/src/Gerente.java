public class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, double salario, String departamento, double bono) {
        super(nombre, salario, departamento);
        this.bono = bono;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Bono: " + bono);
        System.out.println("-------------------------");
    }
}
