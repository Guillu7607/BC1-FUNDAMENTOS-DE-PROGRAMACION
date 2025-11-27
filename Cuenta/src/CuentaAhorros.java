public class CuentaAhorros extends Cuenta {

    public CuentaAhorros(String numeroCuenta, int saldo, String titular) {
        super(numeroCuenta, saldo, titular);
    }
    public void interes() {
        System.out.println("Se añade un interés del 2% cada año.");
    }

}
