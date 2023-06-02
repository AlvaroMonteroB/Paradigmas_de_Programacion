package Ejercicio_1;
public class Pescado extends Carnes{
    private double proteinas;
    private double grasa_ins;

    public Pescado(String nam,double prote, double grasas){
        super(nam);
        this.proteinas=prote;
        this.grasa_ins=grasas;
    }

    public void vender(double venta){
        super.vender(venta);
    }

    public void setProteinas(double proteinas) {
    this.proteinas = proteinas;
    }

    public double getProteinas() {
        return proteinas;
    }

    public void setGrasaIns(double grasa_ins) {
        this.grasa_ins = grasa_ins;
    }

    public double getGrasaIns() {
        return grasa_ins;
    }
}





