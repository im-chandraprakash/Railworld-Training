package Oops;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class studentEnrollement {
    
    private String name;
    private int studentId;
    private char grade;
    private ArrayList<String> courses;

    public void enrollStundent(String course){
        courses.add(course);
    }

    public void displayStudentInfo(){

        System.out.println("Student name is : " + name);
        System.out.println("Student Id is : " + studentId);
        System.out.println("Student Grade is " + grade);
        System.out.println("Student Enrolled courses are : ");

        for(String str : courses){
            System.out.println(str);
        }
    }

    public void dropStudent(String course){
        int ind = courses.indexOf(course);
        courses.remove(ind);
    }
}
