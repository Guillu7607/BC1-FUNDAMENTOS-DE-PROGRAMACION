import java.util.Scanner;

public class ValidarHora {

   
    public static boolean esHoraValida(int hora, int minuto, int segundo) {
        return (hora >= 0 && hora <= 23) &&
               (minuto >= 0 && minuto <= 59) &&
               (segundo >= 0 && segundo <= 59);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Introduce la hora (0-23): ");
        int hora = sc.nextInt();

        System.out.print("Introduce los minutos (0-59): ");
        int minuto = sc.nextInt();

        System.out.print("Introduce los segundos (0-59): ");
        int segundo = sc.nextInt();

        
        if (esHoraValida(hora, minuto, segundo)) {
            System.out.println("La hora introducida es válida: "
                    + String.format("%02d:%02d:%02d", hora, minuto, segundo));
        } else {
            System.out.println("La hora introducida NO es válida.");
        }

        sc.close();
    }
}