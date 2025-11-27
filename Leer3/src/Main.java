import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int n = sc.nextInt();
        System.out.println("Cuantos multiplos quieres?: ");
        int dimension = sc.nextInt();
        int[] multiplos = new int[dimension];

        for (int i = 0; i < dimension; i++) {  // < en lugar de <=
            double resultado;
            resultado = Math.pow(n, i+1);
            multiplos[i] = (int) resultado;
        }

        for (int i = 0; i < multiplos.length; i++) {  // < en lugar de <=
            System.out.println(multiplos[i] + " ");
        }
    }
}
