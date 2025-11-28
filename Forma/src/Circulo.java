public class Circulo extends Forma {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println("El radio del circulo es " + radio);
    }
}