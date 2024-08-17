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

		Empleado empleadoNetflix = new Empleado();
		Empleado empleadoAmazon = new Empleado();
		Empleado empleadoHP = new Empleado();

		Empleado empleadoOracle = new Empleado();
		Empleado empleadoDeloitte = new Empleado();
		Empleado empleadoDisney = new Empleado();

		
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
		
		empleadoNetflix.setNombre("Maryori");
		empleadoNetflix.setPrimerApellido("Gomezo");
		empleadoNetflix.setSegundoApellido("Valdez");
		empleadoNetflix.setPuesto("QA");
		empleadoNetflix.setEstatus(true);

		empleadoAmazon.setNombre("Idalia");
		empleadoAmazon.setPrimerApellido("Vasques");
		empleadoAmazon.setSegundoApellido("Barahona");
		empleadoAmazon.setPuesto("QA");
		empleadoAmazon.setEstatus(true);

		empleadoHP.setNombre("Jorge");
		empleadoHP.setPrimerApellido("Trujillo");
		empleadoHP.setSegundoApellido("Hernandez");
		empleadoHP.setPuesto("Java Developer");
		empleadoHP.setEstatus(true);
		
		empleadoOracle.setNombre("Miguel");
		empleadoOracle.setPrimerApellido("Chaparro");
		empleadoOracle.setSegundoApellido("Calvache");
		empleadoOracle.setPuesto("BI");
		empleadoOracle.setEstatus(true);
		
		empleadoDeloitte.setNombre("Ana Luisa");
		empleadoDeloitte.setPrimerApellido("Pombo");
		empleadoDeloitte.setSegundoApellido("Abondano");
		empleadoDeloitte.setPuesto("CEO");
		empleadoDeloitte.setEstatus(true);

		empleadoDisney.setNombre("Roberto");
		empleadoDisney.setPrimerApellido("Linares");
		empleadoDisney.setSegundoApellido("Cangrejo");
		empleadoDisney.setPuesto("CEO");
		empleadoDisney.setEstatus(true);

		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);

		empleados.add(empleadoNetflix);
		empleados.add(empleadoAmazon);
		empleados.add(empleadoHP);

		empleados.add(empleadoOracle);
		empleados.add(empleadoDeloitte);
		empleados.add(empleadoDisney);
		
		return empleados;
		
	}

}
