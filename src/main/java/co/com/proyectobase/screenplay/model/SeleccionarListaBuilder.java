package co.com.proyectobase.screenplay.model;

import co.com.proyectobase.screenplay.interactions.Seleccion;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarListaBuilder {
	
	private Target lista;
	
	public SeleccionarListaBuilder(Target lista) {
		this.lista=lista;
	}

	public Seleccion laOpcion(String opcion)
	{
		return new Seleccion(lista, opcion);
		
	}
	
	

}
