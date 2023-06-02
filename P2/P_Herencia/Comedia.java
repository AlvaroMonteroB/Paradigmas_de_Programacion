package P_Herencia;

public class Comedia extends Pelicula {
    private int PersonajesPrincipales;
    private int NumChistes;
    private double nivel_felicidad;

    Comedia(int prin,int chistes,double nivel){
        this.PersonajesPrincipales=prin;
        this.NumChistes=chistes;
        this.nivel_felicidad=nivel;
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
}
