package P3.Ejercicio_1;

public class Gato extends Animal implements Mascota {
    private String nombre;

    public Gato(String nombre){
        super(4);
        this.nombre=nombre;
    }
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    @Override
    public int getPatas() {
        return super.getPatas();
    }
    @Override
    public void jugar(){
        System.out.print("Gato jugando");
    }
}
