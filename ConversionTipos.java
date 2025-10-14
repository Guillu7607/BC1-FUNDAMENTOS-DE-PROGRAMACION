import java.util.Scanner;

public class ConversionTipos{
   public static void main(String[] args) {
     double d = 4.48;
     int entero;
     entero = (int) d; //Esto es una conversión implicita (cast)
     System.out.printf("El valor %f convertido a int es %d", d, entero);
   }
}