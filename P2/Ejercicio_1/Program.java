package Ejercicio_1;
import java.util.Scanner;
public class Program{

    public static void main(String args[]){
        String name;
        double proteina,grasa;
        Scanner scan= new Scanner(System.in);
        System.out.print("Declara la carne de pescado\n");
        System.out.print("Nombre\n");
        name=scan.nextLine();
        System.out.print("Cantidad de proteina\n");
        proteina=scan.nextDouble();
        System.out.print("Cantidad de grasa\n");
        grasa=scan.nextDouble();
        Pescado pez=new Pescado(name,proteina,grasa);
        System.out.print("Introduce la cantidad de carne\n");
        double peso=scan.nextDouble();
        pez.set_cantidad(peso);
        System.out.print("Introduce el precio\n");
        double precio=scan.nextDouble();
        pez.set_precio(precio);


        System.out.print("Declara la carne Roja\n");
        System.out.print("Nombre\n");
        name=scan.nextLine();
        name=scan.nextLine();
        System.out.print("Cantidad de proteina\n");
        proteina=scan.nextDouble();
        System.out.print("Cantidad de grasa\n");
        grasa=scan.nextDouble();
        Roja res= new Roja(name,proteina,grasa);
        System.out.print("Introduce la cantidad de carne\n");
        peso=scan.nextDouble();
        res.set_cantidad(peso);
        System.out.print("Introduce el precio\n");
        precio=scan.nextDouble();
        res.set_precio(precio);

        System.out.print("Declara la carne de Ave\n");
        System.out.print("Nombre\n");
        name=scan.nextLine();
        name=scan.nextLine();
        System.out.print("Cantidad de proteina\n");
        proteina=scan.nextDouble();
        System.out.print("Cantidad de grasa\n");
        grasa=scan.nextDouble();
        Ave pajaro=new Ave(name,proteina,grasa);
        System.out.print("Introduce la cantidad de carne\n");
        peso=scan.nextDouble();
        pajaro.set_cantidad(peso);
        System.out.print("Introduce el precio\n");
        precio=scan.nextDouble();
        pajaro.set_precio(precio);

        while(true){
            int opt;
            do{
                System.out.print("Introduce que carne quieres comprar\n1.-Ave\n2.-Roja\n3.-Pescado\n4.-Salir\n");
                opt=scan.nextInt();

                switch(opt){
                    case 1:
                    System.out.print("Cuanto vas a comprar?\n");
                    double peso_comp=scan.nextDouble();
                    pajaro.vender(peso_comp);

                        break;
                    case 2:
                    System.out.print("Cuanto vas a comprar?\n");
                     peso_comp=scan.nextDouble();
                        res.vender(peso_comp);
                        break;

                    case 3:
                    System.out.print("Cuanto vas a comprar?\n");
                     peso_comp=scan.nextDouble();
                        pez.vender(peso_comp);
                        break;

                    case 4:
                        break;

                    default:
                        System.out.print("Introduce una opcion valida\n");

                } 

            }while(opt!=1||opt!=2||opt!=3||opt!=4);  
            if(opt==4){
                break;
            }
            
        }
        
            


        scan.close();
    }
}