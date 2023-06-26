import java.util.ArrayList;
import java.util.List;
public class Restaurante {
    private String nombre;
    private String direccion;
    private String telefono;
    private List<IReceta> recetas;

    public Restaurante(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.recetas = new ArrayList<>();
    }

    public void agregarReceta(IReceta receta) {
        recetas.add(receta);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Interfaz IReceta
    public interface IReceta {
        void mostrarIngredientes();
        void mostrarInstrucciones();
        void mostrarprecio();
    }


}