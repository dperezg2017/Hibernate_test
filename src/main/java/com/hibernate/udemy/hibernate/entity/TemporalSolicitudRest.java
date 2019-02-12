package com.hibernate.udemy.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "TemporalSolicitudRest")
public class TemporalSolicitudRest {


	@Id
	@GeneratedValue
	private int id;

	@Column(name = "nombreRQ",unique = true, length=50)
	private String nombreRQ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreRQ() {
		return nombreRQ;
	}

	public void setNombreRQ(String nombreRQ) {
		this.nombreRQ = nombreRQ;
	}



}
