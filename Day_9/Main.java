package Day_9;
public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Alice", 85);
        Student student2 = new Student("Bob", 90);

        int comparisonResult = student1.compareTo(student2);

        if (comparisonResult > 0) {
            System.out.println("Alice" + " has higher marks than " + "Bob");
        }
        else {
            System.out.println("Bob" + " has higher marks than  " + "Alice");
        }
    }


}
