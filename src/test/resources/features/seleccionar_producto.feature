#language: es
Característica: Seleccionar un producto cumpleaños, agregarlo y eliminarlo

  Escenario:  Seleccionar un producto cumpleaños, agregarlo y eliminarlo
    Dado que navego a la página "https://www.floristeriamundoflor.com/"
    Cuando selecciono la categoria cumpleaños
    Y lo agrego al carrito dos productos
    Y elimino el producto del carrito
    Entonces debería ver el mensaje "Tu carrito está vacío."
