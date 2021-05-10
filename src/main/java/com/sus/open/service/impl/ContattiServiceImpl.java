package com.sus.open.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sus.open.model.Contatto;
import com.sus.open.repository.ContattiRepository;
import com.sus.open.service.ContattiService;

@Service("contattiService")
public class ContattiServiceImpl implements ContattiService{
	@Autowired
	private ContattiRepository cr;
	
	@Override
	public List<Contatto> getAll() {
		return cr.findAll();
	}

}
