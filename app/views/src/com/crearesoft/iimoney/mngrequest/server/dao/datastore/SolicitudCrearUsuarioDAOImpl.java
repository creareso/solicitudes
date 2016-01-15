package com.crearesoft.iimoney.mngrequest.server.dao.datastore;

import com.crearesoft.iimoney.mngrequest.server.dao.SolicitudCrearUsuarioDAO;
import com.crearesoft.iimoney.mngrequest.server.model.CrearUsuario;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class SolicitudCrearUsuarioDAOImpl implements SolicitudCrearUsuarioDAO {

	private static final String ENTITY_TYPE = CrearUsuario.class.getSimpleName();
	private DatastoreService datastoreService;
	
	@Override
	public Long CreateUser(CrearUsuario apl) {
		
		Key key = KeyFactory.createKey(ENTITY_TYPE, apl.getSolicitud().getId());
		Entity e = new Entity(key);
		datastoreService.put(convertToEntity(e, apl));
		
		return key.getId();
		
		// TODO Auto-generated method stub
		
	}

	
	private Entity convertToEntity(Entity e, CrearUsuario apl) {
		e.setProperty("id", apl.getSolicitud().getId());
		e.setProperty("tipo", apl.getSolicitud().getTipo());
		e.setProperty("nombre", apl.getSolicitud().getNombreCompleto());
		e.setProperty("documento", apl.getSolicitud().getDocumento());
		return e;
	}


	private Entity convertToEntity(Key e, CrearUsuario CreateUser) {
		Entity entity = new Entity(e);
		entity.setProperty("id", CreateUser.getSolicitud().getId());
		entity.setProperty("tipo", CreateUser.getSolicitud().getTipo());
		entity.setProperty("nombre", CreateUser.getSolicitud().getNombreCompleto());
		entity.setProperty("documento", CreateUser.getSolicitud().getDocumento());		
		
		return entity;
	}


	@Override
	public Long CreateUser(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
