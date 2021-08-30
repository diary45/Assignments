package Controllers;

import Controllers.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FrontController {
    static List<Employee> EmployeeList=new ArrayList<>(List.of(new Employee("vishnu","appsNA","full stack developer",10000000,101),new Employee("mohan","roataract","president",100000,102)));



    @RequestMapping("add")
    public ModelAndView addEmployee(@RequestParam("employeeID" ) long empID,@RequestParam("employeeName" ) String empName,@RequestParam("employeeSal" ) long empSal,@RequestParam("employeeDesignation") String empIDes,@RequestParam("employeeDept" ) String empDept){
        Employee e2=new Employee(empName,empDept,empIDes,empSal,empID);
        EmployeeList.add(e2);

        System.out.println(EmployeeList);
        ModelAndView mv=new ModelAndView("display");
        mv.addObject("list",EmployeeList);
        return  mv;

    }

    @RequestMapping("delete")
    public ModelAndView deleteEmployee(long employeeID){
        EmployeeList.removeIf((e)->{return employeeID==(e.employeeID);});
        System.out.println(EmployeeList);
        ModelAndView mv=new ModelAndView("display");
        mv.addObject("list",EmployeeList);
        return  mv;

    }

    @RequestMapping("update")
    public ModelAndView updateEmployee(@ModelAttribute Employee e1, @RequestParam("employeeID") long temp){
        deleteEmployee(temp);
        e1.employeeID=temp;
        ModelAndView mv=addEmployee(e1.employeeID, e1.employeeName, e1.employeeSal, e1.employeeDesignation, e1.employeeDept);

//        System.out.println(EmployeeList);
        return  mv;

    }



}

