public class Calculadora {

    public double calcular(int num1, int num2, String operacion) {
        switch (operacion.toLowerCase()) {
            case "suma":
                return (double) num1 + num2;
            case "resta":
                return (double) num1 - num2;
            case "multiplicacion":
                return (double) num1 * num2;
            case "division":
                if (num2 == 0) {
                    throw new ArithmeticException("No se puede dividir por cero");
                }
                return (double) num1 / num2;
            default:
                throw new OperacionNoValida("Operación no válida: " + operacion);
        }
    }
}