#Author: rafa@gmail.com
@Regresion
Feature: Iniciar sesion en el chat bancolombia

  @casoExitoso
  Scenario Outline: Ingresar exitosamente al chat del grupo bancolombia
    Given Juanchito quiere soporte de productos bancolombia
    When el ingresa al chat y diligencia informacion necesaria
    |tI | numeroIdentificacion | pais     | nombre | correo |peticion|
    |<tI> | <numeroIdentificacion> | <pais>     | <nombre> | <correo> |<peticion>|
    Then el debe ver el mensaje Bienvenido (a)
    Examples:
    |tI | numeroIdentificacion | pais     | nombre | correo |peticion|
    |Cédula de Ciudadanía | 11111111111111111111 | Colombia | Juancho | juancho@gmail.com |Hola mundo|
    |Cédula de Ciudadanía | 22222222222222222222 | Colombia | ChoJuan | juancho@gmail.com |Hello world| 