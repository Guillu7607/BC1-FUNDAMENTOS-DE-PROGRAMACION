// Clase principal
public class EjemploFileNotFoundException {
    public static void main(String[] args) {
        LectorArchivo lector = new LectorArchivo();

        try {
            lector.abrirArchivo("archivo_inexistente.txt"); // Simulación de error
        } catch (FileNotFoundExceptionSimulada e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}