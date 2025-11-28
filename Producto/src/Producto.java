public class Producto {

    private double precio;

    public Producto(double precioInicial) {
        this.precio = precioInicial;
    }

    public double getPrecio() {
        return precio;
    }

    public void actualizarPrecio(double nuevoPrecio) throws PrecioInvalidoException {
        if (nuevoPrecio < 0) {
            throw new PrecioInvalidoException("El precio no puede ser negativo: " + nuevoPrecio);
        }
        this.precio = nuevoPrecio;
    }
}