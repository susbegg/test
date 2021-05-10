package com.sus.open.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sus.open.model.Contatto;
import com.sus.open.service.ContattiService;

@Controller
public class OpenController {
	@Autowired
	private ContattiService cs;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		List<Contatto> list = cs.getAll();
		mv.addObject("listaContatti", list);
		return mv;

	}
}
