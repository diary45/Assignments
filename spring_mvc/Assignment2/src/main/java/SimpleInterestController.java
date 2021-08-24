import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleInterestController
{
    int count=0;
    @RequestMapping("/simpleinterest")
    ModelAndView simpleInterest(@RequestParam("P") double p,@RequestParam("T") double t,@RequestParam("R") double r){
        double result=p*t*r/100;
        ModelAndView mv=new ModelAndView();
        mv.setViewName("SimpleInterest.jsp");
        mv.addObject("result",result);
        System.out.println(count++);
        return mv;

    }


}
