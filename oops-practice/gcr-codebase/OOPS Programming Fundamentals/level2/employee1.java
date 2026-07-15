class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Employee {
    Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager(101, "IT", 75000);

        m.displayDetails();
        System.out.println("Salary: " + m.getSalary());

        m.setSalary(85000);
        System.out.println("Updated Salary: " + m.getSalary());
    }
}