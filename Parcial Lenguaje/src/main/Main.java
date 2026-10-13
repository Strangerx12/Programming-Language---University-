package main;

import modelo.Estudiante;
import modelo.Profesor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== REGISTRO DE ESTUDIANTE ===");
        System.out.print("Ingrese nombre del estudiante: ");
        String estNombre = scanner.nextLine();
        System.out.print("Ingrese edad: ");
        int estEdad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese documento: ");
        String estDoc = scanner.nextLine();
        System.out.print("Ingrese programa académico: ");
        String estPrograma = scanner.nextLine();
        System.out.print("Ingrese promedio: ");
        double estPromedio = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer

        Estudiante estudiante = new Estudiante(estNombre, estEdad, estDoc, estPrograma, estPromedio);

        System.out.println("\n=== REGISTRO DE PROFESOR ===");
        System.out.print("Ingrese nombre del profesor: ");
        String profNombre = scanner.nextLine();
        System.out.print("Ingrese edad: ");
        int profEdad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese documento: ");
        String profDoc = scanner.nextLine();
        System.out.print("Ingrese área de especialidad: ");
        String profArea = scanner.nextLine();
        System.out.print("Ingrese salario base: ");
        double profSalario = scanner.nextDouble();
        System.out.print("Ingrese horas cátedra: ");
        int profHoras = scanner.nextInt();

        Profesor profesor = new Profesor(profNombre, profEdad, profDoc, profArea, profSalario, profHoras);

        // Mostrar resultados
        System.out.println("\n\n-----------------------------------------");
        System.out.println("       INFORMACIÓN REGISTRADA           ");
        System.out.println("-----------------------------------------");
        
        System.out.println("\n--- DATOS DEL ESTUDIANTE ---");
        estudiante.mostrarInfo();

        System.out.println("\n--- DATOS DEL PROFESOR ---");
        profesor.mostrarInfo();

        scanner.close();
    }
}