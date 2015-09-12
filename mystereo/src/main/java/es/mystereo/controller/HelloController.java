package es.mystereo.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import es.mystereo.services.HelloService;

@Controller
@RequestMapping("/hello")
public class HelloController{
	
	
	@Inject
	HelloService helloService;
 
   @RequestMapping(method = RequestMethod.GET)
   public String printHello(ModelMap model) {
      model.addAttribute("message", helloService.sayHello());
      return "hello";
   }

}