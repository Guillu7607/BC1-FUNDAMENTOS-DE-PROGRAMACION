//Clase para ejecutar los metodos anteriores
public class MainVolador {
    public static void main(String[] args) {
        Volador ave = new Ave();
        Volador avion = new Avion();
//Ejecutamos los metodos de ave
        System.out.println("Ave");
        ave.volar();
        ave.aterrizar();
//Ejecutamos los metodos de avión
        System.out.println("\nAvión");
        avion.volar();
        avion.aterrizar();
    }
}
