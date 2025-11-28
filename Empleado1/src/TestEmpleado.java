public class TestEmpleado {
    public static void main(String[] args) {

        Gerente g = new Gerente("Ana López", 5000, "Administración", 1200);
        Desarrollador d = new Desarrollador("Carlos Pérez", 4000, "Tecnología", "Java");

        g.mostrarInfo();
        d.mostrarInfo();
    }
}
