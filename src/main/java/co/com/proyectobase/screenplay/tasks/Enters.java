package co.com.proyectobase.screenplay.tasks;

import java.util.List;

import co.com.proyectobase.screenplay.model.FlightData;
import co.com.proyectobase.screenplay.ui.VivaColombiaPage;
import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Enters implements Task{

	
	private List<FlightData> data;
	
	public Enters(List<FlightData> data) {
		this.data = data;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		
		
	}

	public static Enters allThe(List<FlightData> information) {
		
		return Tasks.instrumented(Enters.class, information);
	}
	

}
