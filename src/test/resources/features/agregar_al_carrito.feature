Feature: Agregar producto al carrito
  @AgregarCarrito
  Scenario: Agregar producto al carrito
    Given el usuario esta en la pagina de inicio
    When agrega un producto al carrito
    Then el producto fue agregado correctamente