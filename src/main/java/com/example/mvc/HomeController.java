package com.example.mvc;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.transform.Result;

@Controller //(controller)
public class HomeController {

    @RequestMapping("/")
    public String home ()
    {
        return "home";
    }

//    @RequestMapping("add")
    //(MVC example.)
    //servlet way.
//       public String add(HttpServletRequest req , HttpSession session){
//       System.out.println("the add method is calling");
//       int num1 = Integer.parseInt(req.getParameter("num1"));
//       int num2 = Integer.parseInt(req.getParameter("num2"));
//       int result = num1 +num2;

//      System.out.println("the result is:"+ result);
//      session.setAttribute("result", result);
//      return "Result.jsp"; (view)
//    }


    @RequestMapping("addAlien")
    public String alien (Alien alien, Model model)
    {
        model.addAttribute("alien", alien);
        return "alien";
    }

    // springBoot way.
    @RequestMapping("add")
    public String add(int num1 , int  num2,  Model model) // (model)
    {
         int result = num1 + num2;
         model.addAttribute("result", result);
         return "result";
    }

    //modelAndView.
//    public ModelAndView add (int num1, int num2, ModelAndView mv) {
//        int result = num1 + num2;
//        mv.addObject("result", result);
//        mv.setViewName("result");
//        return mv;
//    }



    
//    public String alien (Alien alien)
//    {
//        return "Result.html";
//    }
}
