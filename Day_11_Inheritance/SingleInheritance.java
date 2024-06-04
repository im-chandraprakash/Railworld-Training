package Day_11_Inheritance;


class Animal{

    String name;

    public  Animal(){

    }
    public Animal(String name){
        System.out.println("This is parent class");
    }
    void eat(){
        System.out.println("this animal " + name + " eats anything");
    }
}
public class SingleInheritance extends  Animal {


    SingleInheritance(String name){
        this.name = name;
    }

    void bark(){
        System.out.println("The animal " + name + " barks : ");
    }

    @Override
    void eat(){
        System.out.println("This animal " + name + "eats pedigree only");
    }

    public static void main(String[] args) {

        SingleInheritance obj = new SingleInheritance("Dog");
        obj.eat();
        obj.bark();
    }
}
