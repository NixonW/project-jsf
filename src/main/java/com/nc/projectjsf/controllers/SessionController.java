/**
 * 
 */
package com.nc.projectjsf.controllers;

import javax.faces.bean.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;

import com.nc.projectjsf.dto.UsuarioDTO;

/**
 * @author Nixon
 * Clase que se encarga de mantener la informacion del usuario que ingresa al aplicativo en sesion
 *
 */

@ManagedBean
@SessionScoped
public class SessionController {
	
	private UsuarioDTO usuarioDTO;

	/**
	 * Inicializa la sesion del usuario
	 */
	@PostConstruct
	public void init() {
		System.out.println("Cargando informacion de usuario en la sesion");
	}
	
	/**
	 * @return the usuarioDTO
	 */
	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	/**
	 * @param usuarioDTO the usuarioDTO to set
	 */
	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
	
	
	
	
	
	
	
	

}
