public class TestAnimal {
    public static void main(String[] args) {
        // Creamos un arreglo de tipo Animal
        Animal[] animales = new Animal[3];

        // Agregamos objetos de tipo Perro y Gato
        animales[0] = new Perro();
        animales[1] = new Gato();
        animales[2] =new Animal();
        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}