import java.util.Arrays;
import java.util.Random;

public class Loteria {
    private int[] numeros;

    public Loteria() {
        numeros = new int[6];
        generarNumeros();
        Arrays.sort(numeros);
    }

    private void generarNumeros() {
        Random rand = new Random();
        int contador = 0;

        while (contador < 6) {
            int num = rand.nextInt(49) + 1; 

            if (!yaExiste(num, contador)) {
                numeros[contador] = num;
                contador++;
            }
        }
    }

    private boolean yaExiste(int num, int hasta) {
        for (int i = 0; i < hasta; i++) {
            if (numeros[i] == num) {
                return true; 
            }
        }
        return false;
    }

    public void mostrarNumeros() {
        System.out.print("Números de lotería: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Loteria miLoteria = new Loteria();
        miLoteria.mostrarNumeros();
    }
}
