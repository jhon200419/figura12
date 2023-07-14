import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elija una figura geométrica:");
        System.out.println("1. Triángulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Círculo");

        int opcionFigura = scanner.nextInt();

        Figura figura;

        switch (opcionFigura) {
            case 1:
                // Ingresar los lados del triángulo
                System.out.println("Ingrese el lado 1 del triángulo:");
                double lado1 = scanner.nextDouble();
                System.out.println("Ingrese el lado 2 del triángulo:");
                double lado2 = scanner.nextDouble();
                System.out.println("Ingrese el lado 3 del triángulo:");
                double lado3 = scanner.nextDouble();

                figura = new Triangulo(lado1, lado2, lado3);
                break;

            case 2:
                // Ingresar el lado del cuadrado
                System.out.println("Ingrese el lado del cuadrado:");
                double ladoCuadrado = scanner.nextDouble();

                figura = new Cuadrado(ladoCuadrado);
                break;

            case 3:
                // Ingresar el radio del círculo
                System.out.println("Ingrese el radio del círculo:");
                double radio = scanner.nextDouble();

                figura = new Circulo(radio);
                break;

            default:
                System.out.println("Opción inválida");
                return;
        }

        System.out.println("¿Qué desea calcular?");
        System.out.println("1. Perímetro");
        System.out.println("2. Área");

        int opcionCalculo = scanner.nextInt();

        double resultado;

        switch (opcionCalculo) {
            case 1:
                resultado = figura.calcularPerimetro();
                System.out.println("El perímetro es: " + resultado);
                break;

            case 2:
                resultado = figura.calcularArea();
                System.out.println("El área es: " + resultado);
                break;

            default:
                System.out.println("Opción inválida");
                break;
        }
    }
}