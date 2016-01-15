package com.crearesoft.iimoney.mngrequest.server.exception;



public class ListErrorMessages {
	// Mensajes en general
	public static final MessageResponse S000 = new MessageResponse("000","Procesado satisfactoriamente");
	
	public static final MessageResponse S001 = new MessageResponse("001","El reporte se esta generando en breve y se enviar�� al correo electronico asignado");
	
	public static final MessageResponse ERR001 = new MessageResponse("E001","Error al crear la fabrica de conexion");
	public static final MessageResponse ERR002 = new MessageResponse("E002","Error al capturando los parametros de entrada");
	public static final MessageResponse MSG001 = new MessageResponse("M001","No existe un parametro valido de entrada");
	public static final MessageResponse GEN994 = new MessageResponse("GEN994","El usuario autenticado no tiene permisos para ejecutar esta accion");
	public static final MessageResponse GEN999 = new MessageResponse("999","Metodo no implementado");
	public static final MessageResponse GEN998 = new MessageResponse("998","No");
	
	// Errores de Censos
	public static final MessageResponse CE001 = new MessageResponse("CE001","Error al crear un censo");
	public static final MessageResponse CE002 = new MessageResponse("CE002","Error al actualizar un censo");
	public static final MessageResponse CE003 = new MessageResponse("CE003","Error al eliminar un censo");
	public static final MessageResponse CE004 = new MessageResponse("CE004","Error al consultar un censo");
	public static final MessageResponse CE009 = new MessageResponse("CE009","Debe seleccionar un censo valido");
	public static final MessageResponse CE005 = new MessageResponse("CE005","Error al consultar los censos");
	public static final MessageResponse CE006 = new MessageResponse("CE006","No existen el censo, no existen ese valor");
	public static final MessageResponse CE008 = new MessageResponse("CE008","No existen muestras para esa consulta especifica");
	//Errores registro
	public static final MessageResponse CMP001 = new MessageResponse("CMP001","Los datos de la compañia son obligatorios.");
	
	//Errores User
	public static final MessageResponse USR001 = new MessageResponse("USR001","El usuario no se encuentra en la base de datos.");
	public static final MessageResponse USR002 = new MessageResponse("USR002","El usuario no se encuentra habilitado a��n.");
	public static final MessageResponse USR003 = new MessageResponse("USR003","Error al traer informacion de usuario autenticado.");
	public static final MessageResponse USR004 = new MessageResponse("USR004","Error al traer informacion de la empresa registrada del usuario.");
		
	

}

