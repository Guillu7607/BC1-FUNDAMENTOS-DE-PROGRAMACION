import java.util.Scanner;

public class MainExcepcionCuentaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear cuenta con saldo inicial
        CuentaBancaria cuenta = new CuentaBancaria(500.0);

        System.out.println("Saldo disponible: " + cuenta.getSaldo());
        System.out.print("Introduce la cantidad a retirar: ");

        // Leer entrada como texto y convertir
        String entrada = scanner.nextLine();

        try {
            double cantidad = Double.parseDouble(entrada);
            cuenta.retirar(cantidad);
            System.out.println("Retiro exitoso. Saldo restante: " + cuenta.getSaldo());

        } catch (NumberFormatException e) {
            System.out.println("Error: Debes introducir un número válido.");

        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
