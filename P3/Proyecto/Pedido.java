public class Pedido {
    private int numeroPedido;
    private String descripcion;
    private double monto;
    private Restaurante restaurante;

    public Pedido(int numeroPedido, String descripcion, double monto, Restaurante restaurante) {
        this.numeroPedido = numeroPedido;
        this.descripcion = descripcion;
        this.monto = monto;
        this.restaurante = restaurante;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public void mostrarInformacion() {
        System.out.println("Pedido #" + numeroPedido + ": " + descripcion );
        System.out.println("Restaurante: " + restaurante.getNombre());
    }
}