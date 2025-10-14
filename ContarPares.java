import java.util.Scanner;
public class ContarPares {
    public static void main(String[] args) {
       int [] number = {1, 3, 5 ,7 ,3 ,4 ,6, 36};
       int counter = 0;
       for (int i=0; i<number.length;i++ ){
        if (number [i] %2 !=0){
            counter++;
        }
       }
   System.out.println("Los numeros impares que tienes son: " + counter);

       
}
}