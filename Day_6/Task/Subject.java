package Task;

public class Subject {

    private String math;
    private String hindi;
    private  String english;
    private String pysics;
    private  String chemistry;

    public  Subject(){

    }
    public Subject(String math, String hindi, String english, String pysics, String chemistry) {
        this.math = math;
        this.hindi = hindi;
        this.english = english;
        this.pysics = pysics;
        this.chemistry = chemistry;
    }

    public String getMath() {
        return math;
    }

    public void setMath(String math) {
        this.math = math;
    }

    public String getHindi() {
        return hindi;
    }

    public void setHindi(String hindi) {
        this.hindi = hindi;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getPysics() {
        return pysics;
    }

    public void setPysics(String pysics) {
        this.pysics = pysics;
    }

    public String getChemistry() {
        return chemistry;
    }

    public void setChemistry(String chemistry) {
        this.chemistry = chemistry;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "math='" + math + '\'' +
                ", hindi='" + hindi + '\'' +
                ", english='" + english + '\'' +
                ", pysics='" + pysics + '\'' +
                ", chemistry='" + chemistry + '\'' +
                '}';
    }
}
