package P_Herencia;

import java.util.Scanner;
import java.time.LocalTime;
public class Program {


    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String cine_name,peli_name,ubicacion,nombre_director;
        double precio;
        int hora,minuto;
        System.out.print("Introduce el nombre del cine\n");
        cine_name=scan.nextLine();
        System.out.print("Introduce su ubicacion\n");
        ubicacion=scan.nextLine();

        System.out.print("=================Pelicula de accion==================\n");
        System.out.print("Nombre del director\n");
        nombre_director=scan.nextLine();
        System.out.print("Duracion\n");
        System.out.print("Hora\n");
        hora=scan.nextInt();
        System.out.print("Minutos\n");
        minuto=scan.nextInt();
        LocalTime duracion=LocalTime.of(hora,minuto);
        System.out.print("Horario\n");
        System.out.print("Hora\n");
        hora=scan.nextInt();
        System.out.print("Minutos\n");
        minuto=scan.nextInt();
        LocalTime horario=LocalTime.of(hora, minuto);
        System.out.print("Precio\n");
        precio=scan.nextDouble();
        System.out.print("Nombre de la pelicula\n");
        peli_name=scan.nextLine();
        peli_name=scan.nextLine();
        Accion Peli_accion=new Accion(0, 0, 0, horario, cine_name, ubicacion, nombre_director, duracion, precio,peli_name);
        System.out.print("Introduce el numero de persecuciones\n");
        int pers=scan.nextInt();
        Peli_accion.setNumEnfrentamientos(pers);
        System.out.print("Introduce el numero de enfrentamientos\n");
        int enfr=scan.nextInt();
        System.out.print("Introduce el nivel de violencia\n");
        double vio=scan.nextDouble();
        Peli_accion.setNivelViolencia(vio);
        Peli_accion.setNumEnfrentamientos(enfr);
        Peli_accion.setNumPersecuciones(pers);

        System.out.print("\n");


        System.out.print("=================Pelicula de Terror==================\n");
        System.out.print("Nombre del director\n");
        nombre_director=scan.nextLine();
        nombre_director=scan.nextLine();
        System.out.print("Duracion\n");
        System.out.print("Hora\n");
        hora=scan.nextInt();
        System.out.print("Minutos\n");
        minuto=scan.nextInt();
        duracion=LocalTime.of(hora,minuto);
        System.out.print("Horario\n");
        System.out.print("Hora\n");
        hora=scan.nextInt();
        System.out.print("Minutos\n");
        minuto=scan.nextInt();
        horario=LocalTime.of(hora, minuto);
        System.out.print("Precio\n");
        precio=scan.nextDouble();
        System.out.print("Nombre de la pelicula\n");
        peli_name=scan.nextLine();
        peli_name=scan.nextLine();
        Terror peli_terror=new Terror("", 0, horario, nombre_director, ubicacion, nombre_director, duracion, precio);
        peli_terror.setNombrePelicula(peli_name);
        System.out.print("Introduce el nivel de terror\n");
        double nivelT=scan.nextDouble();
        peli_terror.setNivel_miedo(nivelT);
        System.out.print("Introduce el personaje de miedo\n");
        String mper=scan.nextLine();
         mper=scan.nextLine();
        peli_terror.setPersonaje_terror(mper);

        System.out.print("=================Pelicula de comedia=================\n");
        System.out.print("Nombre del director\n");
        nombre_director=scan.nextLine();
        System.out.print("Duracion\n");
        System.out.print("Hora\n");
        hora=scan.nextInt();
        System.out.print("Minutos\n");
        minuto=scan.nextInt();
        duracion=LocalTime.of(hora,minuto);
        System.out.print("Horario\n");
        System.out.print("Hora\n");
        hora=scan.nextInt();
        System.out.print("Minutos\n");
        minuto=scan.nextInt();
        horario=LocalTime.of(hora, minuto);
        System.out.print("Precio\n");
        precio=scan.nextDouble();
        System.out.print("Nombre de la pelicula\n");
        peli_name=scan.nextLine();
        peli_name=scan.nextLine();
        Comedia peli_comedia=new Comedia(0, 0, 0, horario, peli_name, horario, cine_name, ubicacion, nombre_director, duracion, precio);
        System.out.print("Cuandos personajes principales hay\n");
        int num_person=scan.nextInt();
        System.out.print("Introduce el numero de chistes\n");
        int chistes=scan.nextInt();
        System.out.print("Introduce el nivel de comedia\n");
        double comedian=scan.nextDouble();
        peli_comedia.setNivel_felicidad(comedian);
        peli_comedia.setNumChistes(chistes);
        peli_comedia.setPersonajesPrincipales(num_person);
        boolean xd=true;
        while(xd){
            for(int i=0; i<20; i++){
                System.out.print("\n");
            }
            peli_comedia.print_info();
            peli_terror.print_info();
            Peli_accion.print_info();

            boolean cond=true;
            while (cond){
                int bol1,bol2,bol3;
                System.out.print("Cuantos boletos de "+peli_comedia.getNombrePelicula()+"\n");  
                bol1=scan.nextInt();
                System.out.print("Cuantos boletos de "+peli_terror.getNombrePelicula()+"\n");
                bol2=scan.nextInt();
                System.out.print("Cuantos boletos de "+Peli_accion.getNombrePelicula()+"\n");
                bol3=scan.nextInt();
                System.out.print("Terminaste de comprar boletos? y || n\n");
                int opt=scan.nextInt();
                if(opt==1){   
                    peli_comedia.venderEntrada(bol1);
                    peli_terror.venderEntrada(bol2);
                    Peli_accion.venderEntrada(bol3);
                    double a,e,i,r;
                    a=peli_comedia.getLugares_vendidos()*(peli_comedia.getPrecio());
                    e=peli_terror.getLugares_vendidos()*peli_terror.getPrecio();
                    i=Peli_accion.getLugares_vendidos()*Peli_accion.getPrecio();
                    r=a+e+i;
                    System.out.print("Total a pagar: $"+r);
                    
                    cond=false;
                    
                }  else{

                    }
                    
                
            }

            peli_comedia.setLugares_vendidos(0);
            peli_terror.setLugares_vendidos(0);
            Peli_accion.setLugares_vendidos(0);






        }




        scan.close();
    }
}
