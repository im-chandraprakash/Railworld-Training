package Day_10_classAndObject;

class classAndObject {

   private int height;
   private String name;

     void setInfo(int height , String name){
        this.height = height;
        this.name = name;
    }
     void getInfo(){
        System.out.println("height is : " + height);
        System.out.println("name is : " + name);
    }

    public static void main(String args[]){

        classAndObject obj = new classAndObject();
        obj.height = 20;
        obj.getInfo();
        obj.setInfo(6 , "chandu");
        obj.getInfo();

    }
}
