import java.util.Scanner;

public class Datos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime la marca del vehículo:");
        String marca = scanner.nextLine();

        System.out.println("Dime el modelo del vehículo:");
        String modelo = scanner.nextLine();

        System.out.println("Dime el año del vehículo:");
        int anio = scanner.nextInt();

        System.out.println("¿Es un coche? (true/false)");
        boolean esCoche = scanner.nextBoolean();

        Vehiculo vehiculo;

        if (esCoche) {
            System.out.println("¿Cuántas puertas tiene?");
            int puertas = scanner.nextInt();
            vehiculo = new Coche(marca, modelo, anio, puertas);
        } else {
            System.out.println("¿Es una moto? (true/false)");
            boolean esMoto = scanner.nextBoolean();
            if (esMoto) {
                System.out.println("¿Cuál es la cilindrada?");
                int cilindrada = scanner.nextInt();
                vehiculo = new Moto(marca, modelo, anio, cilindrada);
            } else {
                vehiculo = new Vehiculo(marca, modelo, anio);
            }
        }

        System.out.println("\n--- Datos del vehículo ---");
        vehiculo.mostrarVehiculo();

        scanner.close();
    }
}