public class TestCuentaBancaria {
    public static void main(String[] args) {

        Cuenta[] cuentas = new Cuenta[3];

        cuentas[0] = new Cuenta("112256", 5000, "Mario Vazquez");
        cuentas[1] = new CuentaAhorros("1185737", 1500, "Victor Arias");
        cuentas[2] = new CuentaCorriente("8899", -5, "Sergio Fernandez");

        cuentas[0].mostrarDatos();
        cuentas[1].mostrarDatos();
        ((CuentaAhorros) cuentas[1]).interes();
        cuentas[2].mostrarDatos();
        ((CuentaCorriente) cuentas[2]).sobregiro();
    }
}