package com.crearesoft.iimoney.mngrequest.server.model;

public class IncripcionCuenta extends Solicitud {
	
	private String cuentaDestino;
	private String clienteDestino;
	private String entidadDestino;
	private Solicitud solicitud;
	
	
	
	
	public Solicitud getSolicitud() {
		return solicitud;
	}
	public void setSolicitud(Solicitud solicitud) {
		this.solicitud = solicitud;
	}
	public String getCuentaDestino() {
		return cuentaDestino;
	}
	public void setCuentaDestino(String cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}
	public String getClienteDestino() {
		return clienteDestino;
	}
	public void setClienteDestino(String clienteDestino) {
		this.clienteDestino = clienteDestino;
	}
	public String getEntidadDestino() {
		return entidadDestino;
	}
	public void setEntidadDestino(String entidadDestino) {
		this.entidadDestino = entidadDestino;
	}
	
	

}
