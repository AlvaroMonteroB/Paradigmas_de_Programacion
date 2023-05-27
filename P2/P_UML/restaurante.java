package P_UML;

public class restaurante {
    public String nombre;
    private int num_comensales;
    private int lugares_totales;
    private String estilo;
    private int meseros;
    private int chefs;

    public restaurante(String nom, int lugares, String estilo, int mesero,int chefs){
        this.nombre=nom;
        this.num_comensales=0;
        this.lugares_totales=lugares;
        this.estilo=estilo;
        this.meseros=mesero;
        this.chefs=chefs;
    }
    public boolean enter_comensales(int num){
        if(lugares_totales-num_comensales>=num){
            num_comensales+=num;
            return true;
        }else{
            return false;
        }
    }

    public boolean out_comensales(int num){
            if(num_comensales>=num){
                this.num_comensales-=num;
                return true;
            }else{
                return false;
            }
    }

    public String get_style(){
        return estilo;
    }

    public int contratar(int num){
        this.meseros+=num;
        return meseros;
    }

    public int get_chefs(){
        return this.chefs;
    }

}
