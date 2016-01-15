package com.crearesoft.iimoney.mngrequest.server.model;

import java.util.Date;

public class CrearUsuario extends Solicitud  {

	
	private String tipoDocumento;
	private String tipoProducto;
	private String numProducto;
	private Solicitud solicitud;	
	private String direccion;

	
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Solicitud getSolicitud() {
		return solicitud;
	}
	public void setSolicitud(Solicitud solicitud) {
		this.solicitud = solicitud;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	

	public String getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	public String getNumProducto() {
		return numProducto;
	}
	public void setNumProducto(String numProducto) {
		this.numProducto = numProducto;
	}
	
	
	
	
	
}
