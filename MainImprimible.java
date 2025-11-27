public class MainImprimible {
    public static void main(String[] args) {

        Imprimible libro = new Libro("1984", "George Orwell");
        Imprimible cuenta = new CuentaBancaria(1500, "Juan Perez");

        libro.print();
        cuenta.print();
    }
}