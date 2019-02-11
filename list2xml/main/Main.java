package list2xml.main;

import java.io.IOException;
import list2xml.dao.EmployeeImplementation;
import list2xml.dao.IEmployeeDAO;
import list2xml.exporter.EmployeeXmlExporter;

/**
 * Main.java: class for main(String[]) method.
 *
 * @author MichkaDaCoder
 */
public class Main {
  public static void main(String[] a) {
      IEmployeeDAO employeeDAO=new EmployeeImplementation();
      EmployeeXmlExporter employeeXML=new EmployeeXmlExporter();
      
      try {
          employeeXML.Export2Xml(employeeDAO.InitEmployees());
      }
      catch(IOException ex) {
          ex.printStackTrace();
      }
  }
}
