import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Main {
        private static List<Repartidor> repartidores = new ArrayList<>();
        private static Restaurante restaurante;
        static int menu;

        static Bebida[] bebidas=new Bebida[5];
        static Comida[] comidas=new Comida[5];
        static Postre[] postres=new Postre[5];

        /*private static Bebida nuevaBebida;
        private static Comida nuevComida;
        private static Postre nuevoPostre;*/

        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int opcion;

                do {
                        mostrarMenuPrincipal();
                        opcion = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer de entrada

                        switch (opcion) {

                                case 1: mostrarmenu(scanner);
                                        break;
                                case 2:
                                        realizarPedido(scanner);
                                        break;
                                case 3:
                                        registrarRepartidor(scanner);
                                        break;
                                case 4: registrarPlatillo(scanner);
                                        break;
                                case 5:
                                        registrarDatosRestaurante(scanner);
                                        break;
                                case 6:
                                        System.out.println("¡Hasta luego!");
                                        break;
                                default:
                                        System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
                                        break;
                        }

                        System.out.println(); // Salto de línea para separar las iteraciones del menú
                } while (opcion != 6);
        }

        private static void mostrarMenuPrincipal() {
                System.out.println("MENÚ PRINCIPAL");
                System.out.println("1. Mostrar menú");
                System.out.println("2. Realizar pedido");
                System.out.println("3. Registrar repartidores");
                System.out.println("4. Registrar platillo");
                System.out.println("5. Registrar datos restaurante");
                System.out.println("6. Salir");
                System.out.print("Selecciona una opción: ");
        }

        private static void mostrarmenu(Scanner scanner){
                
        
                if(menu==1){                        
                for(int i=0;i<5;i++){
        
                System.out.println((i+1)+" "+ bebidas[i].getNombre()+ " $" +bebidas[i].getprecio());
                System.out.println(comidas[i].getNombre()+ " $" +comidas[i].getprecio());
                System.out.println(postres[i].getNombre()+" $" + postres[i].getprecio());
                }
        }else{
                System.out.println("Registra todos los platillos por favor, el menu aun está vacio");
        } 
}
        //}
