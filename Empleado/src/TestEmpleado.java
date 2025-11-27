public class TestEmpleado {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Laura Gómez", 5000.0, "Administración", 1200.0);
        Desarrollador desarrollador = new Desarrollador("Carlos Pérez", 3500.0, "Tecnología", "Java");

        System.out.println("=== Información del Gerente ===");
        gerente.mostrarInformacion();

        System.out.println("\n=== Información del Desarrollador ===");
        desarrollador.mostrarInformacion();
    }
}