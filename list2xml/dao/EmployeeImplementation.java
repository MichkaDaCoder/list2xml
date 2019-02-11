package list2xml.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import list2xml.model.Employee;

/**
 * EmployeeImplementation.java: implements <b>IEmployeeDAO</b> to initialize a List of employee
 * 
 * @author MichkaDaCoder
 */
public class EmployeeImplementation implements Serializable, IEmployeeDAO{

    /**
     * This method initialize an Employee List
     * @return List of Employees
     */
    @Override
    public List<Employee> InitEmployees() {
        List<Employee> l=new ArrayList<>();
        l.add(new Employee("EMP-022019", "Jane", "ADAMS", "jane.adams@acme.com"));
        l.add(new Employee("EMP-072016", "John", "ADAMS", "john.adams@acme.com"));
        l.add(new Employee("EMP-112011", "Alex", "DANIELS", "alex.daniels@acme.com"));
        l.add(new Employee("EMP-122009", "Alexandra", "GOMEZ", "alexandra.gomez@acme.com"));
        return l;
    }

}
