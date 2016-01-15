package com.crearesoft.iimoney.mngrequest.server.dao.datastore;

import java.util.Date;

import com.crearesoft.iimoney.mngrequest.server.dao.SolicitudInscribirCuentaDAO;
import com.crearesoft.iimoney.mngrequest.server.model.CrearUsuario;
import com.crearesoft.iimoney.mngrequest.server.model.IncripcionCuenta;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class SolicitudInscribirCuentaDAOImpl implements
		SolicitudInscribirCuentaDAO {
	
	private static final String ENTITY_TYPE = IncripcionCuenta.class.getSimpleName();
	private DatastoreService datastoreService;	

	@Override
	public Long InscribirUser(IncripcionCuenta InCue) {
		Key key = KeyFactory.createKey(ENTITY_TYPE, InCue.getSolicitud().getId());
		Entity e = new Entity(key);
		datastoreService.put(convertToEntity(e, InCue));
		
		return key.getId();
	}
	
	private Entity convertToEntity(Entity e, IncripcionCuenta inCue) {
		
		e.setProperty("id", inCue.getId());		
		e.setProperty("cuentaDestino", inCue.getCuentaDestino());
		e.setProperty("clienteDestino", inCue.getClienteDestino());
		e.setProperty("entidadDestino", inCue.getEntidadDestino());
		e.setProperty("evidente",inCue.getSolicitud().getEvitente());
		e.setProperty("coperativa", inCue.getSolicitud().getCoperativa());
		e.setProperty("fehcaevidente", inCue.getSolicitud().getFehcaevidente());
		e.setProperty("fechacoperativa", inCue.getSolicitud().getFechacoperativa());
		e.setProperty("cantidapreguntas", inCue.getSolicitud().getCantidapreguntas());
		
		return e;
	}

}
