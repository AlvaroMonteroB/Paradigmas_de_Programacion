package P_UML;
import java.util.Arrays;
public class centro_comercial {
    public estacionamiento parking;
    private Tienda_dep[] tiendas;
    private restaurante[] restaurantes;


    public centro_comercial(){
        this.parking=null;
    }


    public void dec_est(int lugares, int x, int y,int niv){
        this.parking=new estacionamiento(lugares, x, y,niv);
    }

    public void new_store(String name, String product,double area,String dueno,int local){
        this.tiendas = Arrays.copyOf(tiendas, tiendas.length + 1);
        this.tiendas[0]=new Tienda_dep(name, product, area, dueno, local);

    }

    public void append_restaurant( ){

    }

    public Tienda_dep[] get_store(){
        return tiendas;
    }

    public restaurante[] get_restaurant(){
        return restaurantes;
    }



    public static void main(){
        
    }
}
