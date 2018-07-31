package co.com.proyectobase.screenplay.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.proyectobase.screenplay.model.Usuario;
import co.com.proyectobase.screenplay.questions.SeMuestra;
import co.com.proyectobase.screenplay.tasks.Diligenciar;
import co.com.proyectobase.screenplay.tasks.Ingresar;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GrupoBancolombiaStepDefinition {
	
	@Managed(driver ="chrome")
	private WebDriver hisBrowser;
	Actor juanchito = Actor.named("Juanchito");
	
	@Before
	public void setup()
	{
		juanchito.can(BrowseTheWeb.with(hisBrowser));
	}
	
	
	@Given("^Juanchito quiere soporte de productos bancolombia$")
	public void juanchito_quiere_soporte_de_productos_bancolombia() {		
		juanchito.wasAbleTo(Ingresar.LaPaginaDelGB());
	    }


	@When("^el ingresa al chat y diligencia informacion necesaria$")
	public void el_ingresa_al_chat_y_diligencia_informacion_necesaria(List<Usuario> formulario)  {
	   
		juanchito.attemptsTo(Diligenciar.informacionNecesaria(formulario));
		
	}

	@Then("^el debe ver el mensaje (.*)$")
	public void el_debe_ver_que_el_ingreso_es_correcto(String mensaje) {
		
		juanchito.should(seeThat(SeMuestra.elMensaje(), equalTo(mensaje)));	
	}

}
