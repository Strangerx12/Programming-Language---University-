package TiendaDeportiva;

public class DetalleVenta {
    private Venta venta;
    private Articulo articulo;
    private int cantidad;

    public DetalleVenta(Venta venta, Articulo articulo, int cantidad) {
        this.venta = venta;
        this.articulo = articulo;
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        return articulo.getPrecio() * cantidad;
    }

    public void mostrarDetalle() {
        System.out.println("Articulo: " + articulo.getNombre() + " | Precio Unitario: $" + articulo.getPrecio() + " | Cantidad: " + cantidad);
        System.out.println("Subtotal: $" + calcularSubtotal());
        System.out.println("-------------------------------------------------");
    }
}
