public class Matriz {
    public static int sumaElementos(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }

    public static int maximoElemento(int[][] matriz) {
        int max = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
            }
        }
        return max;
    }

    public static int minimoElemento(int[][] matriz) {
        int min = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < min) {
                    min = matriz[i][j];
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[][] matriz = {
            {3, 5, 7},
            {1, 6, 9},
            {4, 8, 2}
        };

        System.out.println("Suma de elementos: " + sumaElementos(matriz));
        System.out.println("Máximo elemento: " + maximoElemento(matriz));
        System.out.println("Mínimo elemento: " + minimoElemento(matriz));
    }
}