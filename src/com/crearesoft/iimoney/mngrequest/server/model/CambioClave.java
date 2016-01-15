package com.crearesoft.iimoney.mngrequest.server.model;

import java.util.Date;

public class CambioClave extends Solicitud {

	private Date fechacreacion;
	private Date fechaingreso;
	private Solicitud solicitud;
	
	
	
	public Solicitud getSolicitud() {
		return solicitud;
	}
	public void setSolicitud(Solicitud solicitud) {
		this.solicitud = solicitud;
	}
	public Date getFechacreacion() {
		return fechacreacion;
	}
	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}
	public Date getFechaingreso() {
		return fechaingreso;
	}
	public void setFechaingreso(Date fechaingreso) {
		this.fechaingreso = fechaingreso;
	}
	
	
	
}
