/**
 * 
 */
package com.nc.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import com.nc.projectjsf.entity.Empleado;

/**
 * @author Nixon
 * Clase que permite realizar la logica de negocio para empleados.
 *
 */
public class EmpleadoService {
	/**
	 * Metodo que permite consultar la lista de empleados de empresas de TI.
	 * @return {link Empleado} lista de empleados
	 */
	public List<Empleado> consultarEmpleados(){
		
		//Generar la lista de empleados a consultar.
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		
		empleadoIBM.setNombre("Nixon");
		empleadoIBM.setPrimerApellido("Castillo");
		empleadoIBM.setSegundoApellido("Jimenez");
		empleadoIBM.setPuesto("Senior Developer Java");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombre("Emilio");
		empleadoMicrosoft.setPrimerApellido("Castillo");
		empleadoMicrosoft.setSegundoApellido("Merino");
		empleadoMicrosoft.setPuesto("Jr. Developer Java");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombre("Dania");
		empleadoApple.setPrimerApellido("Merino");
		empleadoApple.setSegundoApellido("Barahona");
		empleadoApple.setPuesto("QA");
		empleadoApple.setEstatus(false);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);

		return empleados;
		
	}

}
