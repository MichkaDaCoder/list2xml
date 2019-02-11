package list2xml.dao;

import java.util.List;
import list2xml.model.Employee;

/**
 * IEmployeeDAO : Implemented by EmployeeImplementation class
 * 
 * @author MichkaDaCoder
 */
public interface IEmployeeDAO {
    List<Employee> InitEmployees();
}
