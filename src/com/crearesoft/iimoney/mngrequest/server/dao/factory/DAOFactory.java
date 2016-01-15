
package com.crearesoft.iimoney.mngrequest.server.dao.factory;

import com.crearesoft.iimoney.mngrequest.server.dao.SolicitudCrearUsuarioDAO;
import com.crearesoft.iimoney.mngrequest.server.exception.ResourceException;
import com.crearesoft.iimoney.mngrequest.server.dao.factory.DataStoreDAOFactory;
import com.google.appengine.api.datastore.Transaction;

public abstract class DAOFactory {

	public static final int DATASTORE = 1;
	public static final int SQL = 2;
	public static final int JPA = 3;

	/**
	 * Metodo encargado de instanciar y devolver la implementacion del DAOFactory deseado
	 * @param whichFactory
	 * @return DAOFactory
	 * @throws ResourceException 
	 */
	public static DAOFactory getDAOFactory(int whichFactory) throws ResourceException {
		switch (whichFactory) {
		case DATASTORE:
			return new DataStoreDAOFactory();
		case SQL:
			return new SQLDAOFactory();
		case JPA:
			return new JPADAOFactory();
		default:
			return null;
		}
    }
    
	/**
	 * Metodo que realiza b������������������squeda de datasource en JNDI y obtiene conexion del pool
	 * @return the object connection
	 * @throws ResourceException
	 */
	public abstract Object createConnection() throws ResourceException;
    
	/**
	 * Metodo de consulta de estdo de conexion, si est������������������ en null o se encuentra cerrada invoca a createConnection
	 * obteniendo una nueva conexion del pool
	 * @return the object connection
	 * @throws ResourceException 
	 */
	public abstract Object getConnection() throws ResourceException;

	/**
	 * Metodo que devuelve conexion al pool
	 */
	public abstract void closeConnection();
    
	/**
     * Metodo encargado de configurar transaccionalidad de la conexion
     * @param commit, boolean.
     * @throws ResourceException 
     */
	public abstract void setAutoCommit(boolean commit) throws ResourceException;

	/**
	 * Metodo encargado de deshacer cambios realizados en base de datos con la conexion utilizada.
	 * Para poder utilizar este m������������������todo, previamente se debe haber configurado el setAutoCommit en false.
     * @throws ResourceException
	 */
    public abstract void rollback() throws ResourceException;
    
	/**
	 * Metodo encargado de salvar cambios, (hacer commit) en base de datos.
     * Para poder utilizar este m������������������todo, previamente se debe haber configurado el setAutoCommit en false.
     * @throws ResourceException
	 */
	public abstract void save() throws ResourceException;

	public SolicitudCrearUsuarioDAO getSolicitudCrearUsuarioDAO() {
		// TODO Auto-generated method stub
		return null;
	}
    
	/**
	 * Obtiene la implementaci������������������n de la interfaz @ColegioDAO
	 * @return @ColegioDAO
	 */
	


	
	

	

}
