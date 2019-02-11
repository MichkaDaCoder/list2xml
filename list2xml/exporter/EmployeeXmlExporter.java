package list2xml.exporter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import list2xml.dao.EmployeeImplementation;
import list2xml.dao.IEmployeeDAO;
import list2xml.model.Employee;

/**
 * EmployeeXmlExporter.java:
 *
 * @author MichkaDaCoder
 */
public class EmployeeXmlExporter {

    IEmployeeDAO employeeDAO=new EmployeeImplementation();
    
    final String FIELD_CODE="CODE";
    final String FIELD_FIRST_NAME="FIRSTNAME";
    final String FIELD_LAST_NAME="LASTNAME";
    final String FIELD_EMAIL="EMAIL";
    
    /**
     * Default constructor of the class.
     */
    public EmployeeXmlExporter() {}
    
    /**
     * Method for exporting a List of Employees to an XML file.
     * @param l
     * @throws IOException 
     */
    public void Export2Xml(List<Employee> l) throws IOException {
        FileWriter fw=new FileWriter("employees.xml");
        StringBuilder sb=new StringBuilder();
        
        sb.append("<EMPLOYEES>");
        
        l=employeeDAO.InitEmployees();
        for(Employee emp : l) {
            sb.append("<EMPLOYEE>");
            sb.append("<"+FIELD_CODE+">"+emp.getCode()+"</"+FIELD_CODE+">");
            sb.append("<"+FIELD_FIRST_NAME+">"+emp.getFirstName()+"</"+FIELD_FIRST_NAME+">");
            sb.append("<"+FIELD_LAST_NAME+">"+emp.getLastName()+"</"+FIELD_LAST_NAME+">");
            sb.append("<"+FIELD_EMAIL+">"+emp.getEmail()+"</"+FIELD_EMAIL+">");
            sb.append("</EMPLOYEE>");
        }
        sb.append("</EMPLOYEES>");
        fw.write(sb.toString());
        fw.flush();
        fw.close();
        
        
    }
}
