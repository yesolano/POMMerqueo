@historia1
Feature: Consulta de productos en pagina Merqueo
	Yo como usuario de Merqueo
	Quiero poder consultar productos 
	Para mercar por internet

  @test1
  Scenario Outline: Consultar productos correctamente
    Given que el usuario esta en la pagina inicial de merqueo
    When el usuario ingresa el producto "<producto>"
    And el usuario hace clic en el boton de busqueda
    And el usuario esta en la pagina de resultados de busqueda
    And el usuario selecciona la cantidad "<cantidad>" a llevar del producto
    Then el producto es agregado al carrito de compra

    Examples: 
      | producto  | cantidad | 
      | sanchicha |     5 | 
