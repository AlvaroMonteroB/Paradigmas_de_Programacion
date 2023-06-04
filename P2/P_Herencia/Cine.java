package P_Herencia;

public class Cine {
    private String nombre;
    private String ubicacion;


    public Cine(String nombre, String Ubicacion){
        this.nombre=nombre;
        this.ubicacion=Ubicacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public String getNombre() {
        return nombre;
    }
    public String getUbicacion() {
        return ubicacion;
    }
}
