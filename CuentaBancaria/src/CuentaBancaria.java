public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void retirar(double cantidad) throws SaldoInsuficienteException {
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException(
                    "Saldo insuficiente. Intentaste retirar " + cantidad +
                            " pero solo hay " + saldo + " en la cuenta."
            );
        }
        saldo -= cantidad;
    }
}
