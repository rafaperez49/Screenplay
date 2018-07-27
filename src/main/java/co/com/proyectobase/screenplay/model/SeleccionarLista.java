package co.com.proyectobase.screenplay.model;

import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarLista {
	
	public static SeleccionarListaBuilder desde(Target lista)
	{
		return new SeleccionarListaBuilder(lista);
		
	}

}
