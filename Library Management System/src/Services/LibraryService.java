package Services;

import Dao.LibraryDao;
import Models.Book;

import java.sql.SQLException;

public class LibraryService {

    LibraryDao libraryDao;

    public LibraryService(){
        libraryDao = new LibraryDao();
    }

    public void CreateBookService(Book book) throws SQLException {
        libraryDao.BookCreationDao(book);
    }
    public void SearchBookService( String bookName , String bookAuthor) throws SQLException{
        libraryDao.SearchBook(bookName , bookAuthor);
    }
    public void SearchStudentService(String studentName , String studentEmail) throws SQLException {
        libraryDao.SearchStudent(studentName , studentEmail);
    }
    public void SearchCategoryService(String categoryName) throws SQLException{
        libraryDao.SearchCategory(categoryName);
    }
    public void SearchLibrarianServicce(String userName , String userEmail) throws  SQLException{
        libraryDao.SearchLibrarian(userName , userEmail);
    }

}
