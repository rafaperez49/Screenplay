#Author: rafa@gmail.com
@Regresion
Feature: Iniciar sesion en el chat bancolombia

  @casoExitoso
  Scenario: Ingresar exitosamente al chat del grupo bancolombia
    Given Juanchito quiere soporte de productos bancolombia
    When el ingresa al chat y diligencia informacion necesaria
    |tI | numeroIdentificacion | pais     | nombre | correo | peticion|
    |Cédula de Ciudadanía | 11111111111111111111 | Colombia | Juancho | juancho@gmail.com | Hola mundo|
    Then el debe ver el mensaje Bienvenido (a)
