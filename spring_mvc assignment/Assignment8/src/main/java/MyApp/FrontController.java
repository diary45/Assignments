package MyApp;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.faces.annotation.RequestMap;

@Controller
public class FrontController {

    @RequestMapping("french")
    public ModelAndView frnLogin(){
        ModelAndView mv=new ModelAndView("index");
        mv.addObject("username","Nom d'utilisateur");
        mv.addObject("password","le mot de passe");
        mv.addObject("login","connexion");
        return mv;

    }
    @RequestMapping("vietnamese")
    public ModelAndView vietLogin(){
        ModelAndView mv=new ModelAndView("index");
        mv.addObject("username","tên tài khoản");
        mv.addObject("password","mật khẩu mở khóa");
        mv.addObject("login","đăng nhập");
        return mv;

    }
    @RequestMapping("english")
    public ModelAndView engLogin(){
        ModelAndView mv=new ModelAndView("index");
        mv.addObject("username","usernamer");
        mv.addObject("password","password");
        mv.addObject("login","login");
        return mv;

    }



}
