//Programa que determina si tres lados ingresados por el usuario forman un triángulo válido y, en caso afirmativo, clasifica el tipo de triángulo (equilátero, isósceles o escaleno).

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el primer lado del triángulo: ");
            double lado1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo lado del triángulo: ");
            double lado2 = scanner.nextDouble();
            System.out.print("Ingrese el tercer lado del triángulo: ");
            double lado3 = scanner.nextDouble();

            if (esTrianguloValido(lado1, lado2, lado3)) {
                String tipo = clasificarTriangulo(lado1, lado2, lado3);
                System.out.println("El triángulo es: " + tipo);
            } else {
                System.out.println("Los lados ingresados no forman un triángulo válido.");
            }
        }
    }

    public static boolean esTrianguloValido(double lado1, double lado2, double lado3) {
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
    }

    public static String clasificarTriangulo(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
}

