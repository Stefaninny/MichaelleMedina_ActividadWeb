Feature: Compra End to End
  @CompraProductoE2E
  Scenario Outline: Compra End to End
    Given el usuario esta en la pagina de inicio
    When inicia sesion con usuario "<username>" y contrasena "<password>"
    Then ingresa exitosamente al sistema "<username>"
    When agrega un producto al carrito
    Then el producto fue agregado correctamente
    When realiza el pago con
      | nombre   | pais | ciudad | tarjeta          | mes | anio |
      | <nombre> | <pais> | <ciudad> | <tarjeta> | <mes> | <anio> |
    Then la compra se realiza exitosamente

    Examples:
      | username          | password      | nombre   | pais | ciudad | tarjeta         | mes | anio |
      | MichaelleMedina   | MichiPass123  | Michaelle| Peru | Cusco  | 123456789012345 | 07  | 2026 |