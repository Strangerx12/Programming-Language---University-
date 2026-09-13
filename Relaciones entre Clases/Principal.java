import java.util.Scanner; // Importamos el Scanner para leer el teclado
// Importamos las clases de la otra carpeta
import TiendaDeportiva.Articulo;
import TiendaDeportiva.Venta;
import TiendaDeportiva.DetalleVenta;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DE INVENTARIO Y VENTAS ===");
        
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
        
        System.out.print("Ingrese la fecha (ej. 2026-09-13): ");
        String fechaVenta = scanner.nextLine();

        // Objeto Venta de la carpeta logica
        Venta ventaActual = new Venta(fechaVenta, nombreCliente);

        System.out.print("¿Cuántos artículos diferentes va a llevar?: ");
        int cantidadArticulos = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        // Arreglo para guardar los detalles
        DetalleVenta[] listaDetalles = new DetalleVenta[cantidadArticulos];

        // Ciclo for para pedir los datos de cada artículo dinámicamente
        for (int i = 0; i < cantidadArticulos; i++) {
            System.out.println("\n--- Ingresando Artículo #" + (i + 1) + " ---");
            
            System.out.print("Nombre del artículo: ");
            String nombreArticulo = scanner.nextLine();
            
            System.out.print("Precio unitario: $");
            double precioArticulo = scanner.nextDouble();
            
            System.out.print("Cantidad a comprar: ");
            int cantidadComprada = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            // Creamos los objetos importados
            Articulo nuevoArticulo = new Articulo(nombreArticulo, precioArticulo);
            listaDetalles[i] = new DetalleVenta(ventaActual, nuevoArticulo, cantidadComprada);
        }

        System.out.println("\n=================================================");
        System.out.println("               RESUMEN DE VENTA                  ");
        System.out.println("Cliente: " + ventaActual.getCliente() + " | Fecha: " + ventaActual.getFecha());
        System.out.println("=================================================");
        
        double totalFinal = 0;
        
        for (int i = 0; i < cantidadArticulos; i++) {
            listaDetalles[i].mostrarDetalle();
            totalFinal += listaDetalles[i].calcularSubtotal();
        }
        
        System.out.println("TOTAL A PAGAR: $" + totalFinal);
        System.out.println("=================================================");

        scanner.close();
    }
}