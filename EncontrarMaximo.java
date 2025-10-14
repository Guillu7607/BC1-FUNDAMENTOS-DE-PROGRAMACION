public class EncontrarMaximo {
  public static void main(String[] args) {
    int[] orden = {144, 333, 1234234, 3, 54, 9999, 353545};

    int maximo = orden[0];

    for (int j : orden) {
      if (j > maximo)
        maximo = j;
    }
    System.out.println("El numero máximo es: " + maximo);
  }
}