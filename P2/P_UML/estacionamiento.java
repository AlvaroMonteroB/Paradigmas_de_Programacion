package P_UML;

public class estacionamiento {
    private int num_carros;
    private double superficie;
    private int lugares;
    private int lugares_vacios;
    private double cuota_hora;
    private int niveles;
    public estacionamiento(int lugares, double x, double y, int nivel,double cuota){
        this.lugares=lugares;
        this.superficie=x*y;
        this.lugares_vacios=lugares;
        this.num_carros=0;
        this.niveles=nivel;
        this.cuota_hora=cuota;
    }
    public boolean ingresar_carro(int num){
        if(this.lugares_vacios>num &&num<=this.lugares){
            this.lugares_vacios=this.lugares_vacios-num;
            this.num_carros=this.num_carros+num;
            return true;
        }else{
            return false;
        }
    }
    public boolean sacar_carro(int num){
        if(this.num_carros<=num){
            this.lugares_vacios=this.lugares_vacios+num;
            this.num_carros=this.num_carros-num;
            return true;
        }else{
            return false;
        }
    }
    
    public double get_area(){
        return this.superficie*niveles;
    }

    double get_paid(float hours){
        return hours*cuota_hora;
    }
}
