import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        String input = sc.nextLine();

        try{
           int numero =Integer.parseInt(input);
        }
        catch(NumberFormatException e){
            System.out.println("Error; "+e.getMessage());
        }
        finally{
            System.out.println("Esto siempre se ejecuta");
        }
    }
}