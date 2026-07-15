package Abstraction;

public abstract class Employee {
    private int employeeId;
    private String employeeName;
    Employee(int employeeId,String employeeName){
        this.employeeId=employeeId ;
        this.employeeName=employeeName ;
    }
    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName){
        this.employeeName=employeeName;
    }

    public void setEmployeeId(int employeeId){
        this.employeeId=employeeId;
    }
    public void displayEmployeeInfo(){
        System.out.println("EmployeeId:"+employeeId);
        System.out.println("EmployeeName:"+employeeName);
    }
    public abstract int  calculateSalary();
}

class partTimeEmployee extends Employee{
     private int hoursWorked;
    private int hourlyRate;

    partTimeEmployee(int employeeId,String employeeName,int hoursWorked,int hourlyRate){
        super(employeeId,employeeName);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setter(int hourlyRate,int hoursWorked){
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }

    @Override
    public int calculateSalary() {
        return hoursWorked*hourlyRate;

    }
}

class FullTimeEmployee extends Employee{
    private int monthlySalary;

    FullTimeEmployee(int employeeId,String employeeName,int monthlySalary){
        super(employeeId,employeeName);
        this.monthlySalary=monthlySalary;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }
    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary=monthlySalary;
    }

    @Override
    public int calculateSalary() {
        return monthlySalary;
    }
}
class MainEmployee{
    public static void main(String[] args) {
        FullTimeEmployee a = new FullTimeEmployee(1,"Vaishnavi",50000);
        partTimeEmployee b = new partTimeEmployee(2,"Apeksha",6,500);

        a.displayEmployeeInfo();
        System.out.println("Salary: " + a.calculateSalary());
        System.out.println("...............");

        b.displayEmployeeInfo();
        System.out.println("Salary: " + b.calculateSalary());

    }
}


