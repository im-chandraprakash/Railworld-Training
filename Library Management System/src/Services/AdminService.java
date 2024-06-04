package Services;

import Dao.AdminDao;
import Models.Student;
import Models.Users;

import java.sql.SQLException;

public class AdminService {

    AdminDao adminDao;

    public  AdminService(){
        adminDao = new AdminDao();
    }

    public void CreateCategoryService(String categoryName , String categoryDescription) throws SQLException {
        adminDao.CreateCategoryDao(categoryName , categoryDescription);
    }

    public void CreateLibrarianService(Users users)throws SQLException{
        adminDao.CreateLibrariansDao(users);
    }

    public void ViewAllStudentsService() throws  SQLException{
        adminDao.ViewAllStudents();
    }
    public void ViewAllCategoriesService() throws  SQLException{
        adminDao.ViewAllCategories();
    }
    public void ViewAllLibrarians() throws  SQLException{
        adminDao.ViewAllLibrarians();
    }
}
