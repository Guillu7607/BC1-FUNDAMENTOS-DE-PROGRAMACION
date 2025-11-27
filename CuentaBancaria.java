public class CuentaBancaria implements Imprimible {
    private String titular;
    private double saldo;

    public CuentaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    @Override
    public void imprimir() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}