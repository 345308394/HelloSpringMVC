package com.xin.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
@RequestMapping("/hello")
public String HelloSpring(Model model)
  {
	model.addAttribute("hello","Hello Spring MVC");
	return "hello";
  }
}
