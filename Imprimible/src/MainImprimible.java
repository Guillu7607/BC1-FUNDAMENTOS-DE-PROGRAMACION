public class MainImprimible {
    public static void main(String[] args) {

        Imprimible libro = new Libro("El Principito", "Antoine de Saint-Exupéry");
        Imprimible cuenta = new CuentaBancaria("Juan Pérez", 1500.75);

        libro.imprimir();
        System.out.println();
        cuenta.imprimir();
    }
}
