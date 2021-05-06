package com.sus.open.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sus.open.model.Contatto;

@RestController
public class OpenRestController {

		@RequestMapping("test")
		public List<Contatto> serviceTest(){
			List<Contatto> lista  = new ArrayList<Contatto>();
			lista.add(new Contatto("mario", "rossi","ma"));
			lista.add(new Contatto("ww", "rossi","rrma"));
			lista.add(new Contatto("mawwrio", "rorrssi","myya"));
			return lista;
		}
}
