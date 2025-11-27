public class Libro implements Imprimible {
    protected String titulo;
    protected String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public void imprimir() {
        System.out.println("Libro: " + titulo);
        System.out.println("Autor: " + autor);
    }
}