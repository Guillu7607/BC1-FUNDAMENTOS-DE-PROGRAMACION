import java.util.Scanner;
public class Primo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduce un numero entero: ");
    int num = scanner.nextInt();
    int prim = 2;
    boolean cond = false;
    while (prim <= num/ 2) {
      
      if (num % prim == 0) {
        cond = true;
        break;
      }
      ++prim;
    }

    if (!cond) {
      System.out.println("El numero " + num + " es primo.");
    } else {
      System.out.println("El numero " + num + " no es primo.");
    }
  }
}