//}

        private static void realizarPedido(Scanner scanner) {
                System.out.println("Realizando pedido...");
                System.out.print("Ingrese el nombre del cliente: ");
                String nombreCliente = scanner.nextLine();
                System.out.print("Ingrese el domicilio del cliente: ");
                String domicilioCliente = scanner.nextLine();
                System.out.print("Ingrese el método de pago: ");
                String metodoPago = scanner.nextLine();

                // Obtener los platillos elegidos (puedes adaptar esto según la estructura de tu programa)
                List<String> platillosElegidos = new ArrayList<>();
                System.out.println("Ingrese los platillos elegidos (ingrese '0' para terminar):");
                String platillo;
                do {
                        platillo = scanner.nextLine();
                        if (!platillo.equals("0")) {
                                platillosElegidos.add(platillo);
                        }
                } while (!platillo.equals("0"));

                // Crear el pedido con un número de pedido único
                int numeroPedido = generarNumeroPedido();
                Pedido pedido = new Pedido(numeroPedido, "Pedido de " + nombreCliente, 0, restaurante);

                // Asignar un repartidor al pedido
                Repartidor repartidor = seleccionarRepartidor();
                if (repartidor != null) {
                        repartidor.asignarPedido(pedido);
                }

                // Imprimir los detalles del pedido
                System.out.println("Pedido realizado con éxito:");
                pedido.mostrarInformacion();
        }

        private static int generarNumeroPedido() {
                // Lógica para generar un número de pedido único
                // Puedes adaptar esto según tus necesidades
                return (int) (Math.random() * 1000);
        }

        private static Repartidor seleccionarRepartidor() {
                if (repartidores.isEmpty()) {
                        System.out.println("No hay repartidores registrados actualmente.");
                        return null;
                }

                System.out.println("Repartidores disponibles:");
                for (int i = 0; i < repartidores.size(); i++) {
                        System.out.println((i + 1) + ". " + repartidores.get(i).getNombre());
                }

                System.out.print("Selecciona un repartidor (ingresa el número correspondiente): ");
                try (Scanner scanner = new Scanner(System.in)) {
                        int opcion = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer de entrada

                        if (opcion < 1 || opcion > repartidores.size()) {
                                System.out.println("Opción inválida. No se asignará un repartidor al pedido.");
                                return null;
                        }

                        return repartidores.get(opcion - 1);
                }
        }

        private static void registrarRepartidor(Scanner scanner) {
                System.out.println("Registrando repartidor...");
                System.out.print("Ingrese el nombre del repartidor: ");
                String nombreRepartidor = scanner.nextLine();
                System.out.print("Ingrese la edad del repartidor: ");
                int edadRepartidor = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer de entrada
                System.out.print("Ingrese el domicilio del repartidor: ");
                String domicilioRepartidor = scanner.nextLine();
                System.out.print("Ingrese la zona asignada al repartidor: ");
                String zonaAsignada = scanner.nextLine();
                System.out.print("Ingrese el medio de transporte del repartidor: ");
                String medioTransporte = scanner.nextLine();
                System.out.print("Ingrese el tiempo estimado de llegada del repartidor: ");
                int tiempoEstimadoLlegada = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer de entrada
                System.out.print("Ingrese la calificación del repartidor: ");
                double calificacion = scanner.nextDouble();
                scanner.nextLine(); // Limpiar el buffer de entrada

                Repartidor repartidor = new Repartidor(nombreRepartidor, edadRepartidor, domicilioRepartidor, zonaAsignada);
                repartidor.setMedioTransporte(medioTransporte);
                repartidor.setTiempoEstimadoLlegada(tiempoEstimadoLlegada);
                repartidor.setCalificacion(calificacion);

                repartidores.add(repartidor);
                System.out.println("Repartidor registrado con éxito.");
        }

        private static void registrarPlatillo(Scanner scanner){
                System.out.println("Registrando platillo\n");
                System.out.println("Ingrese el tipo de platillo que desea registrar\n");
                System.out.println("1. Bebida\n 2. Comida\n 3. Postre\n");
                System.out.println("4.Salir al menu principal\n");        

                
                int opcionpla;
                int opcioncomida;
                int opcionpostre;
                int opcionbebida;
                do {
                        
                        opcionpla = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer de entrada
                        String trash;
                        switch (opcionpla) {

                                case 1:
                                        int opibebi;
                                        System.out.println("Para modificar alguna bebida pulsa 1. \nPara agregar las 5 bebidas posibles pulsa 2.\n3.-Terminar");
                                        do{
                                                opibebi=scanner.nextInt();
                                                scanner.nextLine(); // Limpiar el buffer de entrada
                                                
                                                switch(opibebi){
                                                        case 1: 
                                                                int modibebi;
                                                                System.out.println("Dame el número de bebida que deas modificar de 5 posibles\n");
                                                                modibebi=scanner.nextInt();
                                                                System.out.println("Dame el nombre de la nueva bebida");
                                                                String nombrebebidanueva = scanner.nextLine();
                                                                System.out.println("Ingresa los ingredientes necesarios para la bebida (ingrese '0' para terminar):\n");
                                                                List<String> ingrenecen=  new ArrayList<>();
                                                                String cosasn;
                                                                do {
                                                                        cosasn = scanner.nextLine();
                                                                        if (!cosasn.equals("0")) {
                                                                                ingrenecen.add(cosasn);
                                                                        }
                                                                } while (!cosasn.equals("0"));

                                                                System.out.println("Ingrese los pasos a seguir para elaborar la bebida\n");
                                                                List<String> pasoseguirn = new ArrayList<>();
                                                                String pasosn;
                                                                do {
                                                                        pasosn = scanner.nextLine();
                                                                        if (!pasosn.equals("0")) {
                                                                                pasoseguirn.add(pasosn);
                                                                        }
                                                                } while (!pasosn.equals("0"));

                                                                System.out.print("Ingrese el precio de la bebida : ");
                                                                int precion = scanner.nextInt();
                                                                 trash=scanner.nextLine();


                                                                bebidas[modibebi-1] = new Bebida(nombrebebidanueva, ingrenecen,pasoseguirn,precion);
                                                                System.out.println("Datos de la bebida nueva registrados con éxito.\n");


                                                                break;
                                                        case 2:
                                                                for(opcionbebida=0;opcionbebida<5;opcionbebida++){ 
                                                                System.out.println("Dame el nombre de la bebida");
                                                                String nombrebebida = scanner.nextLine();
                                                                System.out.println("Ingresa los ingredientes necesarios para la bebida (ingrese '0' para terminar):");
                                                                List<String> ingrenece=  new ArrayList<>();
                                                                String cosas;
                                                                do {
                                                                        cosas = scanner.nextLine();
                                                                        if (!cosas.equals("0")) {
                                                                                ingrenece.add(cosas);
                                                                        }
                                                                } while (!cosas.equals("0"));

                                                                System.out.println("Ingrese los pasos a seguir para elaborar la bebida");
                                                                List<String> pasoseguir = new ArrayList<>();
                                                                String pasos;
                                                                do {
                                                                        pasos = scanner.nextLine();
                                                                        if (!pasos.equals("0")) {
                                                                                pasoseguir.add(pasos);
                                                                        }
                                                                } while (!pasos.equals("0"));

                                                                System.out.print("Ingrese el precio de la bebida : ");
                                                                int precio = scanner.nextInt();
                                                                 trash=scanner.nextLine();


                                                                bebidas[opcionbebida] = new Bebida(nombrebebida, ingrenece,pasoseguir,precio);
                                                                System.out.println("Datos de la bebida registrados con éxito.");
                                                                }
                                                        menu=1;        
                                                        break;
                                                }
                                        }while(opibebi==1 || opibebi==2);
                                        break;
                                        
                                case 2:
                                        int opicomi;
                                        System.out.println("Para modificar alguna comida pulsa 1. \nPara agregar las 5 comidas posibles pulsa 2.\n3.-Terminar\n");
                                        do{         
                                                opicomi= scanner.nextInt();
                                                scanner.nextLine(); // Limpiar el buffer de entrada

                                                switch(opicomi){
                                                        case 1:
                                                                int modicomi;
                                                                System.out.println("Dame el número de la comida a registrar o modificar, de 5 posibles");
                                                                modicomi= scanner.nextInt();
                                                                System.out.println("Dame el nombre de la nueva comida");         
                                                                String nombrecomidan = scanner.nextLine();
                                                                System.out.println("Ingresa los ingredientes necesarios para la comida (ingrese '0' para terminar):");
                                                                List<String> ingrecomidan=  new ArrayList<>();
                                                                String cosascomin;
                                                                do {
                                                                        cosascomin = scanner.nextLine();
                                                                        if (!cosascomin.equals("0")) {
                                                                                ingrecomidan.add(cosascomin);
                                                                        }
                                                                } while (!cosascomin.equals("0"));

                                                                System.out.print("Ingrese los pasos a seguir para elaborar la comida");
                                                                List<String> pasoscomidan = new ArrayList<>();
                                                                String pasoscon;
                                                                do {
                                                                        pasoscon = scanner.nextLine();
                                                                        if (!pasoscon.equals("0")) {
                                                                                pasoscomidan.add(pasoscon);
                                                                        }
                                                                } while (!pasoscon.equals("0"));

                                                                System.out.print("Ingrese el precio de la comida : ");
                                                                int preciocon = scanner.nextInt();
                                                                trash=scanner.nextLine();
                                                                comidas[modicomi-1] = new Comida(nombrecomidan, ingrecomidan,pasoscomidan,preciocon);
                                                                System.out.println("Datos de la comida registrados con éxito.");
                                                                
                                                                break;


                                                        case 2:
                                                                for(opcioncomida=0;opcioncomida<5;opcioncomida++){ 
                                                                System.out.println("Dame el nombre de la comida");         
                                                                String nombrecomida = scanner.nextLine();
                                                                System.out.println("Ingresa los ingredientes necesarios para la comida (ingrese '0' para terminar):");
                                                                List<String> ingrecomida=  new ArrayList<>();
                                                                String cosascomi;
                                                                do {
                                                                        cosascomi = scanner.nextLine();
                                                                        if (!cosascomi.equals("0")) {
                                                                                ingrecomida.add(cosascomi);
                                                                        }
                                                                } while (!cosascomi.equals("0"));

                                                                System.out.print("Ingrese los pasos a seguir para elaborar la comida");
                                                                List<String> pasoscomida = new ArrayList<>();
                                                                String pasosco;
                                                                do {
                                                                        pasosco = scanner.nextLine();
                                                                        if (!pasosco.equals("0")) {
                                                                                pasoscomida.add(pasosco);
                                                                        }
                                                                } while (!pasosco.equals("0"));

                                                                System.out.print("Ingrese el precio de la comida : ");
                                                                int precioco = scanner.nextInt();
                                                                trash=scanner.nextLine();
                                                                comidas[opcioncomida] = new Comida(nombrecomida, ingrecomida,pasoscomida,precioco);
                                                                System.out.println("Datos de la comida registrados con éxito.");}
                                                                menu=1;
                                                                break; 
                                                        }                        
                                        }while(opicomi==1 || opicomi==2);   
                                        break;

                                case 3:
                                        int opipos;
                                        System.out.println("Para modificar alguna bebida pulsa 1. \nPara agregar las 5 comidas posibles pulsa 2.\n3.-Terminar\n");
                                        do{         
                                                opipos= scanner.nextInt();
                                                scanner.nextLine(); // Limpiar el buffer de entrada

                                                switch(opipos){

                                                        case 1:
                                                                int modipostre;
                                                                System.out.println("Dame el número del postre a registrar o modificar, de 5 posibles");
                                                                modipostre= scanner.nextInt();
                                                                System.out.println("Dame el nombre del nuevo postre");         
                                                                String nombrepostren = scanner.nextLine();
                                                                System.out.println("Ingresa los ingredientes necesarios para el postre (ingrese '0' para terminar):");
                                                                List<String> ingrepostren=  new ArrayList<>();
                                                                String cosaspostren;
                                                                do {
                                                                        cosaspostren = scanner.nextLine();
                                                                        if (!cosaspostren.equals("0")) {
                                                                                ingrepostren.add(cosaspostren);
                                                                        }
                                                                } while (!cosaspostren.equals("0"));

                                                                System.out.print("Ingrese los pasos a seguir para elaborar el postre");
                                                                List<String> pasospostren = new ArrayList<>();
                                                                String pasostren;
                                                                do {
                                                                        pasostren = scanner.nextLine();
                                                                        if (!pasostren.equals("0")) {
                                                                                pasospostren.add(pasostren);
                                                                        }
                                                                } while (!pasostren.equals("0"));

                                                                System.out.print("Ingrese el precio del postre : ");
                                                                int preciopostren = scanner.nextInt();
                                                                trash=scanner.nextLine();
                                                                postres[modipostre-1] = new Postre(nombrepostren, ingrepostren,pasospostren,preciopostren);
                                                                System.out.println("Datos de la comida registrados con éxito.");
                                                                break;
                                                        
                                                        case 2: 
                                                                for(opcionpostre=0;opcionpostre<5;opcionpostre++){                 
                                                                System.out.println("Dame el nombre del postre");         
                                                                String nombrepostre = scanner.nextLine();
                                                                System.out.println("Ingresa los ingredientes necesarios para el postre (ingrese '0' para terminar):");
                                                                List<String> ingrepostre=  new ArrayList<>();
                                                                String cosaspostre;
                                                                do {
                                                                        cosaspostre = scanner.nextLine();
                                                                        if (!cosaspostre.equals("0")) {
                                                                                ingrepostre.add(cosaspostre);
                                                                        }
                                                                } while (!cosaspostre.equals("0"));

                                                                System.out.print("Ingrese los pasos a seguir para elaborar el postre");
                                                                List<String> pasospostre = new ArrayList<>();
                                                                String pasostre;
                                                                do {
                                                                        pasostre = scanner.nextLine();
                                                                        if (!pasostre.equals("0")) {
                                                                                pasospostre.add(pasostre);
                                                                        }
                                                                } while (!pasostre.equals("0"));

                                                                System.out.print("Ingrese el precio del postre : ");
                                                                int preciopostre = scanner.nextInt();
                                                                trash=scanner.nextLine();
                                                                postres[opcionpostre] = new Postre(nombrepostre, ingrepostre,pasospostre,preciopostre);
                                                                System.out.println("Datos de la comida registrados con éxito.");}
                                                                menu=1; 
                                                                break;                                              

                                                        }
                                        }while(opipos==1 || opipos==2); 
                                        break;       

                                        
                                        
                                        
                                default:
                                        System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
                                        break;                                
                        }
        }while (opcionpla != 4);
}

        private static void registrarDatosRestaurante(Scanner scanner) {
                System.out.println("Registrando datos del restaurante...");
                System.out.print("Ingrese el nombre del restaurante: ");
                String nombreRestaurante = scanner.nextLine();
                System.out.print("Ingrese la dirección del restaurante: ");
                String direccionRestaurante = scanner.nextLine();
                System.out.print("Ingrese el teléfono del restaurante: ");
                String telefonoRestaurante = scanner.nextLine();

                restaurante = new Restaurante(nombreRestaurante, direccionRestaurante, telefonoRestaurante);
                System.out.println("Datos del restaurante registrados con éxito.");
        }
}