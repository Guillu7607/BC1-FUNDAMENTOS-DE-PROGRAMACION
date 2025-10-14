import java.util.Scanner;

class Estudiante {
    private String nombre;
    private String carrera;
    private int edad;

    public Estudiante(String nombre, String carrera, int edad){
        System.out.println("Hola soy " + nombre + ", estudio " + carrera + " y mi edad es " + edad);
    }
}
public class MainEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Sergio Pérez", "Ingenieria informática", 19);
    }

    
}



