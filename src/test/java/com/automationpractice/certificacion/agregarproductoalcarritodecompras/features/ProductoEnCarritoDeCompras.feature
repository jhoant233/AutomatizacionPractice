Feature: Agregar producto al carrito de compras
  Yo como usuario de automationpractice
  Quiero buscar un producto de la tienda
  Para agregarlo al carrito de compras

  Scenario: Agregar producto al carrito de forma exitosa
    Given Johan ingreso a la pagina automationpractice
    When El selecciona un producto de la tienda
    Then El puede verlo agregado al carrito de compras