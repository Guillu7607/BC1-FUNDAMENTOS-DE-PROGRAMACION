public class MainForma {
    public static void main(String[] args) {

        Forma circulo = new Circulo(5);
        Forma rectangulo = new Rectangulo(4, 6);

        System.out.println("---- Círculo ----");
        circulo.mostrarDescripcion();
        System.out.println("Área: " + circulo.calcularArea());

        System.out.println("\n---- Rectángulo ----");
        rectangulo.mostrarDescripcion();
        System.out.println("Área: " + rectangulo.calcularArea());
    }
}