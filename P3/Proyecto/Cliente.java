import java.util.ArrayList;
import java.util.List;
public class Cliente extends Persona {
    private String numeroCliente;
    private List<Pedido> pedidos;

    public Cliente(String nombre, int edad, String domicilio, String numeroCliente) {
        super(nombre, edad, domicilio);
        this.numeroCliente = numeroCliente;
        this.pedidos = new ArrayList<>();
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void mostrarPedidos() {
        System.out.println("Pedidos del cliente " + nombre + ":");
        for (Pedido pedido : pedidos) {
            pedido.mostrarInformacion();
        }
    }

    public void saludar() {
        System.out.println("Hola, soy el cliente " + nombre);
    }
}
