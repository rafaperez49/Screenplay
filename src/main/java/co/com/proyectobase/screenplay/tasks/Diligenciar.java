package co.com.proyectobase.screenplay.tasks;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import co.com.proyectobase.screenplay.model.Usuario;
import co.com.proyectobase.screenplay.ui.GBFormularioChat;
import co.com.proyectobase.screenplay.ui.GBPage;
import co.com.proyectobase.screenplay.ui.GrupoBancolombiaPage;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class Diligenciar implements Task{

	private List<Usuario> formulario;
	private GrupoBancolombiaPage page;
	
	public Diligenciar(List<Usuario> formulario) {
		this.formulario = formulario;
	}

	
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(GBPage.BOTON_CHAT));
		actor.attemptsTo(Click.on(GBFormularioChat.TIPO_DOCUMENTO));
		SeleccionarLista(GBFormularioChat.LISTA_TI,formulario.get(0).getTI(), actor);
		actor.attemptsTo(Enter.theValue(formulario.get(0).getNumeroIdentificacion()).into(GBFormularioChat.NUMERO_IDENTIFICACION));
		actor.attemptsTo(Click.on(GBFormularioChat.PAIS));
		SeleccionarLista(GBFormularioChat.LISTA_PAIS, formulario.get(0).getPais(), actor);
		actor.attemptsTo(Enter.theValue(formulario.get(0).getNombre()).into(GBFormularioChat.NOMBRE));
		actor.attemptsTo(Enter.theValue(formulario.get(0).getCorreo()).into(GBFormularioChat.CORREO));
		actor.attemptsTo(Enter.theValue(formulario.get(0).getPeticion()).into(GBFormularioChat.PETICION));
		selectCheck();
		actor.attemptsTo(Click.on(GBFormularioChat.BOTON_INICAR_SESION));
		//chulear(actor);
		//actor.attemptsTo(Click.on(GBFormularioChat.AUTORIZACION));
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
		executor.executeScript("arguments[0].click()", GBFormularioChat.AUTORIZACION.resolveFor(actor));
	}
	
	public void SeleccionarLista(Target objeto, String strValor, Actor actor) {
		
		
		
		List<WebElement> listObjeto = objeto.resolveFor(actor).findElements(By.tagName("li"));
		for(int i=0; i < listObjeto.size(); i++){
			if (listObjeto.get(i).getText().equals(strValor)) {
				listObjeto.get(i).click();
				break;
			}			 
		}		
	}

}
