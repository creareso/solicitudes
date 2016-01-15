package com.crearesoft.iimoney.mngrequest.server.dao.datastore;

import com.crearesoft.iimoney.mngrequest.server.dao.LoginDAO;
import com.crearesoft.iimoney.mngrequest.server.model.CrearUsuario;
import com.crearesoft.iimoney.mngrequest.server.model.Login;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class LoginDAOImpl implements LoginDAO {

	
	private static final String ENTITY_TYPE = Login.class.getSimpleName();
	private DatastoreService datastoreService;
	
	public Long StarSecction(Login lg) {


		Key key = KeyFactory.createKey(ENTITY_TYPE, lg.getUser());
		Entity e = new Entity(key);
		datastoreService.put(convertToEntity(e, lg));
		
		return key.getId();
		
		
	}


	private Entity convertToEntity(Entity e, Login apl) {
		e.setProperty("usuario", apl.getUser());
		e.setProperty("tipo", apl.getPass());
		
		return e;
	}


	private Entity convertToEntity(Key e, Login log) {
		Entity entity = new Entity(e);
		entity.setProperty("usuario", log.getUser());
		entity.setProperty("tipo", log.getPass());
			
		
		return entity;
	}

	
	
}
