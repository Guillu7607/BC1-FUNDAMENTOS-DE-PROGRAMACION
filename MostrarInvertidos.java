import java.util.Scanner;
public class MostrarInvertidos {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
       int [] array = {4, 6, 2, 8, 7};
       
       System.out.println("Este es el array invertido: ");
       mostrararrayInvertido(array);
    }


    public static void mostrararrayInvertido(int[] array) {
            for (int i=array.length -1; i>=0; i--) {
                System.out.println(array[i] + " ");
            }
            System.out.println();
    
}
}