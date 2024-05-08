package Task;

public class School {

    private String sclName;
    private Student students;

    public School(){

    }
    public  School(String sclName , Student students){
        this.sclName = sclName;
        this.students = students;
    }

    public void setSclName(String sclName){
        this.sclName = sclName;
    }
    public String getSclName(){
        return sclName;
    }
    public void setStudents(Student students){
        this.students = students;
    }



    @Override
    public String toString() {
        return "School{" +
                "sclName='" + sclName + '\'' +
                ", students=" + students +
                '}';
    }

    //    @Override
    //    public void toString(){
    //
    //    }

}
