//Pasar de Celsius a Farenheit

import java.util.Scanner;

public class CelsiusaFarenheit {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Escribe una temperatura en grados Celsius: ");
    double celsius = scanner.nextDouble();

    double farenheit = (celsius * 9/5) + 32;
    System.out.println("La temperatura en Farenheit es: " + farenheit);
    scanner.close();
  }
}
