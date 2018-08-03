package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.ui.GoogleTraductorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LaRespuesta implements Question<Boolean>{

	public static LaRespuesta es() {
		return new LaRespuesta();
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		//return Text.of(GoogleTraductorPage.AREA_TRADUCIDA).viewedBy(actor).asString();
		//return Value.of(GoogleTraductorPage.AREA_TRADUCIDA).viewedBy(actor).asString().;
		return net.serenitybdd.screenplay.questions.Presence.of(GoogleTraductorPage.AREA_TRADUCIDA).viewedBy(actor).asBoolean();
		
	}

}
