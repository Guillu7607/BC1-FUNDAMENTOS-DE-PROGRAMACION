// La clase implementa la interfaz
public class Ave implements Volador {
//Metodo que sobrescribe volar
    @Override
    public void volar() {
        System.out.println("El ave vuela batiendo sus alas.");
    }
//Metodo que sobrescribe aterrizar
    @Override
    public void aterrizar() {
        System.out.println("El ave aterriza con sus patas en el suelo.");
    }
}