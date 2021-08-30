package Components;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    ModelAndView hello(){
        String ms="hello everyone";
        ModelAndView mv=new ModelAndView();
        mv.setViewName("hello.jsp");
        mv.addObject("message",ms);
        return mv;


    }

}
