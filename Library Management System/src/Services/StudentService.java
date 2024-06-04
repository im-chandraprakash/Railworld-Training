package Services;

import Dao.StudentDao;
import Models.Student;

import java.sql.SQLException;
import java.time.LocalDate;

public class StudentService {

     StudentDao studentDao;

     public StudentService(){
        studentDao = new StudentDao();
     }
    public void RegisterStudentService(Student student) throws SQLException {
         studentDao.RegisterStudent(student);
        System.out.println("Student Registered SuccessFully");
    }
    public void BuySubscriptionService(String name , String email) throws  SQLException{
        studentDao.BuySubscription(name , email);
    }
    public void IssueBookService(int studentId , int bookId , LocalDate returnDate) throws SQLException {
         studentDao.BookIssue(studentId , bookId , returnDate);
    }

    public void SubmitBookService(int studentId , int bookId) throws  SQLException {
        studentDao.SubmitBook(studentId , bookId);
    }

    public void ViewAllBooksService() throws  SQLException {
        studentDao.ViewAllBooks();
    }

    public void ViewProfileService(int studentId) throws  SQLException {
        studentDao.ViewProfile(studentId);
    }

}
