import java.util.Scanner;
public class SumaNumeros {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sumatotal = 0;
    int num = 0;
    System.out.println("Dime numeros y los sumaré (Negativo si quieres parar): ");
   do {
    num = scanner.nextInt();
     if (num >=0){
      sumatotal=sumatotal+num;
      System.out.println("Dime numeros y los sumaré (Negativo si quieres parar): ");
   


     
   }
   

    } while(num>=0);
    
    System.out.println("La suma es:" +sumatotal);
}
}