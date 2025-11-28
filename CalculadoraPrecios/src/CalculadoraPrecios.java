import java.util.Scanner;

public class CalculadoraPrecios {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio base: ");
        double precioBase = sc.nextDouble();

        System.out.println("Tipo de cliente:");
        System.out.println("1. Estudiante");
        System.out.println("2. Adulto Mayor");
        System.out.println("3. VIP");
        System.out.println("4. Sin descuento");

        System.out.print("Seleccione una opción: ");
        int opcion = sc.nextInt();

        double descuento = 0;

        switch (opcion) {
            case 1:
                descuento = ConstantesDescuento.DESCUENTO_ESTUDIANTE;
                break;
            case 2:
                descuento = ConstantesDescuento.DESCUENTO_ADULTO_MAYOR;
                break;
            case 3:
                descuento = ConstantesDescuento.DESCUENTO_VIP;
                break;
            case 4:
                descuento = 0;
                break;
            default:
                System.out.println("Opción no válida. No se aplicará descuento.");
        }

        // Aplicar descuento
        double precioConDescuento = precioBase - (precioBase * descuento);

        // Aplicar IVA
        double precioFinal = precioConDescuento + (precioConDescuento * ConstantesDescuento.IVA);

        System.out.printf("Precio final: %.2f €\n", precioFinal);
    }
}