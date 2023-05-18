package P_UML;

public class Tienda_dep {
    public String nombre;
    public String producto;
    public int num_local;
    public String dueno;
    public double espacio;
    private int num_empleados;

    public Tienda_dep(String nom, String Producto,double espacio,String proper, int local){
        this.nombre=nom;
        this.producto=Producto;
        this.num_empleados=0;
        this.espacio=espacio;
        this.dueno=proper;
        this.num_local=local;
    }
    public void contratar(int empleados){
        this.num_empleados+=empleados;
    }
    public boolean despedir(int despidos){
        if (this.num_empleados>=despidos){
            this.num_empleados-=despidos;
            return true;
        }else{
            return false;
        }
    }
}
