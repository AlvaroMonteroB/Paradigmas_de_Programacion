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

        System.out.print("Declara la carne Roja");
        System.out.print("Nombre\n");
        name=scan.nextLine();
        System.out.print("Cantidad de proteina\n");
        proteina=scan.nextDouble();
        System.out.print("Cantidad de grasa\n");
        grasa=scan.nextDouble();
        Roja res= new Roja(name,proteina,grasa);

        System.out.print("Declara la carne de Ave");
        System.out.print("Nombre\n");
        name=scan.nextLine();
        System.out.print("Cantidad de proteina\n");
        proteina=scan.nextDouble();
        System.out.print("Cantidad de grasa\n");
        grasa=scan.nextDouble();
        Ave pajaro=new Ave(name,proteina,grasa);
        while(true){
            int opt;
            do{
                System.out.print("Introduce que carne quieres comprar\n1.-Ave\n2.-Roja\n3.-Pescado\n");
                opt=scan.nextInt();
                System.out.print("Cuanto vas a comprar?\n");
                double peso=scan.nextDouble();
                switch(opt){
                    case 1:
                    pajaro.vender(peso);

                        break;
                    case 2:
                        res.vender(peso);
                        break;

                    case 3:
                        pez.vender(peso);
                        break;

                    default:
                        System.out.print("Introduce una opcion valida");

                } 

            }while(1<opt||opt>3);  

            break;
            }
            


        scan.close();
    }
}