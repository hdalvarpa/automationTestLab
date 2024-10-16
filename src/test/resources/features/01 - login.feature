@Login
Feature:  CP01-LOGIN

  @ValidCredentials
  Scenario: 01 - validar con credenciales correctas
    Given el usuario ingresa al sitio web
    When ingresa credenciales validas
    Then la aplicacion deberia mostrar la pantalla principal de productos

  @InvalidCredentials
    Scenario: 02 - validar con credenciales inválidas
      Given el usuario ingresa al sitio web
      When ingresa credenciales invalidas
      Then la aplicacion deberia mostrar un mensaje de error

@ValidarCredentialsValid
  Scenario Outline: : 03 - validar con credenciales correctas
    Given el usuario ingresa al sitio web
    When ingresar "<username>" en user name
    And ingresar "<password>" en password
    And se hace click en Login
    Then la aplicacion deberia mostrar la pantalla principal de productos

    Examples:
    |username      | password     |
    |standard_user | secret_sauce |
    |standard_user | secret_sauce |