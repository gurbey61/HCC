package JavaIII.Hw1;

// import statements
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDemo {

    public static void collectEmployee(String fileName) throws IOException {

        // Create the ArrayList
        List<Employee> employeeList = new ArrayList<>();

        // Provide the Path and Load it to the memory
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);

        // Reading the first line
        String line = br.readLine();

        // Fill the String Array
        while (line != null){
            String manager = "";
            String fullName = "";
            String[] delLine;

            if(line.contains("  ")) {
                delLine = line.split("  "); // split by double space
                fullName = delLine[0];
                manager = delLine[1];

            } else if (line.contains(" \t")) {
                delLine = line.split(" \t"); // split by space and tab
                fullName = delLine[0];
                manager = delLine[1];

            } else {
                fullName = line;
            }

            // Create the employee objects
            Employee employee = new Employee(fullName, manager);

            // Use ArrayList add method to fill the ArrayList with Employee objects
            employeeList.add(employee);

            line = br.readLine(); // Read the next line
        }

        // Call display method to display Employee List
        display(employeeList);

        // Call sortByManager method to sort by Name and  display the data
        sortByName(employeeList);

        // Call sortByManager method to sort by Manager and  display the data
        sortByManager(employeeList);
    }

    // display method definition
    public static void display(List<Employee> employees) {
        System.out.println("Displaying all names and managers\n");;
        // For each loop to go through employeeList
        for (Employee employee : employees) {
            if (employee.getManager() == "") {              // if there is no manager,
                System.out.println(employee.getName()); // Display only the Employee
            } else {
                System.out.println(employee.getName() + " - " + employee.getManager()); // Displays by name
            }
        }
        System.out.println("\n");
    }

    // sortByName method definition
    public static void sortByName(List<Employee> list) {
        // Create an ArrayList of String type to hold managers and sort them with the ArrayList method
        List<String> names  = new ArrayList<>();

        for (Employee name: list) {
            if (!names.contains(name.getName())){  // Adding distinct names only
                names.add(name.getName());
            }
        }
        names.remove("Name"); // Removes the title "Name" from the list

        System.out.println("Employee names before sorting");
        System.out.println(names.toString() + "\n");   // Displays the ArrayList before sorting

        Collections.sort(names);      // Sorts the ArrayList

        System.out.println("Employee names after sorting");
        System.out.println(names.toString() + "\n");   // Displays the sorted ArrayList
    }

    // sortByManager method definition
    public static void sortByManager(List<Employee> list) {
        // Create an ArrayList of String type to hold managers and sort them with the ArrayList method
        List<String> managers  = new ArrayList<>();

        for (Employee manager: list) {
            if (!managers.contains(manager.getManager())){  // Adding distinct Managers only
                managers.add(manager.getManager());
            }
        }
        managers.remove("Manager"); // Removes the title "Manager"
        managers.remove((managers.size()-1)); // There was a "," as a last item and I could not find a way not to add to the list

        System.out.println("Manager names before sorting");
        System.out.println(managers.toString() + "\n");   // Displays the ArrayList before sorting

        java.util.Collections.sort(managers);      // Sorts the ArrayList

        System.out.println("Manager names after sorting");
        System.out.println(managers.toString() + "\n");   // Displays the sorted ArrayList


    }

    // main method
    public static void main(String[] args) throws IOException {
        String fileName = "src/JavaIII/Hw1/Portfolio.txt";
        collectEmployee(fileName); // calling collectEmployee method




    }
}