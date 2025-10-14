import java.util.Scanner;

public class Nombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[3];  

        
        for (int i = 0; i < 3; i++) {
            System.out.print("Introduce el nombre " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }

        // Mostrar los nombres almacenados
        System.out.println("Los nombres ingresados son:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        scanner.close();
    }
}