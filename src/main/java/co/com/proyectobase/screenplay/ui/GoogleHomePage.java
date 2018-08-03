package co.com.proyectobase.screenplay.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.By;

@SuppressWarnings("deprecation")
@DefaultUrl("http://www.google.com")
public class GoogleHomePage extends PageObject{
	
	public static final Target BOTON_APLICACIONES = Target.the("El boton que muesta las aplicaciones").located(By.id("gbwa" ));
	public static final Target BOTON_GOOGLE_TRANSLATE = Target.the("Botón de app traductor").located(By.id("gb51"));
}
