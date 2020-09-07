package JavaIII.Project_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
public class EmployeeDemo {
    public static void main(String[] args) {
        
        //Read the employee.txt and return employees list
        
       Employee[] employees = readFile("C:\\Users\\gdemirturk\\OneDrive\\Shared\\Coding\\git\\javabyLiang\\src\\JavaIII\\Project_1\\employee.txt");
       
       //pass the employee list to employee manager class
       EmployeeManager employeeManager = new EmployeeManager(employees);
       String manager = "Joseph";
       int empCount = employeeManager.countEmployeesUnder(manager);
       System.out.println("Number of employees report to " + manager + " are:"+ empCount);
    }
   // Read file and return list of employees
    private static Employee [] readFile(String fileName) {
        Employee[] employees = new Employee[0];
     try{
         File file = new File(fileName);
            try (Scanner scanner = new Scanner(file)) {
                while(scanner.hasNextLine())
                {
                    StringTokenizer st = new StringTokenizer(scanner.nextLine());
                    Employee employee = new Employee();
                    employee.employee = st.nextToken();
                    if(st.hasMoreTokens()) {
                        String manager = st.nextToken();
                        
                        // Check if manager is not empty, if empty then last employee
                        if(!"".equals(manager))
                            employee.manager = manager;
                    }
                    
                    employees = addEmployee(employees, employee);
                }  }
     }    catch (FileNotFoundException e)
     {
        }
     
        return employees;
    }
      // Add a new employee to the employee list
    private static Employee[] addEmployee(Employee[] products, Employee productToAdd) {
        Employee[] newEmployee = new Employee[products.length + 1];
        System.arraycopy(products, 0, newEmployee, 0, products.length);
        newEmployee[newEmployee.length - 1] = productToAdd;

        return newEmployee;
    }
}
