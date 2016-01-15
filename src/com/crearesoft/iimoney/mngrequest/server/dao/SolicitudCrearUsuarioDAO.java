package com.crearesoft.iimoney.mngrequest.server.dao;

import com.crearesoft.iimoney.mngrequest.server.model.CrearUsuario;

public interface SolicitudCrearUsuarioDAO {
	
	public Long CreateUser(String string);

	Long CreateUser(CrearUsuario apl);
	
	
}
