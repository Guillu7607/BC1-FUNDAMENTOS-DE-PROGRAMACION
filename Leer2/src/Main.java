import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Paso 1: Definir el array
        int[] numeros = {1, 3, 6, 2, 7, 2, 5, 5};

        // Invertir el array
        for (int i = 0; i < numeros.length / 2; i++) {
            int j = numeros.length - i - 1;
            int a = numeros[i];
            int b = numeros[j];
            numeros[i] = b;
            numeros[j] = a;
        }

        // Imprimir el array invertido
        System.out.println("Este es el array invertido: " + Arrays.toString(numeros));
    }
}