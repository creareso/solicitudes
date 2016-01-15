package com.crearesoft.iimoney.mngrequest.server.dao.factory;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;




import com.crearesoft.iimoney.mngrequest.server.dao.SolicitudCrearUsuarioDAO;

import com.crearesoft.iimoney.mngrequest.server.exception.ResourceException;


public class JPADAOFactory extends DAOFactory {

	private final Logger logger = Logger.getLogger(getClass().getName());

	/*
	 * (non-Javadoc)
	 * @see com.creare.gcm.server.dao.factory.DAOFactory#createConnection()
	 */
	@Override
	public Connection createConnection() throws ResourceException {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "Unimplemented method, JPADAOFactory.createConnection");
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see com.creare.gcm.server.dao.factory.DAOFactory#getConnection()
	 */
	@Override
	public Connection getConnection() throws ResourceException {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "Unimplemented method, JPADAOFactory.getConnection");
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see com.creare.gcm.server.dao.factory.DAOFactory#closeConnection()
	 */
	@Override
	public void closeConnection() {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "Unimplemented method, JPADAOFactory.closeConnection");
		
	}

	/*
	 * (non-Javadoc)
	 * @see com.creare.gcm.server.dao.factory.DAOFactory#setAutoCommit(boolean)
	 */
	@Override
	public void setAutoCommit(boolean commit) throws ResourceException {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "Unimplemented method, JPADAOFactory.setAutoCommit");
		
	}

	/*
	 * (non-Javadoc)
	 * @see com.creare.gcm.server.dao.factory.DAOFactory#rollback()
	 */
	@Override
	public void rollback() throws ResourceException {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "Unimplemented method, JPADAOFactory.rollback");

	}

	/*
	 * (non-Javadoc)
	 * @see com.creare.gcm.server.dao.factory.DAOFactory#save()
	 */
	@Override
	public void save() throws ResourceException {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "Unimplemented method, JPADAOFactory.save");

	}

	/*
	 * (non-Javadoc)
	 * @see com.creare.gcm.server.dao.factory.DAOFactory#getColegioDAO()
	 */
	@Override
	public SolicitudCrearUsuarioDAO getSolicitudCrearUsuarioDAO() {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "Unimplemented method, JPADAOFactory.getColegioDAO");
		return null;
	}
	/*
	 * (non-Javadoc)
	 * @see com.creare.gcm.server.dao.factory.DAOFactory#getColegioDAO()
	 */
	

}
