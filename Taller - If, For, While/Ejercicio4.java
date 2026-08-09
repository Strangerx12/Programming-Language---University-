import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa la altura de la pirámide (n): ");
        int n = scanner.nextInt();
        
        System.out.println("\n--- PIRÁMIDE MAYOR A MENOR ---");
        for (int i = 1; i <= n; i++) {
            int espacios = n - i;
            int e = 0;
            while (e < espacios) {
                System.out.print(" ");
                e++;
            }
            

            int j = 1;
            while (j <= i) {
                System.out.print(j + " ");
                j++;
            }

            System.out.println();
        }
        
        System.out.println("\n--- PIRÁMIDE MENOR A MAYOR ---");
        for (int i = n; i >= 1; i--) {
            int espacios = n - i;
            int e = 0;
            while (e < espacios) {
                System.out.print(" ");
                e++;
            }
            
            // Imprimir los números desde 1 hasta i
            int j = 1;
            while (j <= i) {
                System.out.print(j + " ");
                j++;
            }
            // Salto de línea para la siguiente fila
            System.out.println();
        }
        
        scanner.close();
    }
}