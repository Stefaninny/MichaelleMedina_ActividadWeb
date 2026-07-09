Feature: Login con un usuario
  @Login
  Scenario Outline: Login con un usuario
    Given el usuario esta en la pagina de inicio
    When inicia sesion con usuario "<username>" y contrasena "<password>"
    Then ingresa exitosamente al sistema "<username>"
    Examples:
      | username |password |
      | MichaelleMedina | MichiPass123 |