package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.ui.GBFormularioChat;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class SeMuestra implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(GBFormularioChat.BIENVENIDA_CHAT).viewedBy(actor).asString();
	}

	public static SeMuestra elMensaje() {
		
		return new SeMuestra();
	}

}
