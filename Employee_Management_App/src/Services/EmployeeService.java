package Services;

import Dao.EmpyloyeeDao;
import Models.Employee;

import java.sql.SQLException;

public class EmployeeService {

    private EmpyloyeeDao empyloyeeDao = new EmpyloyeeDao();

    public void addEmployeeService(Employee employee) throws SQLException {
        empyloyeeDao.addEmployeeDao(employee);
    }

    public void updateEmployeeService(Employee employee) throws SQLException{
        empyloyeeDao.updateEmployeeDao(employee);
    }

    public void deleteEmployeeService(int id) throws SQLException{
        empyloyeeDao.deleteEmployeeDao(id);
    }

}
