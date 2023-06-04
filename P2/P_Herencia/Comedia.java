package P_Herencia;

import java.time.LocalTime;

public class Comedia extends Pelicula {
    private int PersonajesPrincipales;
    private int NumChistes;
    private double nivel_felicidad;

    Comedia(int prin,int chistes,double nivel,LocalTime horario,String PNombre,LocalTime Horario,String nombre_cine, String Ubicacion, String director,LocalTime duracion,double precio){
        super(PNombre,horario,nombre_cine,Ubicacion,director,duracion,precio);
        this.PersonajesPrincipales=prin;
        this.NumChistes=chistes;
        this.nivel_felicidad=nivel;
    }

    @Override
    public void venderEntrada(int entradas) {
        super.venderEntrada(entradas);
    }

    public void setNivel_felicidad(double nivel_felicidad) {
        this.nivel_felicidad = nivel_felicidad;
    }

    public void setNumChistes(int numChistes) {
        NumChistes = numChistes;
    }

    public void setPersonajesPrincipales(int personajesPrincipales) {
        PersonajesPrincipales = personajesPrincipales;
    }

    public double getNivel_felicidad() {
        return nivel_felicidad;
    }

    public int getNumChistes() {
        return NumChistes;
    }

    public int getPersonajesPrincipales() {
        return PersonajesPrincipales;
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
        System.out.println("Personajes principales "+ getPersonajesPrincipales());
        System.out.println("Nivel de comedia: "+getNivel_felicidad() +"\n");
        System.out.println("Numero de chistes "+ getNumChistes());
        System.out.println("Horario: " + getHorario()+"\n");
        System.out.println("Cine: " + getNombre()+"\n");
        System.out.println("Ubicación: " + getUbicacion()+"\n");
        System.out.println("------------------------\n");
        }


}

