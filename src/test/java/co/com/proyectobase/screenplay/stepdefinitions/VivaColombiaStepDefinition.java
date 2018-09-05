package co.com.proyectobase.screenplay.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.proyectobase.screenplay.model.AdultTraveler;
import co.com.proyectobase.screenplay.model.BabyTraveler;
import co.com.proyectobase.screenplay.model.FlightData;
import co.com.proyectobase.screenplay.model.KidTraveler;
import co.com.proyectobase.screenplay.tasks.Enters;
import co.com.proyectobase.screenplay.tasks.OpenThe;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class VivaColombiaStepDefinition {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor rafa =Actor.named("Rafa");
	
	
	@Before
	public void setup()
	{
		rafa.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^that Rafa wants to buy tickets from (.*) To (.*) he enters to the Viva Colombia page$")
	public void that_Rafa_wants_to_buy_tickets_from_Medellin_To_Bogota_he_enters_to_the_Viva_Colombia_page(String origen, String destino){
		rafa.wasAbleTo(OpenThe.vivaColombiaPage());
		rafa.wasAbleTo(Choose.theInitialInfo(origen, destino));
	}


	@When("^He Chooses the best option for all the travelers with the this travel data$")
	public void he_Chooses_the_best_option_for_all_the_travelers_with_the_this_travel_data(List<FlightData> information) {
		
	}

	@When("^register the adults information$")
	public void register_the_adults_information(List<AdultTraveler> arg1)  {
	}

	@When("^register the kids information$")
	public void register_the_kids_information(List<KidTraveler> arg1)          {
	}

	@When("^register the babies information$")
	public void register_the_babies_information(List<BabyTraveler> arg1) {
	}

}
