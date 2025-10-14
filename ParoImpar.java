import java.util.Scanner;

public class ParoImpar {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

      System.out.print("dime un número; ");
       int num = scanner.nextInt();
       if (num == 0){
       System.out.print("El número es cero");
       }else if (num % 2 == 0){
        System.out.print("El número es par");
       }else{
        System.out.print("El número es impar");
       }
    }
}
