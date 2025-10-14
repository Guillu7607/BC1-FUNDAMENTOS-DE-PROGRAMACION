import java.util.Scanner;
public class DiasMes {
     public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("dime un mes (En números): ");
    int mes = scanner.nextInt();
    switch (mes){
        case 1: 
         System.out.println("Has elegido Enero que tiene 31 dias");
         break;
        case 2:
         System.out.println("Has elegido Febrero que tiene 28 o 29 dias");
         break;
        case 3:
         System.out.println("Has elegido Marzo que tiene 31 dias");
         break;
        case 4:
         System.out.println("Has elegido Abril que tiene 30 dias");
         break;
        case 5:
         System.out.println("Has elegido Mayo que tiene 31 dias");
         break;
        case 6:
         System.out.println("Has elegido Junio que tiene 30 dias");
         break;
        case 7:
         System.out.println("Has elegido Julio que tiene 31 dias");
         break;
        case 8:
         System.out.println("Has elegido Agosto que tiene 31 dias");
         break;
        case 9:
         System.out.println("Has elegido Septiembre que tiene 31 dias");
         break;
        case 10:
         System.out.println("Has elegido Octubre que tiene 31 dias");
         break;
        case 11:
         System.out.println("Has elegido Noviembre que tiene 30 dias");
         break;
        case 12:
         System.out.println("Has elegido Diciembre que tiene 31 dias");
         break;
        default: 
         System.out.println("Mes invalido");
    }

    }
    
}
