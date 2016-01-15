package com.crearesoft.iimoney.mngrequest.server.model;

import java.util.Date;

public class Solicitud {
	private String tipo;		
	private String usuario;		
	private String telefono;		
	private String celular;		
	private Date fechacreacion;		
	private String contrasenia;		
	private String nombreCompleto;
	private String documento;
	private String id;
	
	//Formularios
	private Boolean evitente;
	private Boolean coperativa;
	private Date fehcaevidente;
	private Date fechacoperativa;
	private int cantidapreguntas;
	
	
	
	
	
	public Boolean getEvitente() {
		return evitente;
	}
	public void setEvitente(Boolean evitente) {
		this.evitente = evitente;
	}
	public Boolean getCoperativa() {
		return coperativa;
	}
	public void setCoperativa(Boolean coperativa) {
		this.coperativa = coperativa;
	}
	public Date getFehcaevidente() {
		return fehcaevidente;
	}
	public void setFehcaevidente(Date fehcaevidente) {
		this.fehcaevidente = fehcaevidente;
	}
	public Date getFechacoperativa() {
		return fechacoperativa;
	}
	public void setFechacoperativa(Date fechacoperativa) {
		this.fechacoperativa = fechacoperativa;
	}
	public int getCantidapreguntas() {
		return cantidapreguntas;
	}
	public void setCantidapreguntas(int cantidapreguntas) {
		this.cantidapreguntas = cantidapreguntas;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public Date getFechacreacion() {
		return fechacreacion;
	}
	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	
	
	
}
