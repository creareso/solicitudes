package com.crearesoft.iimoney.mngrequest.server.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.crearesoft.iimoney.mngrequest.server.dao.SolicitudCrearUsuarioDAO;
import com.crearesoft.iimoney.mngrequest.server.dao.factory.DAOFactory;
import com.crearesoft.iimoney.mngrequest.server.exception.ListErrorMessages;
import com.crearesoft.iimoney.mngrequest.server.exception.ResourceException;
import com.crearesoft.iimoney.mngrequest.server.model.CrearUsuario;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

public class SolicitudUsuarioServlet extends BaseServlet {

	static final String USUARIO ="usuario";
	
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
			  
			  
			  PrintWriter out = resp.getWriter();
				String id = "";
				CrearUsuario Cu = new CrearUsuario();
				try {
					logger.log(Level.INFO, req.getParameter(USUARIO));
					// Parses the JSON object attribute
					JSONObject jDatos = JSONObject.fromObject(req.getParameter(USUARIO));
					JSONArray jSuertes = jDatos.getJSONArray(USUARIO);
					String sFarm = jDatos.getString(USUARIO);
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
			
		   
			  
		    doGet(req, resp);
		  }

	
}
