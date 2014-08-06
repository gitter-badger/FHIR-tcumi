package edu.tcu.gaduo.springmvc.controller;

import java.io.InputStream;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.tcu.gaduo.springmvc.view_model.Document;



@Controller
@RequestMapping("/")
public class WelcomeController {

	public static Logger logger = Logger.getLogger(WelcomeController.class);
	
	public WelcomeController(){
	}
	
	
	@RequestMapping(value = {"",  "/", "/index/", "/index", "/Index/", "/Index"}, method = RequestMethod.GET)
	public String index(Model model){

		return "welcome/index";
	}
	
    
}
