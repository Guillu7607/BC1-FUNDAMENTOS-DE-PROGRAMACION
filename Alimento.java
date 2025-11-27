public class Alimento extends Producto {

    public Alimento(String nombre, int precio, int cantidad) {
        super(nombre, precio, cantidad);
    }

    @Override
    public void objeto() {
        System.out.println("Este es un alimento: " + nombre + " Su fecha de caducidad es...");
    }
}