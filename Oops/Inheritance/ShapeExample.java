package Oops.Inheritance;


class Shape{

    int a;
    int b;

    public Shape(int a  , int b){
        this.a = a;
        this.b = b;
    }
    public int getArea(){
        return a*b;
    }

    public  void getPerimeter(){

    }
}

class Circle extends  Shape{

    public Circle(int a , int b){
        super( a , b);
    }
}

class Triangle extends  Shape{

    public Triangle(int a , int b){
        super( a , b);
    }
}
public class ShapeExample {

    public static void main(String[] args) {

        Circle circle = new Circle(10 , 20);
        Triangle triangle = new Triangle(20 , 20);

        System.out.println("Area is " + circle.getArea());
        System.out.println("Triangle area is : " + triangle.getArea());
        System.out.println("Area is " + circle.getArea());
        System.out.println("Triangle area is : " + triangle.getArea());
    }
}
