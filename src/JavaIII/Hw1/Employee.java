package JavaIII.Hw1;

public class Employee {
    private String name;
    private String manager;

    // Default constructor
    public Employee() {

    }

    // Constructor with arguments
    public Employee(String name, String manager) {
        this.name = name;
        this.manager = manager;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}
