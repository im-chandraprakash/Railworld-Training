package Day_11_Inheritance;


abstract class Bike{

    public  Bike(){
        System.out.println("Bike is calling :  ");
    }
    abstract void run();

    void changeGear(){
        System.out.println("Gear Change");
    }
}

class Honda extends Bike{
    void run(){
        System.out.println("my bike is running bro");
    }
}

public class Abstraction {

    public static void main(String[] args) {

        Honda hnd = new Honda();
        hnd.run();
        hnd.changeGear();
    }
}
