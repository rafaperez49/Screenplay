package co.com.proyectobase.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class GBFormularioChat {
	
	public static final Target TIPO_DOCUMENTO = Target.the("El tipo de documento").located(By.id("gcbChatTipo_title"));
	public static final Target NUMERO_IDENTIFICACION = Target.the("El tipo de documento").located(By.id("gcbChatIdentify"));
	public static final Target PAIS = Target.the("El tipo de documento").located(By.id("gcbChatPais_title"));
	public static final Target NOMBRE = Target.the("El tipo de documento").located(By.id("gcbChatFirstName"));
	public static final Target CORREO = Target.the("El tipo de documento").located(By.id("gcbChatEmail"));
	public static final Target PETICION = Target.the("El tipo de documento").located(By.id("gcbChatTema"));
	public static final Target LISTA_TI = Target.the("El tipo de documento").located(By.id("gcbChatTipo_child"));
	public static final Target LISTA_PAIS = Target.the("El tipo de documento").located(By.id("gcbChatPais_child"));
	public static final Target AUTORIZACION = Target.the("El tipo de documento").located(By.xpath("//*[@id=\'chat_form\']/div[4]/table/tbody/tr/td[1]/div/label"));
	public static final Target BOTON_INICAR_SESION = Target.the("Botón para confirmar el acceso al Chat").located(By.id("gcbChatRegister"));
	public static final Target BIENVENIDA_CHAT = Target.the("Mensaje de Bienvenida al Chat").located(By.xpath("/html/body/div[11]/div/div[2]/div/div[3]/div[2]/div/div/div[1]/div/table/tbody/tr/td"));
	//*[@id='chat_form']/div//table/tbody/tr/td/div[@class='gwc-chat-check']
	
}
