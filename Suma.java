public class Suma {
    public static void main(String[] args) {
        int array[] = new int[] {4, 5, 2, 7, 1};
        int suma = 0;
        for (int i=0; i<array.length; i++){
          suma += array[i];
}
    System.out.println("Esta es la suma del array: " + suma);
}
}