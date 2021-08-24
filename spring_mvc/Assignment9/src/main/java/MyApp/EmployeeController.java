package MyApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {
    static List<Employee> EmployeeList=new ArrayList<>(List.of(
            new Employee("1","Amit","100000"),
            new Employee("2","Amit1","100000"),
            new Employee("3","Amit2","100000"),
            new Employee("4","Amit3","100000"),
            new Employee("5","Amit4","100000"),
            new Employee("6","Amit5","100000"),
            new Employee("7","Amit6","100000"),
            new Employee("8","Amit7","100000"),
            new Employee("9","Amit8","100000"),
            new Employee("10","Amit9","100000"),
            new Employee("11","Amit5","100000"),
            new Employee("12","Amit6","100000"),
            new Employee("13","Amit7","100000"),
            new Employee("14","Amit8","100000"),
            new Employee("15","Amit9","100000"),
            new Employee("16","Amit5","100000"),
            new Employee("17","Amit6","100000"),
            new Employee("18","Amit7","100000"),
            new Employee("19","Amit8","100000"),
            new Employee("20","Amit9","100000"),
            new Employee("16","Amit5","100000"),
            new Employee("17","Amit6","100000"),
            new Employee("18","Amit7","100000"),
            new Employee("19","Amit8","100000"),
            new Employee("25","Amit9","100000")));


    @RequestMapping(value = {"view","view/{offset}"})
    public ModelAndView view(@PathVariable("offset")Integer offset){
        int o=offset-1;
        ModelAndView mv=new ModelAndView("showAllEmployee");
        if(offset==null){
        mv.addObject("list",EmployeeList);
        }
        else{
            mv.addObject("list",EmployeeList.subList(o*5,(o+1)*5));

        }
        mv.addObject("length",(EmployeeList.size())/5);
        return mv;

    }
}
