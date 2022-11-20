# Challenge Mercado Libre
La aplicación es para el challenge técnico de Mercado Libre en tecnología Android.
Utiliza un conjunto de librerías Android Jetpack más Retrofit para obtener los datos desde la API REST, se usa Jetpack Compose como sistema de vistas.

## Definición funcional
Se logro maquetar un clon con algunas funciones básicas de la aplicación real de Mercado Libre, existen algunas variaciones para acomodar funcionalmente lo que se quería mostrar en el tiempo mínimo que se estableció en la anterior entrevista.

* Pantalla Main donde encontramos barra de búsqueda y listado de categorías.
* Es posible realizar búsqueda dando click en algún item de la lista de categorías (Se realiza con el título de la categoría).
* Al realizar la búsqueda se lista los resultados con base en la palabra clave escrita por el usuario, esta búsqueda se puede realizar desde el icono dentro de la barra de búsqueda o directamente desde el teclado.
* Icono clickeable para borrar la búsqueda <-.
* Al seleccionar algún item del resultado de la búsqueda navega a la pantalla de Detalle.
* La pantalla de Detalle contiene los detalles básicos del item seleccionado.
* Area de detalle del producto (cantidad vendida, título, imagenes, estado, precio, cantidad disponible, seleccionar cantidad, agregar al carrito, ubicación, calificación y descripción).
* Carousel que cambia de imágen al realizar el swipe donde indica la cantidad de imagenes y en cual se posiciona el usuario.
* Seleccionar cantidad de items para agregar al producto, opciones predefinidas y opción de ingresar la cantidad personalizada.
* Botones de `Comprar ahora` y `Agregar al carrito`, muestra que se agrega al carrito de compras la cantidad seleccionada mientras se este en la pantalla de Detalle.
* Sección de Descripción.

## Definiciones técnicas
* Se trabaja con arquitectura MVVM.
* Se inyecta dependencias con Dagger Hilt
* Se trabajan el sistema de vistas con Jetpack Compose.
* Se hace uso de Retrofit para obtener los datos desde las api.

> El repositorio lo encuentras [aqui](https://github.com/andrewsensity/MercadoLibre).

## API
Las apis usadas: 
* [Api de detalles](https://api.mercadolibre.com/items/MCO1078929648)
* [Api de description](https://api.mercadolibre.com/items/MCO1078929648/description)
* [Api de búsqueda](https://api.mercadolibre.com/sites/MCO/search?q=carro)
* [Api de categorías](https://api.mercadolibre.com/sites/MCO)

## Arquitectura
El proyecto utiliza el patrón de arquitectura MVVM.

## Librerias

* [El estado y Jetpack Compose](https://developer.android.com/jetpack/compose/state?hl=es-419) - El 
  estado de una app es cualquier valor que puede cambiar con el paso del tiempo. Esta es una 
  definición muy amplia y abarca desde una base de datos de Room hasta una variable de una clase.
* [Material3](https://developer.android.com/jetpack/androidx/releases/compose-material3) - la siguiente 
  evolución de Material Design. Material 3 incluye temas y componentes actualizados, y 
  funciones de personalización de Material You, como el color dinámico.
* [Navigation Component](https://developer.android.com/jetpack/compose/navigation)
    - Puedes navegar entre los elementos que admiten composición y aprovechar la infraestructura y las funciones del componente Navigation
* [Dagger Hilt](https://developer.android.com/jetpack/compose/libraries?hl=es-419) - For Dependency
  Injection.
* [Retrofit](https://square.github.io/retrofit/) - Para acceder a la API Rest
* [Mock Web Server](https://github.com/square/okhttp/tree/master/mockwebserver) - Un servidor web con capacidad de scripting para probar clientes HTTP

## Disclaimer
Se  intenta lograr avanzar lo más posíble en el tiempo mínimo requerido, Agradezco la oportunidad.
