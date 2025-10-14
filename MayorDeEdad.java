import java.time.LocalDate;
import java.util.Scanner;

public class MayorDeEdad {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce tu año de nacimiento: ");
     int born = scanner.nextInt();
     int aonow = LocalDate.now().getYear();
     if(aonow - born>18){
        System.out.print("Eres mayor de edad");
     }else{
        System.out.print("Eres menor de edad");
     }
    }
}
