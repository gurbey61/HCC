package JavaIII.Project_1;

public class Employee {
    
    public String employee;
    public String manager;
    
    // Constructor
    
    public Employee()
    {
        this.employee = null;
        this.manager = null;
    }
    //constructor
    public Employee(String employee, String manager)
    {
        this.employee = employee;
        this.manager = manager;
    }
    public void setEmployee(String employee)
    {
        this.employee = employee;
    }
    // return value
    public String getEmployee()
    {
        return employee;
    }
    public void setManager(String manager)
    {
        this.manager = manager;
    }
    public String getManager()
    {
        return manager;
    }
}
