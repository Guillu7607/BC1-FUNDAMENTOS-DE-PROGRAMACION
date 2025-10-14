import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
     System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();
        
        scanner.close();
        System.out.printf("Suma: %d\n", num1 + num2);
        System.out.printf("Resta: %d\n", num1 - num2);
        System.out.printf("Multiplicación: %d\n", num1 * num2);
        
        if (num2 != 0){
          System.out.printf("División: %d\n", num1 / num2);
        } else {
          System.out.println("División: no se muede dividir entre 0");
        }
  }
}