//Crea un programa que calcule el área de un circulo dado su radio

    <br> Normal,<sup>Esto es un superindice</sup>

    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduce el radio del círculo: ");
    double radio = scanner.nextDouble();

    double área = Math.PI * Math.pow (radio, 2);
    System.out.println("El área del círculo es: " + área);
    scanner.close();
  }
}