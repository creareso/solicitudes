package com.crearesoft.iimoney.mngrequest.server.dao.factory;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;




import com.crearesoft.iimoney.mngrequest.server.dao.SolicitudCrearUsuarioDAO;

import com.crearesoft.iimoney.mngrequest.server.exception.ResourceException;

public class SQLDAOFactory extends DAOFactory {

	private final Logger logger = Logger.getLogger(getClass().getName());

	/*
	 * (non-Javadoc)
	 * @see com.creare.gcm.server.dao.factory.DAOFactory#createConnection()
	 */
	@Override
	public Connection createConnection() throws ResourceException {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "Unimplemented method, SQLDAOFactory.createConnection");
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see com.creare.gcm.server.dao.factory.DAOFactory#getConnection()
	 */
	@Override
	public Connection getConnection() throws ResourceException {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "Unimplemented method, SQLDAOFactory.getConnection");
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see com.creare.gcm.server.dao.factory.DAOFactory#closeConnection()
	 */
	@Override
	public void closeConnection() {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "Unimplemented method, SQLDAOFactory.closeConnection");

	}

	/*
	 * (non-Javadoc)
	 * @see com.creare.gcm.server.dao.factory.DAOFactory#setAutoCommit(boolean)
	 */
	@Override
	public void setAutoCommit(boolean commit) throws ResourceException {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "Unimplemented method, SQLDAOFactory.setAutoCommit");

	}

	/*
	 * (non-Javadoc)
	 * @see com.creare.gcm.server.dao.factory.DAOFactory#rollback()
	 */
	@Override
	public void rollback() throws ResourceException {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "Unimplemented method, SQLDAOFactory.rollback");

	}

	/*
	 * (non-Javadoc)
	 * @see com.creare.gcm.server.dao.factory.DAOFactory#save()
	 */
	@Override
	public void save() throws ResourceException {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "Unimplemented method, SQLDAOFactory.save");

	}

	/*
	 * (non-Javadoc)
	 * @see com.creare.gcm.server.dao.factory.DAOFactory#getColegioDAO()
	 */
	@Override
	public SolicitudCrearUsuarioDAO getSolicitudCrearUsuarioDAO() {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "Unimplemented method, SQLDAOFactory.getColegioDAO");
		return null;
	}
	/*
	 * (non-Javadoc)
	 * @see com.creare.gcm.server.dao.factory.DAOFactory#getColegioDAO()
	 */
	


}
