import java.util.List;

// Clase Comida
public class Comida implements IReceta {
    private String nombre;
    private int precio;
    private List<String> ingredientes;
    private List<String> instrucciones;

    public Comida(String nombre, List<String> ingredientes, List<String> instrucciones,  int precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
        this.instrucciones = instrucciones;
    }



    public String getNombre() {
        return nombre;
    }





    public void setNombre(String nombre) {
        this.nombre = nombre;
    }





    public int getprecio() {
        return precio;
    }





    public void setprecio(int precio) {
        this.precio = precio;
    }





    public List<String> getIngredientes() {
        return ingredientes;
    }





    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }





    public List<String> getInstrucciones() {
        return instrucciones;
    }





    public void setInstrucciones(List<String> instrucciones) {
        this.instrucciones = instrucciones;
    }





    @Override
    public void mostrarIngredientes() {
        System.out.println("Ingredientes de la comida " + nombre + ":");
        for (String ingrediente : ingredientes) {
            System.out.println("- " + ingrediente);
        }
    }
    @Override
    public void mostrarInstrucciones() {
        System.out.println("Instrucciones de preparación de la comida " + nombre + ":");
        int paso = 1;
        for (String instruccion : instrucciones) {
            System.out.println(paso + ". " + instruccion);
            paso++;
        }
    }

    @Override
    public void mostrarprecio(){
        System.out.println("Precio de la comida" +nombre+ ": "+ precio );
    }
}