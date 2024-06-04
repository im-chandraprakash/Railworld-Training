package Oops.Inheritance;

class Animal{

    String name;

    public Animal(String name){
        this.name = name;
    }

    public void sound(){
        System.out.println("Animal sounds");
    }
}

class Dog extends Animal{

    public Dog(String name){
        super(name);
    }

    @Override
    public void sound(){
        System.out.println("Dog barks ...............");
    }
}

class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound(){
        System.out.println("Cat meous ............");
    }
}

public class AnimalExample{

    public static void main(String args[]){

        Dog dog = new Dog("Dog");
        Cat cat = new Cat("Cat");
        dog.sound();
        cat.sound();
    }
}

