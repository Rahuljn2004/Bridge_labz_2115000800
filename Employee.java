class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void updateSalary(double newSalary) {
        if (newSalary > 0) {
            salary = newSalary;
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    // Public method to display salary
    public double getSalary() {
        return salary;
    }
}

// Subclass demonstrating access to public and protected members
class Manager extends Employee {
    private String team;

    public Manager(int employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }

    public void displayManagerInfo() {
        System.out.println("Manager ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Managing Team: " + team);
    }
}
