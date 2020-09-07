package JavaIII.Project_1;

public class EmployeeManager {
    Employee [] employees;
    
   // count the number of Employee under a manager
            static int counter = 0;
            
            public EmployeeManager(Employee[] employees)
            {
                this.employees = employees;
                
            }
            //Recursive
            public int  countEmployeesUnder(String employeeManager)
            {
                for(Employee employee: employees)
                {
                    if(employee.manager != null)
                    {
                        if(employee.manager.compareTo(employeeManager)==0)
                        {
                            counter = 1 + countEmployeesUnder(employee.employee);
                        }
                    }
                }
                return counter;
            }
            
}

