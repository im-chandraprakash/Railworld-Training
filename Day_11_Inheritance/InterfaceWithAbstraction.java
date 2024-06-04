package Day_11_Inheritance;

interface A{

    void a();
    void b();
    void c();
    void d();
}

abstract  class Q implements A{

    public void c(){
        System.out.println("This is C");
    }
}

class M extends Q{

    public void a(){
        System.out.println("this is a");
    }

    public void b(){
        System.out.println("this is b");
    }
    public  void d(){
        System.out.println("this is d");
    }

}
public class InterfaceWithAbstraction {

    public static void main(String[] args) {

        M am = new M();

        am.a();
        am.b();
        am.c();
        am.d();
    }

}
