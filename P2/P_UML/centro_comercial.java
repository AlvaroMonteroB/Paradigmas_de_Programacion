package P_UML;

public class centro_comercial {
    private estacionamiento parking;
    private Tienda_dep[] tiendas;
    private restaurante[] restaurantes;


    public centro_comercial(){
        this.parking=null;
    }


    public void dec_est(int lugares, int x, int y){
        this.parking=new estacionamiento(lugares, x, y);
    }

    public void new_store(){

    }

    public void append_restaurant(){

    }




    public static void main(){
        
    }
}
