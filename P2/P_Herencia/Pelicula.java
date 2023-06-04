package P_Herencia;
import java.time.LocalTime;
public class Pelicula extends Cine{
    private LocalTime duracion;
    private LocalTime horario;
    private String Director;
    private double precio;
    private int lugares_vendidos;
    private String NombrePelicula;

    public Pelicula(String nombre,LocalTime Horario,String nombre_cine, String Ubicacion, String director,LocalTime duracion,double precio){
        super(nombre_cine, Ubicacion);
        this.Director=director;
        this.duracion=duracion;
        this.horario=Horario;
        this.precio=precio;
        this.NombrePelicula=nombre;
        this.lugares_vendidos=0;
    }

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

    public int getLugares_vendidos() {
        return lugares_vendidos;
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
    
    public void setLugares_vendidos(int lugares_vendidos) {
        this.lugares_vendidos = lugares_vendidos;
    }

    public void setNombrePelicula(String nombrePelicula) {
        NombrePelicula = nombrePelicula;
    }

    public String getNombrePelicula() {
        return NombrePelicula;
    }

    public void venderEntrada(int entradas){
            this.lugares_vendidos+=entradas;
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public void setUbicacion(String ubicacion) {
        super.setUbicacion(ubicacion);
    }

    @Override
    public String getNombre() {
        
        return super.getNombre();
    }

    @Override
    public String getUbicacion() {
       
        return super.getUbicacion();
    }
}
