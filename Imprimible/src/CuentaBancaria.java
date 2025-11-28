public class CuentaBancaria implements Imprimible {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public void imprimir() {
        System.out.println("=== Información de la Cuenta Bancaria ===");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
