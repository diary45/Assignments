import java.util.HashSet;
import java.util.Set;

public class Assn5_1 {
    public static void main(String[] args) {
        Set<Employee> employees=new HashSet<>();
        Employee e1=new Employee("123000","vishnu",234000000,"fullstack");
        Employee e2=new Employee("12300","srivishnu",234000,"fullstack");
        Employee e3=new Employee("12003","Bhargavi kavalnekar",234000,"fullstack");
        Employee e4=new Employee("12304","nihal",234000,"fullstack");
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        System.out.println(employees);

    }
}

