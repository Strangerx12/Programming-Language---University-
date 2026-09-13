package TiendaDeportiva;

public class Venta {
    private String fecha;
    private String cliente;

    public Venta(String fecha, String cliente) {
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public String getFecha() { return fecha; }
    public String getCliente() { return cliente; }
}