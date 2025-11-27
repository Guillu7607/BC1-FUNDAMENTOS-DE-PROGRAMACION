public class Electronico extends Producto {

    public Electronico(String nombre, int precio, int cantidad) {
        super(nombre, precio, cantidad);
    }

    @Override
    public void objeto() {
        System.out.println("Este es un producto electrónico: " + nombre + " Su garantia acaba en 2 años");
    }
}
