import java.time.LocalDate;
import java.util.Scanner;
public class EdadCien {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Dime tu año de nacimiento: " );
    int year = scanner.nextInt();

    

    int actual = LocalDate.now().getYear();
    
    int edad = actual - year;
    System.out.printf("Tienes aproximadamente %d años. \n", edad);
    if (edad < 100) {
        System.out.printf("Te faltan %d años hasta los 100");
    }else{
    System.out.printf("Felicidades tienes mas de 100 años");
     
    }
}
}
