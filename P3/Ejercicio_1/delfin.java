package P3.Ejercicio_1;

public class delfin extends Animal implements Mascota {
    private String nombre;
    
    public delfin(String nombre){
        super(0);
        this.nombre=nombre;
    }
    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int saltar(){
        return 1;
    }

    public void comer(){
        System.out.print("Delfin comienod\n");
    }
    @Override
    public void jugar(){

    }

}
