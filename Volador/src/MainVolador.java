public class MainVolador {

    public static void main(String[] args) {

        Volador ave = new Ave();
        Volador avion = new Avion();

        System.out.println("---- Ave ----");
        ave.volar();
        ave.aterrizar();

        System.out.println("\n---- Avión ----");
        avion.volar();
        avion.aterrizar();
    }
}