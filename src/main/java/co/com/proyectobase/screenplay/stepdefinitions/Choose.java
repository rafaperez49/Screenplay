package co.com.proyectobase.screenplay.stepdefinitions;

import aj.org.objectweb.asm.Type;
import co.com.proyectobase.screenplay.ui.VivaColombiaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Choose implements Task{

	
	private String origen;
	private String destino;
	
	
	
	public Choose(String origen, String destino) {
		
		this.origen = origen;
		this.destino = destino;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(VivaColombiaPage.DEPARTURE));
		actor.attemptsTo(Click.on(VivaColombiaPage.DEPARTURE_FIELD));
		actor.attemptsTo(Enter.theValue(origen).into(VivaColombiaPage.DEPARTURE));
		actor.attemptsTo(Click.on(VivaColombiaPage.DEPARTURE));
		//actor.attemptsTo(Click.on(VivaColombiaPage.DEPARTURE));
		//actor.attemptsTo(Click.on(VivaColombiaPage.DESTINY));
		//actor.attemptsTo(Enter.theValue(origen).into(VivaColombiaPage.DESTINY_FIELD));
		//actor.attemptsTo(Enter.theValue(destino).into(VivaColombiaPage.DEPARTURE));
		
	}

	public static Choose theInitialInfo(String origen, String destino) {
		
		return Tasks.instrumented(Choose.class, origen, destino);
	}

}
