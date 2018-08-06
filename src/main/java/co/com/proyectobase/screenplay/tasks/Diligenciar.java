package co.com.proyectobase.screenplay.tasks;

import static co.com.proyectobase.screenplay.ui.GBFormularioChat.AUTORIZACION;
import static co.com.proyectobase.screenplay.ui.GBFormularioChat.LISTA_TI;
import static co.com.proyectobase.screenplay.ui.GBFormularioChat.TIPO_DOCUMENTO;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import co.com.proyectobase.screenplay.interactions.Seleccionar;
import co.com.proyectobase.screenplay.model.Usuario;
import co.com.proyectobase.screenplay.ui.GBPage;
import co.com.proyectobase.screenplay.ui.GrupoBancolombiaPage;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Diligenciar implements Task{

	private List<Usuario> formulario;
	private GrupoBancolombiaPage page;
	
	public Diligenciar(List<Usuario> formulario) {
		this.formulario = formulario;
	}
	
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(GBPage.BOTON_CHAT));
		actor.attemptsTo(Click.on(TIPO_DOCUMENTO));
		actor.attemptsTo(Seleccionar.laLista(LISTA_TI, formulario.get(0).getTI()));
		
//		
//		actor.attemptsTo(Enter.theValue(formulario.get(0).getNumeroIdentificacion()).into(NUMERO_IDENTIFICACION));
//		actor.attemptsTo(Click.on(PAIS));
//		actor.attemptsTo(SeleccionarLista.desde(LISTA_PAIS).laOpcion(formulario.get(0).getPais()));
//		actor.attemptsTo(Enter.theValue(formulario.get(0).getNombre()).into(NOMBRE));
//		actor.attemptsTo(Enter.theValue(formulario.get(0).getCorreo()).into(CORREO));
//		actor.attemptsTo(Enter.theValue(formulario.get(0).getPeticion()).into(PETICION));
//		selectCheck();
//		actor.attemptsTo(Click.on(BOTON_INICAR_SESION));
	}

	public static Diligenciar informacionNecesaria(List<Usuario> formulario) {
		
		return Tasks.instrumented(Diligenciar.class, formulario);
		
	}
	
	public void selectCheck() {
		
		
		WebDriver driver = page.getDriver();
        WebElement input = driver.findElement(By.xpath("//*[@id=\'chat_form\']/div[4]/table/tbody/tr/td[1]/div"));
        new Actions(driver).moveToElement(input).click().perform();
	}
	
	  public void chulear(Actor actor)
	{
		JavascriptExecutor executor = (JavascriptExecutor)page.getDriver();
		executor.executeScript("arguments[0].click()", AUTORIZACION.resolveFor(actor));
	}
	
}
