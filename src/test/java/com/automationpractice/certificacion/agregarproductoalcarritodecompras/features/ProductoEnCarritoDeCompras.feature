#jhoant233@gmail.com

  # language: es

Característica: Agregar producto al carrito de compras
  Yo como usuario de automationpractice
  Quiero buscar un producto de la tienda
  Para agregarlo al carrito de compras

  Antecedentes:
    Dado Johan ingreso a la pagina automationpractice

  Esquema del escenario: Agregar producto al carrito de forma exitosa

    Cuando El busca un producto desde el menu

      | tipoProducto   |
      | <tipoProducto> |

    Entonces El deberia verlo agregado en el carrito de compras

     | nombreProducto   |
     | <nombreProducto> |

    Ejemplos:
      | tipoProducto | nombreProducto|
      | DRESSES      | Printed Dress |
