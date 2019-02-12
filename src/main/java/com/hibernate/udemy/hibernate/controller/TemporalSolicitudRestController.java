package com.hibernate.udemy.hibernate.controller;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.udemy.hibernate.entity.TemporalSolicitudRest;
import com.hibernate.udemy.hibernate.repository.TemporalSolicitudRestRepository;

@RestController
@RequestMapping("/hibernate")
public class TemporalSolicitudRestController {
	
	private static final Log LOG = LogFactory.getLog(TemporalSolicitudRestController.class);
	
	@Autowired
	private TemporalSolicitudRestRepository repository ;
	
	
	@PostMapping("/crear")
	public TemporalSolicitudRest save(@RequestBody TemporalSolicitudRest temporalSolicitudRest) {
		TemporalSolicitudRest actualTemporalSolicitudRest = new TemporalSolicitudRest();
		actualTemporalSolicitudRest.setNombreRQ(temporalSolicitudRest.getNombreRQ());
		return repository.save(actualTemporalSolicitudRest);
	}
	
	
	
	
	@GetMapping("/consultar/{nombreRQ}")
	public String findByNombreRQs(@PathVariable String nombreRQ) {
		LOG.info("CONSULTA: "+repository.findByNombreRQ(nombreRQ));
		
		String mensaje=(repository.findByNombreRQ(nombreRQ)!=null)?"Existe":"No Existe";
		
		
		return mensaje;
	}
	@DeleteMapping("/eliminar/{nombreRQ}")
	public void deleteByNombre(@PathVariable String nombreRQ) {
		
		repository.deleteByNombre(nombreRQ);
	}
	
	
	

}
