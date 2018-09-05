#Author: your.email@your.domain.com
@Regresion
Feature: Compra de tiquetes por Viva Colombia

  
  Scenario Outline: Buy tickets to travel with kids and babies
    Given that Rafa wants to buy tickets from Medellin To Bogota he enters to the Viva Colombia page
    When He Chooses the best option for all the travelers with the this travel data
    |departureDate  |returnDate	 |adults	|kids	 |babies	|coin	 |
    |<departureDate>|<returnDate>|<adults>|<kids>|<babies>|<coin>|
    And register the adults information
    |nombre  |apellido  |genero  |documento  |
    |<nombre>|<apellido>|<genero>|<documento>|
    And register the kids information
    |nombre |apellido  |fechaNacimiento	|genero	 |documento	 |
    |<nombre>|<apellido>|<fechaNacimiento>|<genero>|<documento>|
    And register the babies information
    |nombre	 |apellido	|fechaNacimiento	|viajandoCon	|
    |<nombre>|<apellido>|<fechaNacimiento>|<viajandoCon>|
    
    @caso1
    Examples:
    |departureDate|returnDate|adults|kids|babies|coin|
    |25/08/2018   |30/09/2018|3     |2   |1     |USD |
    
    @caso2
    Examples:
    |nombre  |apellido  |genero |documento  |
    |Rafael|Pérez   |Masculino					|12345678 |
    |Rafael|Pérez   |Masculino					|12345679 |
    |Rafael|Pérez   |Masculino					|12345677 |
    
    @caso3
    Examples:
    |nombre  |apellido |fechaNacimiento	|genero	 |documento	 |
    |Rafael|Pérez   |20/09/2010	 		|Masculino |123  		 |
    |Rafael|Pérez   |20/09/2010	 		|Masculino |124  		 |
    
    @caso4
    Examples:
    |nombre |apellido	|fechaNacimiento	|viajandoCon	|
    |Rafael|Pérez   |20/09/2017     |Adulto 1   |
    
    