import java.util.Scanner;

import javax.print.attribute.standard.Media;
public class NumerosDel1Al10F {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Valor de n: ");
    int n = scanner.nextInt();
    int suma =0;
    double media;

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            suma+=i;
        }
    
    media=suma/n;
    System.out.println("La suma es: " + suma);
    System.out.printf("La media es:%f", media);
    }

}