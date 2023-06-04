package P_Herencia;
import java.time.LocalTime;
public class Accion extends Pelicula{
    private int num_persecuciones;
    private int num_enfrentamientos;
    private double nivel_violencia;


    Accion(int num_persecuciones,int num_enfrentamientos, double nivel_violencia,LocalTime Horario,String nombre_cine, String Ubicacion, String director,LocalTime duracion,double precio, String pelicula){
        super(pelicula, Horario, nombre_cine, Ubicacion, director, duracion, precio);
        this.num_enfrentamientos=num_enfrentamientos;
        this.nivel_violencia=nivel_violencia;
        this.num_persecuciones=num_persecuciones;
    }

    @Override
    public void venderEntrada(int entradas) {
        
        super.venderEntrada(entradas);
    }

    public void setNumPersecuciones(int num_persecuciones) {
        this.num_persecuciones = num_persecuciones;
    }
    
    // Método get para num_persecuciones
    public int getNumPersecuciones() {
        return num_persecuciones;
    }
    
    // Método set para num_enfrentamientos
    public void setNumEnfrentamientos(int num_enfrentamientos) {
        this.num_enfrentamientos = num_enfrentamientos;
    }
    
    // Método get para num_enfrentamientos
    public int getNumEnfrentamientos() {
        return num_enfrentamientos;
    }
    
    // Método set para nivel_violencia
    public void setNivelViolencia(double nivel_violencia) {
        this.nivel_violencia = nivel_violencia;
    }
    
    // Método get para nivel_violencia
    public double getNivelViolencia() {
        return nivel_violencia;
    }

    @Override
    public void setDirector(String director) {
        
        super.setDirector(director);
    }

    @Override
    public void setDuracion(LocalTime duracion) {
        
        super.setDuracion(duracion);
    }

    @Override
    public void setHorario(LocalTime horario) {
        
        super.setHorario(horario);
    }

    @Override
    public void setNombre(String nombre) {
        
        super.setNombre(nombre);
    }

    @Override
    public void setLugares_vendidos(int lugares_vendidos) {
    }

    @Override
    public void setNombrePelicula(String nombrePelicula) {
        
        super.setNombrePelicula(nombrePelicula);
    }

    @Override
    public void setPrecio(double precio) {
        
        super.setPrecio(precio);
    }

    @Override
    public void setUbicacion(String ubicacion) {
        
        super.setUbicacion(ubicacion);
    }

    @Override
    public String getDirector() {
        
        return super.getDirector();
    }

    @Override
    public LocalTime getDuracion() {
        
        return super.getDuracion();
    }

    @Override
    public LocalTime getHorario() {
        
        return super.getHorario();
    }

    @Override
    public int getLugares_vendidos() {
        
        return super.getLugares_vendidos();
    }

    @Override
    public String getNombre() {
        
        return super.getNombre();
    }

    @Override
    public String getNombrePelicula() {
        
        return super.getNombrePelicula();
    }

    @Override
    public double getPrecio() {
        
        return super.getPrecio();
    }

    @Override
    public String getUbicacion() {
        
        return super.getUbicacion();
    }

    public void print_info(){
            System.out.println("\nNombre de la película: " + getNombrePelicula()+"\n");
            System.out.println("Director: " + getDirector()+"\n");
            System.out.println("Duración: " +  getDuracion()+"\n");
            System.out.println("Precio: $" + getPrecio()+"\n");
            System.out.println("Número de persecuciones: " + getNumPersecuciones()+"\n");
            System.out.println("Número de enfrentamientos: " + getNumEnfrentamientos()+"\n");
            System.out.println("Nivel de violencia: " + getNivelViolencia() +"\n");
            System.out.println("Horario: " + getHorario()+"\n");
            System.out.println("Cine: " + getNombre()+"\n");
            System.out.println("Ubicación: " + getUbicacion()+"\n");
            System.out.println("------------------------"+"\n");
    }
    
}
