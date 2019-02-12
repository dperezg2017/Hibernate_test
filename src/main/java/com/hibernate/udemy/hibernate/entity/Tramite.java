package com.hibernate.udemy.hibernate.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "tramite")
public class Tramite {


	@Id
	@GeneratedValue
	private int idTramite;

	@Column(name = "tipoTram")
	private String tipoTram;

	@Column(name = "fhcTram")
	private Date fhcTram;

	public int getIdTramite() {
		return idTramite;
	}

	public void setIdTramite(int idTramite) {
		this.idTramite = idTramite;
	}

	public String getTipoTram() {
		return tipoTram;
	}

	public void setTipoTram(String tipoTram) {
		this.tipoTram = tipoTram;
	}

	public Date getFhcTram() {
		return fhcTram;
	}

	public void setFhcTram(Date fhcTram) {
		this.fhcTram = fhcTram;
	}

	public Tramite(int idTramite, String tipoTram, Date fhcTram) {
		super();
		this.idTramite = idTramite;
		this.tipoTram = tipoTram;
		this.fhcTram = fhcTram;
	}

	public Tramite() {
		super();
	}

	@Override
	public String toString() {
		return "Tramite [idTramite=" + idTramite + ", tipoTram=" + tipoTram + ", fhcTram=" + fhcTram + "]";
	}

}
