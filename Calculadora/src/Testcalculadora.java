public class Testcalculadora {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        try {
            System.out.println("Resultado: " + calculadora.calcular(10,5,"suma"));
            System.out.println("Resultado: " + calculadora.calcular(10,5,"division"));
            System.out.println("Resultado: " + calculadora.calcular(10,5,"prueba"));
        }catch(OperacionNoValida e){
            System.out.println("Error: " + e.getMessage());
        }catch(ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
