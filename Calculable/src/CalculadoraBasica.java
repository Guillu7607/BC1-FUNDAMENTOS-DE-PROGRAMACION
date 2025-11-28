public class CalculadoraBasica implements Calculable {

    @Override
    public double calcular(double a, double b) {
        // Operaciones básicas
        System.out.println("Operaciones básicas:");
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));

        if (b != 0) {
            System.out.println("División: " + (a / b));
        } else {
            System.out.println("División: No se puede dividir entre 0");
        }

        return 0;
    }
}