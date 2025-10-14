import java.util.Scanner;

public class VocalMayuscula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime una vocal en minúscula: ");
        String vocal = scanner.nextLine();

 
        switch (vocal) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                String mayus = vocal.toUpperCase();
                System.out.println("Esta es la mayúscula: " + mayus);
                break;
            default:
                System.out.println("No has introducido una vocal, o la has puesto en mayuscula.");

        }
         

        scanner.close();
}
}

     