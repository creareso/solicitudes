package com.crearesoft.iimoney.mngrequest.server.dao.factory;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.crearesoft.iimoney.mngrequest.server.dao.SolicitudCrearUsuarioDAO;

import com.crearesoft.iimoney.mngrequest.server.dao.datastore.SolicitudCrearUsuarioDAOImpl;

import com.crearesoft.iimoney.mngrequest.server.exception.ResourceException;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Transaction;
import com.google.appengine.api.datastore.TransactionOptions;

public class DataStoreDAOFactory extends DAOFactory {

	private final Logger logger = Logger.getLogger(getClass().getName());
	
	private DatastoreService datastoreService;
	
	private Transaction transaction;
		
	public static final int MULTICAST_SIZE = 1000;
	
	public static final FetchOptions DEFAULT_FETCH_OPTIONS = FetchOptions.Builder
			.withPrefetchSize(MULTICAST_SIZE).chunkSize(MULTICAST_SIZE);
	
	public DataStoreDAOFactory() throws ResourceException {
		super();
		// TODO Auto-generated constructor stub
		createConnection();
	}

	/*
	 * (non-Javadoc)
	 * @see com.creare.gcm.server.dao.factory.DAOFactory#createConnection()
	 */
	@Override
	public DatastoreService createConnection() throws ResourceException {
		// TODO Auto-generated method stub
		datastoreService = DatastoreServiceFactory.getDatastoreService();
		return datastoreService;
	}

	/*
	 * (non-Javadoc)
	 * @see com.creare.gcm.server.dao.factory.DAOFactory#getConnection()
	 */
	@Override
	public DatastoreService getConnection() throws ResourceException {
		try {
			if (datastoreService == null)
				return createConnection();
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error consultando estado del \"datastore\": " + e.getMessage());
			throw new ResourceException ("Imposible obtener conexion al datastore");
		} 
		return datastoreService;

	}

	/*
	 * (non-Javadoc)
	 * @see com.creare.gcm.server.dao.factory.DAOFactory#closeConnection()
	 */
	@Override
	public void closeConnection() {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "Unimplemented method, DataStoreDAOFactory.closeConnection");
		
	}

	/*
	 * (non-Javadoc)
	 * @see com.creare.gcm.server.dao.factory.DAOFactory#setAutoCommit(boolean)
	 */
	@Override
	public void setAutoCommit(boolean commit) throws ResourceException {
		// TODO Auto-generated method stub
		//logger.log(Level.INFO, "Unimplemented method, DataStoreDAOFactory.setAutoCommit");
		if (!commit) {
			TransactionOptions options = TransactionOptions.Builder.withXG(true);
			transaction = datastoreService.beginTransaction(options);
			
		}

	}
	/*
	 * (non-Javadoc)
	 * @see com.creare.gcm.server.dao.factory.DAOFactory#setAutoCommit(boolean)
	 */
	public Transaction getTrx()  {
		// TODO Auto-generated method stub
		//logger.log(Level.INFO, "Unimplemented method, DataStoreDAOFactory.setAutoCommit");
		return transaction;

	}
	/*
	 * (non-Javadoc)
	 * @see com.creare.gcm.server.dao.factory.DAOFactory#rollback()
	 */
	@Override
	public void rollback() throws ResourceException {
		// TODO Auto-generated method stub
		if (transaction != null && transaction.isActive()) {
			transaction.rollback();
		}
	}

	/*
	 * (non-Javadoc)
	 * @see com.creare.gcm.server.dao.factory.DAOFactory#save()
	 */
	@Override
	public void save() throws ResourceException {
		// TODO Auto-generated method stub
		if (transaction != null && transaction.isActive()) {
			transaction.commit();
		}
	}

	/*
	 * (non-Javadoc)
	 * @see com.creare.gcm.server.dao.factory.DAOFactory#getColegioDAO()
	 */
	@Override
	public SolicitudCrearUsuarioDAO getSolicitudCrearUsuarioDAO() {
		// TODO Auto-generated method stub
		return new SolicitudCrearUsuarioDAOImpl();
	}


	

	

}
