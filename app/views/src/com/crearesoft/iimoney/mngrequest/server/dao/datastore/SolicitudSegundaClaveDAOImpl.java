package com.crearesoft.iimoney.mngrequest.server.dao.datastore;

import java.util.Date;

import com.crearesoft.iimoney.mngrequest.server.dao.SolicitudSegundaClaveDAO;
import com.crearesoft.iimoney.mngrequest.server.model.CambioClave;
import com.crearesoft.iimoney.mngrequest.server.model.IncripcionCuenta;
import com.crearesoft.iimoney.mngrequest.server.model.Solicitud;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class SolicitudSegundaClaveDAOImpl implements SolicitudSegundaClaveDAO {

	private static final String ENTITY_TYPE = CambioClave.class.getSimpleName();
	private DatastoreService datastoreService;	
	
	@Override
	public Long create2dclave(CambioClave cc) {
		Key key = KeyFactory.createKey(ENTITY_TYPE, cc.getSolicitud().getId());
		Entity e = new Entity(key);
		datastoreService.put(convertToEntity(e, cc));
		return key.getId();
	}

private Entity convertToEntity(Entity e, CambioClave cc) {
		
		e.setProperty("id", cc.getId());
		e.setProperty("fechacreacion", cc.getFechacreacion());
		e.setProperty("fechaingreso", cc.getFechacreacion());
		e.setProperty("evidente",cc.getSolicitud().getEvitente());
		e.setProperty("coperativa", cc.getSolicitud().getCoperativa());
		e.setProperty("fehcaevidente", cc.getSolicitud().getFehcaevidente());
		e.setProperty("fechacoperativa", cc.getSolicitud().getFechacoperativa());
		e.setProperty("cantidapreguntas", cc.getSolicitud().getCantidapreguntas());
		
		return e;
	}
	
}
