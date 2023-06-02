package P_Herencia;
import java.time.LocalTime;
public class Pelicula extends Cine{
    private LocalTime duracion;
    private LocalTime horario;
    private String Director;
    private double precio;

    public String getDirector() {
        return Director;
    }

    public LocalTime getDuracion() {
        return duracion;
    }
    
    public LocalTime getHorario() {
        return horario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public void setDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
