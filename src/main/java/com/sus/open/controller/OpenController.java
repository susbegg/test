package com.sus.open.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OpenController {
	@RequestMapping(value = "/", method = RequestMethod.GET) 
		public ModelAndView homePage() {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("home");
			return mv;
		
	}
}
