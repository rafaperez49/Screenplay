package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.ui.VivaColombiaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenThe implements Task{

	private VivaColombiaPage vivaColombiaPage;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(vivaColombiaPage));
		
	}

	public static OpenThe vivaColombiaPage() {
		return Tasks.instrumented(OpenThe.class);
	}

}
