package P_Herencia;

public class Terror extends Pelicula {
    private String Personaje_terror;
    private double nivel_miedo;


    Terror(String pers,double nivel){
        this.Personaje_terror=pers;
        this.nivel_miedo=nivel;
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
}
