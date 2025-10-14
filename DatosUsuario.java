import java.util.InputMismatchException;
import java.util.Scanner;

public class DatosUsuario {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
    boolean entradavalida = false;
    int age = 0;
    System.out.print("dime tu nombre completo; ");
    String name = scanner.nextLine();
   
    System.out.print("dime tu edad: ");
    while (!entradavalida) {
      System.out.print("Introduce tu edad");
      try{
        age = scanner.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("Entrada no valida, por favor introduzca un numero entero.");
        scanner.nextLine();
      }
    }

    System.out.print("dime tu altura: ");
    double height = scanner.nextDouble();

    System.out.print("Estudias? (True o False) " );
    boolean study = scanner.nextBoolean();

    System.out.printf("Tu nombre completo es: %s\n", name  );
    System.out.printf(" Tienes %d\n", age);
    System.out.printf("Mides: %.2f\n", height);
    System.out.printf(" Y es %b\n", study, " que estudias");
  }
}