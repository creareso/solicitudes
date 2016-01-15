package com.crearesoft.iimoney.mngrequest.server.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
















import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.crearesoft.iimoney.mngrequest.server.model.CrearUsuario;
import com.crearesoft.iimoney.mngrequest.server.model.Solicitud;
import com.crearesoft.iimoney.mngrequest.server.dao.SolicitudCrearUsuarioDAO;
import com.crearesoft.iimoney.mngrequest.server.dao.datastore.SolicitudCrearUsuarioDAOImpl;
import com.crearesoft.iimoney.mngrequest.server.dao.factory.*;
import com.crearesoft.iimoney.mngrequest.server.exception.ListErrorMessages;
import com.crearesoft.iimoney.mngrequest.server.exception.ResourceException;
import com.google.appengine.api.datastore.EmbeddedEntity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

public class SolicitudCrearUsuarioServlet extends BaseServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static final Integer STORE_TYPE = DAOFactory.DATASTORE;
	static final String ATTRIBUTE_TIPO_SOLICITUD = "tipo";
	static final String ATTRIBUTE_USUARIO ="usuario";
	static final String ATTRIBUTE_TELEFONO ="telefono";	
	static final String ATTRIBUTE_CELULAR ="celular";	
	static final String ATTRIBUTE_FECHA_CREACION = "fechacreacion";
	static final String ATTRIBUTE_CONTRASENIA = "contrasenia";
	static final String ATTRIBUTE_NOMBRE_COMPLETO ="nombreCompleto";
	static final String ATTRIBUTE_DOCUMENTO = "documento";
	static final String	ATTRIBUTE_ID="id";
	static final String ATTRIBUTE_TIPO_DOCUMENTO = "tipoDocumento";
	static final String ATTRIBUTE_TIPO_PRODUCTO ="tipoProducto";
	static final String ATTRIBUTE_NUMERO_PRODUCTO ="numProducto";
	static final String ATTRIBUTE_SOLICITUD = "solicitud";
	static final String ATTRIBUTE_DIRECCION = "direccion";
	
	
	  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		      throws IOException {
		    resp.setContentType("text/html");
		    PrintWriter out = resp.getWriter();
			try{
				  UserService userService = UserServiceFactory.getUserService();
				  User user = userService.getCurrentUser();
				  resp.sendRedirect(userService.createLogoutURL("/index.html", user.getAuthDomain()));
				  
			}catch(Exception ex){
				logger.log(Level.SEVERE, "Error al traer logout del usuario.",ex);
				resp.sendRedirect("/index.html");
			}
		  }

		  @Override
		  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		      throws IOException {
			  resp.setContentType("application/json");
				PrintWriter out = resp.getWriter();
				String id = "";
				CrearUsuario Cu = new CrearUsuario();
				try {
					logger.log(Level.INFO, req.getParameter(ATTRIBUTE_ID));
					// Parses the JSON object attribute
					JSONObject jDatos = JSONObject.fromObject(req.getParameter(ATTRIBUTE_ID));
					JSONArray jSuertes = jDatos.getJSONArray(ATTRIBUTE_ID);
					String sFarm = jDatos.getString(ATTRIBUTE_ID);
					for (int i = 0; i < jSuertes.size(); i++) {
					CrearUsuario o = new CrearUsuario();
					}
					Cu.setId(sFarm);
					// Datos del eval;

				} catch (Exception ex) {
					logger.log(Level.SEVERE,
							"Error capturando los parametros de entrada.", ex);
					out.print(ListErrorMessages.ERR002.addDetail(
							"Error capturando los parametros de entrada, Error: "
									+ ex.getMessage()).getJsonMessage());
					resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
					return;

				}

				DAOFactory factory;
				try {
					factory = DAOFactory.getDAOFactory(STORE_TYPE);
				} catch (ResourceException ex) {
					// TODO Auto-generated catch block
					logger.log(Level.SEVERE, "Error creando la fabrica.", ex);
					out.print(ListErrorMessages.ERR001.addDetail(
							"Error creando la fabrica, Error: " + ex.getMessage())
							.getJsonMessage());
					resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
					return;
				}
				SolicitudCrearUsuarioDAO scuDAO = factory.getSolicitudCrearUsuarioDAO();
				
				Long ffinded ;
				ffinded = scuDAO.CreateUser(Cu.getId());

									
					

					// Devolviendo código de respuesta exitoso
					out.print(ListErrorMessages.S000.getJsonMessage());
					resp.setStatus(HttpServletResponse.SC_OK);

				
					factory.closeConnection();
			
		  }

	
}
