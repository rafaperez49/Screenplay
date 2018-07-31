package co.com.proyectobase.screenplay.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.proyectobase.screenplay.ui.GrupoBancolombiaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;



public class Ingresar implements Task{

	private GrupoBancolombiaPage grupoBancolombiaPage;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Open.browserOn(grupoBancolombiaPage));
	}

	public static Ingresar LaPaginaDelGB() {
		
		return instrumented(Ingresar.class);
		
	}

}
