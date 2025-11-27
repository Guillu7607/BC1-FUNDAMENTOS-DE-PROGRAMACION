// Interfaz
public interface Volador {
    //Metodo abstracto
    void volar();
//Metodo default
    default void aterrizar() {
        System.out.println("Aterriza de forma mormal.");
    }
}