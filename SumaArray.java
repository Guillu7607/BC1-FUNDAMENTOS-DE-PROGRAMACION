public class SumaArray {
    public static void main(String[] args) {
        
    

     int[] numeros={4, 5, 7, 3, 8, 3422, 2};
     int resultado = sumarElementosArray(numeros);

     System.out.println("La suma de elementos del array es: " + resultado);

}


public static int sumarElementosArray(int[] mum){
       int suma = 0;
       for (int i = 0; i < num.length; i++) {
        suma += num[i];
       }
       return suma;
    }

}