package P_Herencia;

public class Accion extends Pelicula{
    private int num_persecuciones;
    private int num_enfrentamientos;
    private double nivel_violencia;


    Accion(){

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
}
