package Ejercicio_1;
public class Carnes{
    private double cantidad;
    private double precio;
    private String nombre;

    public Carnes(String nombre){
        this.nombre=nombre;
    }
    public void vender(double peso){
        if(peso>this.cantidad){
            System.out.print("No existe esa cantidad");
        }else{
            this.cantidad-=peso;
            double pago=peso*this.precio;
            System.out.print("Total a pagar: "+pago);
        }

    }
    void set_precio(double prec){
        this.precio=prec;
    }

    void set_cantidad(double cant){
        this.cantidad=cant;
    }

    String get_nombre(){
        return this.nombre;
    }





}

