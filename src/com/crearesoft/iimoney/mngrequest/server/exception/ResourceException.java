package com.crearesoft.iimoney.mngrequest.server.exception;

/**
 * Clase que encapsula las excepciones de acceso a una fuente de datos. 
 * @author JavierAlejandro
 *
 */
public class ResourceException extends Exception {

	public ResourceException() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    public ResourceException(String e) {
    	super(e);
	}

}
