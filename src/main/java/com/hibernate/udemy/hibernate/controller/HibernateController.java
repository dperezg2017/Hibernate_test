package com.hibernate.udemy.hibernate.controller;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.udemy.hibernate.entity.Tramite;
import com.hibernate.udemy.hibernate.repository.HibernateRepository;

@RestController
@RequestMapping("/hibernate")
public class HibernateController {
	
	private static final Log LOG = LogFactory.getLog(HibernateController.class);
	
	@Autowired
	private HibernateRepository hibernateRepository;
	
	
	@PostMapping("/tramites")
	public Tramite save(@RequestBody Tramite tramite) {
		Tramite ActualTramite = new Tramite();
		ActualTramite.setFhcTram(new Date());
		ActualTramite.setTipoTram(tramite.getTipoTram());
		return hibernateRepository.save(ActualTramite);
	}
	
	@GetMapping("/consultaTramite/{tipoTram}")
	public String findByTipoTramite(@PathVariable String tipoTram) {
	//	LOG.info("CONSULTA: "+hibernateRepository.findByTipoTram(tipoTram));
		return hibernateRepository.findByTipoTram(tipoTram);
	}

}
