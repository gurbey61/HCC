package JavaIII.Hw1;

public class EmployeeManager {
    Employee [] employees;

    // Count how many employees report
    static int counter = 0;

    public EmployeeManager(Employee[] employees)
    {
        this.employees = employees;

    }
    //Recursive
    public int  countEmployeesUnder(String manager) {

        for(Employee employee: employees) {

            if(employee.getManager() != null) {

                if(employee.getManager().equals(manager)) {

                    counter = 1 + countEmployeesUnder(employee.getName()); // Not sure about this part getName()
                }
            }
        }
        return counter;
    }

}

