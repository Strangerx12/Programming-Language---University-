import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double saldofijo = 50000.0; 
            
            int retirosRealizados = 0;
            final int MAX_RETIROS = 3;
            
            int opcion = 0;

            while (opcion != 4) {
                System.out.println("\n------CAJERO AUTOMATICO------");
                System.out.println("1. Retirar dinero");
                System.out.println("2. Consultar saldo");
                System.out.println("3. Consignar dinero");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");
                
                opcion = scanner.nextInt();

                if (opcion == 1) {
                    if (retirosRealizados < MAX_RETIROS) {
                        System.out.print("Ingrese el monto a retirar: ");
                        double montoRetiro = scanner.nextDouble();
                        
                        if (montoRetiro <= saldofijo) {
                            saldofijo -= montoRetiro;
                            retirosRealizados++;
                            System.out.println("Retiro exitoso. Saldo actual: " + saldofijo);
                        } else {
                            System.out.println("Saldo insuficiente para realizar el retiro.");
                        }
                    } else {
                        System.out.println("Ha alcanzado el límite de retiros permitidos.");
                    }
                } else if (opcion == 2) {
                    System.out.println("Saldo actual: " + saldofijo);
                } else if (opcion == 3) {
                    System.out.print("Ingrese el monto a consignar: ");
                    double montoConsignacion = scanner.nextDouble();
                    saldofijo += montoConsignacion;
                    System.out.println("Consignación exitosa. Saldo actual: " + saldofijo);
                } else if (opcion == 4) {
                    System.out.println("Gracias por usar el cajero automático. ¡Hasta luego!");
                } else {
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                }
            }
            scanner.close();
        }
    }
}

