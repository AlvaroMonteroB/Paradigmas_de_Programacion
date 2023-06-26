public class Repartidor extends Persona {
    private String zonaAsignada;
    private Pedido pedidoActual;

    public Repartidor(String nombre, int edad, String domicilio, String zonaAsignada) {
        super(nombre, edad, domicilio);
        this.zonaAsignada = zonaAsignada;
        this.pedidoActual = null;
    }

    public String getZonaAsignada() {
        return zonaAsignada;
    }

    public void setZonaAsignada(String zonaAsignada) {
        this.zonaAsignada = zonaAsignada;
    }

    public void asignarPedido(Pedido pedido) {
        pedidoActual = pedido;
    }

    public void entregarPedido() {
        if (pedidoActual != null) {
            System.out.println("El repartidor " + nombre + " está entregando el pedido #" + pedidoActual.getNumeroPedido()
                    + " en la zona " + zonaAsignada);
            pedidoActual = null;
        } else {
            System.out.println("No hay pedido asignado para el repartidor " + nombre);
        }
    }

    public void saludar() {
        System.out.println("Hola, soy el repartidor " + nombre);
    }

    public void setMedioTransporte(String medioTransporte) {
    }

    public void setTiempoEstimadoLlegada(int tiempoEstimadoLlegada) {
    }

    public void setCalificacion(double calificacion) {
    }
}