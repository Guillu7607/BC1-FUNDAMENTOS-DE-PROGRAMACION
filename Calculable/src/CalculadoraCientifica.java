public class CalculadoraCientifica implements Calculable {

    @Override
    public double calcular(double a, double b) {
        // Operaciones científicas (potencia, raíz, trigonometría ejemplo)
        System.out.println("Operaciones científicas:");
        System.out.println("Potencia (a^b): " + Math.pow(a, b));
        System.out.println("Raíz cuadrada de a: " + Math.sqrt(a));
        System.out.println("Raíz cuadrada de b: " + Math.sqrt(b));
        System.out.println("Seno de a (rad): " + Math.sin(a));
        System.out.println("Coseno de b (rad): " + Math.cos(b));

        return 0;
    }
}