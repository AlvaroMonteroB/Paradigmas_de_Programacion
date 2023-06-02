package P_UML;
import java.util.Arrays;
import java.util.Scanner;
import P_UML.estacionamiento;
import P_UML.restaurante;
import P_UML.Tienda_dep;



public class centro_comercial {
    private String domicilio;
    private double superficie;
    private String nombre;
    public P_UML.estacionamiento parking;
    private P_UML.Tienda_dep[] tiendas;
    private P_UML.restaurante[] restaurantes;
    private int pisos;
    private int lugares;


    public centro_comercial(String nombre, String domicilio, double superficie, int pisos, int lugares){
        this.nombre=nombre;
        this.domicilio=domicilio;
        this.superficie=superficie;
        this.pisos=pisos;
        this.lugares=lugares;
        
    }


    public String get_domicilio(){
        return this.domicilio;
    }
    
    public double get_Superficie(){
        return this.superficie;
    }

    public String get_nombre(){
        return this.nombre;
    }

    public void Set_domicilio(String domicilio){
        this.domicilio=domicilio;
    }

    public void Set_superficie(double superficie){
        this.superficie=superficie;
    }

    public void set_Nombre(String nombre){
        this.nombre=nombre;
    }

    public void set_pisos(int piso){
        this.pisos=piso;
    }

    public void dec_est(int lugares, double x, double y,int niv,double cuota){
        this.parking=new estacionamiento(lugares, x, y,niv,cuota);
    }

    public void new_store(String name, String product,double area,String dueno,int local){
        if (this.lugares == 0) {
            System.out.println("No se pudo agregar lugar");
            return;
        }
        
        Tienda_dep nuevaTienda = new Tienda_dep(name, product, area, dueno, local);
        if (this.tiendas == null) {
            this.tiendas = new Tienda_dep[1];
        } else {
            this.tiendas = Arrays.copyOf(this.tiendas, this.tiendas.length + 1);
        }
        this.tiendas[this.tiendas.length - 1] = nuevaTienda;
        this.lugares -= 1;
    }

    public void append_restaurant(String name, int lugares, String estilo, int mesero, int chefs ){
        if (this.lugares == 0) {
            System.out.println("No se pudo agregar lugar");
            return;
        }
        
        restaurante nuevoRestaurante = new restaurante(name,lugares,estilo,mesero,chefs);
        if (this.restaurantes == null) {
            this.restaurantes = new restaurante[1];
        } else {
            this.restaurantes = Arrays.copyOf(this.restaurantes, this.restaurantes.length + 1);
        }
        this.restaurantes[this.restaurantes.length - 1] = nuevoRestaurante;
        this.lugares -= 1;
    }

    public Tienda_dep[] get_store(){
        return this.tiendas;
    }

    public restaurante[] get_restaurant(){
        return this.restaurantes;
    }


    public int get_lugares_totales(){
       return this.restaurantes.length+this.tiendas.length+this.lugares;

    }



    public static void main(){
        System.out.print("Declara tu centro comercial, nombre, domicilio, y superficie\n");
        Scanner scan= new Scanner(System.in);
        System.out.print("Nombre\n");
        String name=scan.nextLine();
        System.out.print("Domicilio\n");
        String dom=scan.nextLine();
        System.out.print("Superficie\n");
        double sup=scan.nextDouble();
        System.out.print("Pisos\n");
        int pisos=scan.nextInt();
        System.out.print("Lugares\n");
        int lugares=scan.nextInt();
        centro_comercial mall=new centro_comercial(name, dom, sup, pisos, lugares);
        System.out.print("Agregar estacionamiento\n");
            System.out.print("Cuantos lugares tiene\n");
            lugares=scan.nextInt();
            System.out.print("Cuanto mide de alto\n");
            double y=scan.nextDouble();
            System.out.print("Cuanto mide de ancho\n");
            double x=scan.nextDouble();
            System.out.print("Cuantos niveles tiene\n");
            pisos=scan.nextInt();
            System.out.print("Cual es la cuota por hora?\n");
            double cuota=scan.nextDouble();
            mall.dec_est(lugares, x, y, pisos, cuota);
        
        while(true){
            System.out.print("Cuantas tiendas quieres agregar?\n");
            lugares=scan.nextInt();
            if(lugares<=mall.lugares){
                break;
            }else{
                System.out.print("Introduce una opcion valida\n");
            }
        }
        String producto,duenio;
        for(int i=0;i<lugares;i++){
            System.out.print("Introduce el nombre\n");//Area dueño y local
            name=scan.nextLine();
            System.out.print("Introduce el tipo de producto\n");
            producto=scan.nextLine();
            System.out.print("Introduce el area del local");
            sup=scan.nextDouble();
            System.out.print("Introduce el nombre del duenio");
            duenio=scan.nextLine();
            mall.new_store(name, producto, lugares, duenio, i);

        }
        System.out.print("Deseas agregar restaurantes? Y o N\n");
        String opt=scan.nextLine();
        if (opt=="Y"||opt=="y"){
            while(true){
                    System.out.print("Cuantos restaurantes quieres agregar?\n");
                    lugares=scan.nextInt();
                    if(lugares<=mall.lugares){
                        break;
                    }else{
                        System.out.print("Introduce una opcion valida\n");
                }
            }
            for(int i=0;i<lugares;i++){
                System.out.print("Introduce el nombre\n");//
                name=scan.nextLine();
                System.out.print("Introduce los lugares que tiene\n");
                lugares=scan.nextInt();
                System.out.print("Introduce el numero de meseros\n");
                int messss=scan.nextInt();
                System.out.print("Introduce el estilo del restaurabnte\n");
                duenio=scan.nextLine();
                System.out.print("Introduce el numero de chefs\n");
                int chefs=scan.nextInt();
                mall.append_restaurant(name, lugares,duenio,messss,chefs);
       
                }
        }

        








        scan.close();
        
    }
}


