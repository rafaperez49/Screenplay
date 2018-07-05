#Author: rperezr@choucairtesting.com
@Regresion
Feature: 
				Como un usuario
				Quiero ingresar a google Translator
				A traducir palabras entre diferentes lenguajes

  @traducir
  Scenario: Traducir de Ingles a Español
    Given Que Rafa quiere usar el traductor de google 
    When el traduce la palabra table del inglés al español
    Then el deberia ver la palabra mesa en la pantalla
