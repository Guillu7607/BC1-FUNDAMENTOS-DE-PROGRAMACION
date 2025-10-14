import java.util.Scanner;

class Libro {

    
    private String titulo;
    private String autor;
    private int añoPublicacion;
    public Libro(String titulo, String autor, int añoPublicacion){
        System.out.println("El libro se titula " + titulo + ", su autor es " + autor + " y se publicó en " + añoPublicacion);
    }
}
public class MainLibro {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El Ingenioso Hidalgo Don Quijote de la Mancha", "Miguel de Cervantes", 1605);
    }

    
}