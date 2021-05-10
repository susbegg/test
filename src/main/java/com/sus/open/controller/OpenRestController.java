package com.sus.open.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sus.open.model.Contatto;
import com.sus.open.service.ContattiService;

@RestController
@RequestMapping("/api")
public class OpenRestController {
	@Autowired
	private ContattiService cs;

		@RequestMapping("/contatti")
		public List<Contatto> serviceTest(){
			return cs.getAll();
		}
}
