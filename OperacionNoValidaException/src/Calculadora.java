public class Calculadora {

    public int calcular(int a, int b, String operacion) throws OperacionNoValidaException {
        switch (operacion.toLowerCase()) {
            case "suma":
                return a + b;

            case "resta":
                return a - b;

            case "multiplicacion":
                return a * b;

            case "division":
                if (b == 0) {
                    throw new ArithmeticException("No se puede dividir entre cero.");
                }
                return a / b;

            default:
                throw new OperacionNoValidaException(
                        "Operación no válida: " + operacion +
                                ". Usa: suma, resta, multiplicacion o division."
                );
        }
    }
}
