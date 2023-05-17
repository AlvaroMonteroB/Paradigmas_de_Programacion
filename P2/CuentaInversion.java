
import java.util.Scanner;

public class CuentaInversion{
    
    private String Id;
    private Double Balance;
    private Double tarifa; 
    private String nombre;

    public CuentaInversion(String id1, Double Bal, Double tar, String name){
        this.Id=id1;
        this.Balance=Bal;
        this.tarifa=tar;
        this.nombre=name;
    }

    public Double Calc_inter(){
        Double output;  
        output=Balance*tarifa;
        Balance+=output;
        return output;
    }
    
    public Double obt_balance(){
        return Balance;
    }

    public void deposito(Double ingreso){
        Balance+=ingreso;
    }

    public boolean retiro(Double ret){
        if(ret>Balance){
            return false;
        }else{
            Balance-=ret;
        }
        return true;
    }

    public static void main(String[] args){
        CuentaInversion cuenta= new CuentaInversion("2022630403", 0.0, .08, "Alvaro");
        //Double aux=0.0;
        System.out.print("Digite la cantidad a depositar\n");
        Scanner scan=new Scanner(System.in);
        cuenta.deposito(scan.nextDouble());
        System.out.print("Digite la cantidad a retirar\n");
        boolean a=cuenta.retiro(scan.nextDouble());
        if(a){
            System.out.print("Retiro efectuado con exito\n");
        }else{
            System.out.print("Retiro no efectuado\n");
        }   
        double interes;
        interes=cuenta.Calc_inter();
        scan.close();
            System.out.print("Tu interés es de ");
            System.out.print(interes);
        System.out.print("\nSeñor "+cuenta.nombre+", El balance de tu cuenta es "+cuenta.obt_balance()+'\n'+"id: "+cuenta.Id);
        

    }

}


