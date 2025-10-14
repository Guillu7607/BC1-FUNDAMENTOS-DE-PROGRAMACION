import java.util.Scanner;
public class Divisores {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     

     System.out.println("Di un número: ");
     int num = scanner.nextInt();
     for(int i = 1 ; i <=num ; i++){
        if (num % i==0){
         System.out.print (  i+" " );
        }   
    }
}
}
