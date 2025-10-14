import java.util.Scanner;

public class SumaDiagonal {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
      //Matriz
         int[][] matriz = {{3, 5, 7},{1, 6, 9},{4, 8, 2}};
        

        int suma = 0;
     //Forma la suma e imprime la matriz
        for(int i = 0; i < 3; ++i){

            for(int j = 0; j < 3; ++j){

                System.out.print(matriz[i][j]+" ");

                if (i == j){
                    
                    suma += matriz[i][j];

                }

            }

            System.out.println("");

        }
//Muestra la suma
        System.out.println("La suma de la diagonal principal es: "+ suma);

    }

}