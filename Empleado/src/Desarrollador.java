public class Desarrollador extends Empleado {
    private String lenguajeProgramacion;

    public Desarrollador(String nombre, double salario, String departamento, String lenguajeProgramacion) {
        super(nombre, salario, departamento);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Lenguaje de Programación: " + lenguajeProgramacion);
    }
}