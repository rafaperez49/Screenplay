package co.com.proyectobase.screenplay.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;

import co.com.proyectobase.screenplay.questions.LaRespuesta;
import co.com.proyectobase.screenplay.tasks.Abrir;
import co.com.proyectobase.screenplay.tasks.Traducir;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class TraductorGoogleStepDefinition {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor rafa = Actor.named("Rafa");
	
	@Before
	public void configuracionInicial()
	{
		rafa.can(BrowseTheWeb.with(hisBrowser));
	}
	
	
	@Given("^Que Rafa quiere usar el traductor de google$")
	public void que_Rafa_quiere_usar_el_traductor_de_google(){
		rafa.wasAbleTo(Abrir.LaPaginaDeGoogle());
	}

	@When("^el traduce la palabra (.*) del inglés al español$")
	public void el_traduce_la_palabra_table_del_inglés_al_español(String palabra)  {
		rafa.attemptsTo(Traducir.DeInglesAEspanolLa(palabra));
	}

	@Then("^el deberia ver la palabra (.*) en la pantalla$")
	public void el_deberia_ver_la_palabra_mesa_en_la_pantalla(String palabraEsperada)  {
		//System.out.println(LaRespuesta.es().toString());
		rafa.should(seeThat(LaRespuesta.es(), equalTo(true)));
		
	}

}
