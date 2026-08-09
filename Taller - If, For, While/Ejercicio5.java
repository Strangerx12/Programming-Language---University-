import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSecreto = random.nextInt(100) + 1;
        
        int intentosMaximos = 7;
        int intentosRealizados = 0;
        boolean acerto = false;
        
        System.out.println("=== JUEGO: ADIVINA EL NÚMERO ===");
        System.out.println("He generado un número entre 1 y 100.");
        System.out.println("Tienes máximo " + intentosMaximos + " intentos para adivinarlo.\n");
        
        // Ciclo while para los intentos
        while (intentosRealizados < intentosMaximos && !acerto) {
            System.out.print("Intento " + (intentosRealizados + 1) + " de " + intentosMaximos + ". Ingresa tu número: ");
            int intentoUsuario = scanner.nextInt();
            
            intentosRealizados++;
            
            
            if (intentoUsuario == numeroSecreto) {
                acerto = true;
            } 
            
            else if (intentoUsuario > numeroSecreto) {
                System.out.println("-> Muy alto\n");
            } 
            
            else {
                int diferencia = numeroSecreto - intentoUsuario;
                
                if (diferencia <= 10) {
                    System.out.println("-> Muy caliente (estás muy cerca)\n");
                } else {
                    System.out.println("-> Muy frío (estás lejos)\n");
                }
            }
        }
        
        scanner.close();
        
        // Mostrar resultados al finalizar el juego
        System.out.println("\n--- FIN DEL JUEGO ---");
        if (acerto) {
            System.out.println("¡Felicidades! Adivinaste el número en " + intentosRealizados + " intentos.");
        } else {
            System.out.println("¡Se te acabaron los intentos! El número secreto era: " + numeroSecreto);
        }
    }
}