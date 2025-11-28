public class Libro implements Imprimible {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public void imprimir() {
        System.out.println("=== Información del Libro ===");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }
}
