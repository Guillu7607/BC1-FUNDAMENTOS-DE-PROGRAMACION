// Clase personalizada que simula FileNotFoundException
class FileNotFoundExceptionSimulada extends Exception {
    public FileNotFoundExceptionSimulada(String mensaje) {
        super(mensaje);
    }
}

// Clase que simula la lectura de un archivo
class LectorArchivo {
    public void abrirArchivo(String nombre) throws FileNotFoundExceptionSimulada {
        // Simulación: si el archivo no es "archivo.txt", lanzamos el error
        if (!nombre.equals("archivo.txt")) {
            throw new FileNotFoundExceptionSimulada("El archivo " + nombre + " no existe.");
        }

        System.out.println("Archivo abierto correctamente.");
    }
}


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