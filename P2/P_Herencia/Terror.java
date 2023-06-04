package P_Herencia;
import java.time.LocalTime;
public class Terror extends Pelicula {
    private String Personaje_terror;
    private double nivel_miedo;


    Terror(String pers,double nivel,LocalTime Horario,String nombre_cine, String Ubicacion, String director,LocalTime duracion,double precio){
        super(nombre_cine, Horario, nombre_cine, Ubicacion, director, duracion, precio);
        this.Personaje_terror=pers;
        this.nivel_miedo=nivel;
    }

    @Override
    public void venderEntrada(int entradas) {
        
        super.venderEntrada(entradas);
    }

    public void setPersonaje_terror(String personaje_terror) {
        Personaje_terror = personaje_terror;
    }
    public void setNivel_miedo(double nivel_miedo) {
        this.nivel_miedo = nivel_miedo;
    }

    public double getNivel_miedo() {
        return nivel_miedo;
    }

    public String getPersonaje_terror() {
        return Personaje_terror;
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
        System.out.println("Personaje de terror "+getPersonaje_terror());
        System.out.println("Nivel de miedo: "+getNivel_miedo() +"\n");
        System.out.println("Horario: " + getHorario()+"\n");
        System.out.println("Cine: " + getNombre()+"\n");
        System.out.println("Ubicación: " + getUbicacion()+"\n");
        System.out.println("------------------------\n");
        }
}
