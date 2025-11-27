public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(String numeroCuenta, int saldo, String titular) {
        super(numeroCuenta, saldo, titular);
    }
    public void sobregiro(){
        if (saldo<0){
            System.out.println("Saldo inexistente, se produce sobregiro.");
        }else {
            System.out.println("Saldo suficiente");
        }
    }
}
