package Controllers;

public class Employee {
    String employeeName,employeeDept,employeeDesignation;
    long employeeSal;
    long employeeID;

    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = Employee.empcounter++;
    }
//    public void setEmployeeID() {
//        this.employeeID = Employee.empcounter++;
//    }

    static long empcounter=100;



    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDept() {
        return employeeDept;
    }

    public void setEmployeeDept(String employeeDept) {
        this.employeeDept = employeeDept;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public long getEmployeeSal() {
        return employeeSal;
    }

    public void setEmployeeSal(long employeeSal) {
        this.employeeSal = employeeSal;
    }

    @Override
    public String toString() {
        return "Controllers.Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeDept='" + employeeDept + '\'' +
                ", employeeDesignation='" + employeeDesignation + '\'' +
                ", employeeSal=" + employeeSal +
                ", employeeID=" + employeeID +
                '}'+"\n";
    }

    public Employee(){}
    public Employee(String employeeName, String employeeDept, String employeeDesignation, long employeeSal, long employeeID) {
        this.employeeName = employeeName;
        this.employeeDept = employeeDept;
        this.employeeDesignation = employeeDesignation;
        this.employeeSal = employeeSal;
        this.employeeID = empcounter++;
    }
}
