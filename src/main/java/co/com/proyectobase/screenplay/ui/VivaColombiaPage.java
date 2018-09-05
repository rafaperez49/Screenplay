package co.com.proyectobase.screenplay.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.By;


@DefaultUrl("https://vivaair.com/co")
public class VivaColombiaPage extends PageObject{
	
	public static final Target DEPARTURE = Target.the("departure button").located(By.id("fromAirportWrapper"));
	public static final Target DEPARTURE_FIELD = Target.the("departure button").located(By.id("s2id_autogen20_search"));
	public static final Target DESTINY = Target.the("departure button").located(By.id("toAirportWrapper"));
	public static final Target DESTINY_FIELD = Target.the("departure button").located(By.id("select2-results-21"));

	
	
	
}
