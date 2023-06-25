package P3.Ejercicio_1;

public abstract class Animal {
    private int patas;
    public Animal(int patas){
        this.patas=patas;
    }
    public void moverse(){

    }

    public void comer(){

    }
    public int getPatas() {
        return patas;
    }
    public void setPatas(int patas) {
        this.patas = patas;
    }

}
