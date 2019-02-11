package list2xml.model;

import java.io.Serializable;

/**
 * Employee.java: POJO class of employee
 * @author MichkaDaCoder
 */
public class Employee implements Serializable{
    private String Code; // Unique identifier of the Employee
    private String FirstName; //First name of the Employee
    private String LastName; //Last name of the Employee
    private String Email; //Email address of the Employee

    /**
     * Default constructor of the class
     */
    public Employee() {
    }

    /**
     * Constructor of the class 
     * @param Code
     * @param FirstName
     * @param LastName
     * @param Email 
     */
    public Employee(String Code, String FirstName, String LastName, String Email) {
        this.Code = Code;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
    }

    /**
     * Getter of the Code attribute
     * @return Code
     */
    public String getCode() {
        return Code;
    }

    /**
     * Setter of the <b>Code</b> attribute.
     * @param Code 
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Getter of <b>FirstName</b> attribute
     * @return 
     */
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Getter of <b>LastName</b> attribute
     * @return <b>LastName</b>
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * Setter of <b>LastName</b> attribute
     * @param LastName 
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * Getter of <b>Email</b> attribute
     * @return <b>Email</b>
     */
    public String getEmail() {
        return Email;
    }

    /**
     * Setter of <b>Email</b> attribute
     * @param Email 
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return this.LastName+" "+this.FirstName+"("+this.Code+")";
    }
    
    
}
