import java.util.Scanner;

class Animal {
    private String nombre;
    private String especie;
    private int edad;

    public Animal(String nombre, String especie, int edad){
        System.out.println("Su nombre es " + nombre + ", es de la especie " + especie + " y su edad es " + edad);
    }
}
public class MainAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Bobo","Chimpanzé rojo", 12);
    }

    
}

