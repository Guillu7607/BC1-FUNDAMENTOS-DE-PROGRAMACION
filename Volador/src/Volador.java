public interface Volador {
    void volar(); // método abstracto

    default void aterrizar() { // método por defecto
        System.out.println("Aterrizando de forma estándar");
    }
}