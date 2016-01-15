package com.crearesoft.iimoney.mngrequest.server.server;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.crearesoft.iimoney.mngrequest.server.dao.factory.DAOFactory;
import com.crearesoft.iimoney.mngrequest.server.exception.ResourceException;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

public abstract class BaseServlet extends HttpServlet {

	// change to true to allow GET calls
	static final boolean DEBUG = true;
	static final Integer STORE_TYPE = DAOFactory.DATASTORE;

	/**
	 * Parametro por defecto del tipo de canal Autorized Mail.
	 */
	private static String[] AUTHORIZED_MAIL = null;

	protected final Logger logger = Logger.getLogger(getClass().getName());
	private SolicitudCrearUsuarioServlet uDao;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		if (DEBUG) {
			doPost(req, resp);
		} else {
			super.doGet(req, resp);
		}
	}

	protected String getParameter(HttpServletRequest req, String parameter)
			throws ServletException {
		String value = req.getParameter(parameter);
		if (isEmptyOrNull(value)) {
			if (DEBUG) {
				StringBuilder parameters = new StringBuilder();
				@SuppressWarnings("unchecked")
				Enumeration<String> names = req.getParameterNames();
				while (names.hasMoreElements()) {
					String name = names.nextElement();
					String param = req.getParameter(name);
					parameters.append(name).append("=").append(param)
							.append("\n");
				}
				logger.fine("parameters: " + parameters);
			}
			throw new ServletException("Parameter " + parameter + " not found");
		}
		return value.trim();
	}

	protected String getParameter(HttpServletRequest req, String parameter,
			String defaultValue) {
		String value = req.getParameter(parameter);
		if (isEmptyOrNull(value)) {
			value = defaultValue;
		}
		return value.trim();
	}

	protected void setSuccess(HttpServletResponse resp) {
		setSuccess(resp, 0);
	}

	protected void setSuccess(HttpServletResponse resp, int size) {
		resp.setStatus(HttpServletResponse.SC_OK);
		resp.setContentType("text/plain");
		resp.setContentLength(size);
	}

	protected boolean isEmptyOrNull(String value) {
		return value == null || value.trim().length() == 0;
	}

	public boolean doValidationAuth(HttpServletRequest req,
			HttpServletResponse resp, String action) {
		try {
			UserService userService = UserServiceFactory.getUserService();
			User user = userService.getCurrentUser();

			if (null == user) {
				return false;
			}
			if (AUTHORIZED_MAIL == null){
				DAOFactory factory;
				
				
				
			}
			for (String s : AUTHORIZED_MAIL) {
				if (s.equalsIgnoreCase(user.getEmail())) {
					return true;
				}
			}
			return false;

		} catch (Exception ex) {
			logger.log(Level.SEVERE, "Error al traer los datos del usuario.",
					ex);
			return false;
		}

	}
	
}
