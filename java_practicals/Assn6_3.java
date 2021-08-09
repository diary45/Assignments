import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Assn6_3 {
    public static void main(String[] args) {
        class Employee implements Comparable<Employee>
        {
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
        Employee e1=new Employee("a","vishnu",234000000,"fullstack");
        Employee e2=new Employee("c","srivishnu",234000,"fullstack");
        Employee e3=new Employee("g","Bhargavi kavalnekar",234000,"fullstack");
        Employee e4=new Employee("12304","nihal",234000,"fullstack");
        Employee e5=new Employee("123000","vishnu",234000000,"fullstack");
        Employee e6=new Employee("12300","bakul",234000,"fullstack");
        Employee e7=new Employee("12003","hingula",234000,"fullstack");
        Employee e8=new Employee("12304","samrudhi",234000,"fullstack");
        Set<Employee> employeeSet=new TreeSet<Employee>();
        employeeSet.add(e1);
        employeeSet.add(e2);
        employeeSet.add(e3);
        employeeSet.add(e4);
        employeeSet.add(e5);
        employeeSet.add(e6);
        employeeSet.add(e7);
        employeeSet.add(e8);
        employeeSet.add(e1);
        System.out.println("choose an option");
        System.out.println("a)ID");

        System.out.println("b)name");
        System.out.println("c)Department");
        System.out.println("d)Salary");
        Scanner s=new Scanner(System.in);
        String op= s.next();
        if(op.equals("b"))
        {

            class AccordingName implements Comparator<Employee> {


                @Override
                public int compare(Employee o1, Employee o2) {
                    return o1.name.compareTo(o2.name);
                }
            }
            Set<Employee> emp = new TreeSet<>(new AccordingName());
            emp.addAll(employeeSet);
            System.out.println(emp);


        }
        if(op.equals("a"))
        {

            class AccordingID implements Comparator<Employee> {


                @Override
                public int compare(Employee o1, Employee o2) {
                    return o1.id.compareTo(o2.id);
                }
            }
            Set<Employee> emp = new TreeSet<>(new AccordingID());
            emp.addAll(employeeSet);
            System.out.println(emp);


        }
        if(op.equals("c"))
        {

            class AccordingDept implements Comparator<Employee> {


                @Override
                public int compare(Employee o1, Employee o2) {
                    if(o1.department.equals(o2.department)){
                        return 0;
                    }
                    return o1.department.compareTo(o2.department);
                }
            }
            Set<Employee> emp = new TreeSet<>(new AccordingDept());
            emp.addAll(employeeSet);
            System.out.println(emp);


        }
        if(op.equals("d"))
        {

            class AccordingSal implements Comparator<Employee> {


                @Override
                public int compare(Employee o1, Employee o2) {
                    if(o1.salary==o2.salary)
                        return -1;
                    return (int)((o1.salary)-(o2.salary));
                }
            }
            Set<Employee> emp = new TreeSet<>(new AccordingSal());
            emp.addAll(employeeSet);
            System.out.println(emp);


        }



    }
}

