import java.util.Scanner;

public class ContarCaracter {

    
    public int contarVecesCaracter(String cadena, char caracter) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la cadena
        System.out.print("Introduce una cadena: ");
        String cadena = scanner.nextLine();

   
        System.out.print("Introduce un carácter a buscar: ");
        char caracter = scanner.next().charAt(0);

     
        ContarCaracter contador = new ContarCaracter();
        int veces = contador.contarVecesCaracter(cadena, caracter);

        System.out.println("El carácter '" + caracter + "' aparece " + veces + " veces en la cadena.");

        scanner.close();
    }
}