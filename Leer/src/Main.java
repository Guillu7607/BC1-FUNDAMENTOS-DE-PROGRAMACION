import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Paso 1: Definir el array
        int[] numeros = {1, 3, 6, 2, 7, 2, 5, 5};

        // Paso 2: Crear Scanner para leer del usuario
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número que desea buscar: ");
        int numeroBuscar = sc.nextInt();

        // Paso 3: Contar cuántas veces aparece el número
        int contador = 0;
        for (int num : numeros) {
            if (num == numeroBuscar) {
                contador++;
            }
        }

       if (contador >0) {
           System.out.println("El número " + numeroBuscar + " aparece " + contador + " veces en el array.");
       }else{
           System.out.println("el numero no aparece en el contador");
       }
        sc.close();
    }
}