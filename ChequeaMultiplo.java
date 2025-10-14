import java.util.Scanner;

public class ChequeaMultiplo {
    int Mult;

    public ChequeaMultiplo(int Mult) {
        this.Mult = Mult;
    }

    public boolean isMult(int num) {
        if (Mult == 0) {
            return false;
        }
        return num % Mult == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
        int multin = sc.nextInt();

        ChequeaMultiplo chek = new ChequeaMultiplo(multin);

        System.out.println("Ingrese su multiplo: ");
        int numver = sc.nextInt();

        if (chek.isMult(numver)) {
            System.out.println(numver + " es múltiplo de " + multin);
        } else {
            System.out.println(numver + " no es múltiplo de " + multin);
        }

        sc.close();
    }
}