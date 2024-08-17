/**
 * 
 */
package com.nc.projectjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.nc.projectjsf.entity.Empleado;
import com.nc.projectjsf.services.EmpleadoService;

/**
 * @author Nixon
 * Clase controller que se encarga de procesar la informacion para la pantalla principal.xhtml.
 *
 */

@ManagedBean
@ViewScoped

public class PrincipalController {
	/**
	 * Lista de empleados para la tabla
	 */
	private List<Empleado> empleados;
	/**
	 * Servicio con los metodos que realizan la logia de negocio de empleados
	 */
	private EmpleadoService empleadoService = new EmpleadoService();
	/**
	 * Metodo que consulta la lista de empleados
	 */
	
	/**
	 * Metodo que se encarga de inicializar la informacion de la pantalla principal.
	 */
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
		
	}
	
	public void consultarEmpleados() {
		this.empleados = this.empleadoService.consultarEmpleados();
		
	}
	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}
	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	

}
