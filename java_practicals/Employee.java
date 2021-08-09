public class Employee implements Comparable<Employee> {
    String id, name, department;
    double salary;

    void displayDetails() {
        System.out.println(this);
    }

    Employee(String id, String name, double salary, String department) {
        this.department = department;
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", department='" + department + '\'' +
                '}' + "\n";
    }


    @Override
    public int compareTo(Employee o) {
        return this.id.compareTo(o.id);
    }
}
