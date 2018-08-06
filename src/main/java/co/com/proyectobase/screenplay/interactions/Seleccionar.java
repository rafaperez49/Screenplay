package co.com.proyectobase.screenplay.interactions;

import java.util.List;

import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

public class Seleccionar implements Interaction {

	private Target lista;
	private String opcion;
	
	public Seleccionar(Target lista, String opcion) {		
		this.lista = lista;
		this.opcion = opcion;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		List<WebElement> listObjeto = lista.resolveFor(actor).findElements(By.tagName("li"));
		for(int i=0; i < listObjeto.size(); i++){
			if (listObjeto.get(i).getText().equals(opcion)) {
				listObjeto.get(i).click();
				break;
			}			 
		}
	}
	
	public static Seleccionar laLista(Target lista, String opcion)
	{
		return new Seleccionar(lista, opcion);
	}
	
}
