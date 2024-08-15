package com.nc.projectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * 
 * @author Nixon Clase que permite controlar el funcionamiento con la pantalla
 *         de login.xhtml.
 */
@ManagedBean

public class LoginController {

	private String usuario;
	/**
	 * Usuario que ingresan en el login.
	 */
	private String password;

	/**
	 * contraseña ingresada en el login.
	 */

	public void ingresar() {
		System.out.println("Usuario: " + usuario);

	}

	public String getUsuario() {
		return usuario;
	}

	/**
	 * 
	 * Metodo que permite ingresar a la pantalla principal del proyecto
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;

		if (usuario.equals("Nixon") && password.equals("12345")) {
			try {
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario",
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "La página no existe!!!", ""));
				e.printStackTrace();
			}
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y/o contraseña incorrectos", ""));

		}
	}

	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}
}
