# Objetos y clases

En el núcleo de la programación orientada a objetos se encuentran dos conceptos que es necesario comprender correctamente de inicio: **objetos** y **clases**. Estos conceptos son la base de los lenguajes de programación orientados a objetos. Por tanto, empezaremos viendo una breve explicación de estas dos ideas fundamentales.

Cuando escribimos un programa informático en un lenguaje orientado a objetos lo que estamos haciendo es crear un modelo de una cierta parte del mundo. Los componentes principales a partir de los cuales se construye ese modelo son los *objetos* que aparecen en el dominio del problema concreto que estemos intentando resolver. Estos objetos varían dependiendo del tipo de programa que escribamos. Por ejemplo, puede tratarse de palabras y párrafos, si lo que estamos programando un procesador de textos como el Word, o bien de usuarios y mensajes si estamos trabajando en un programa de mensajería como Whatsapp. O puede tratarse de monstruos y armas si nuestro programa es un videojuego.

Los objetos pueden clasificarse en tipos, que será lo que nosotros denominaremos clases. Una clase será una manera abstracta que engloba y describe a muchos objetos de un mismo tipo concreto.

Supón, por ejemplo, que quieres crear un videojuego de carreras de coches. En este caso, uno de los tipos de objeto con los que tendremos que tratar serán, sin duda, los vehículos. 

¿Qué será un vehículo en nuestro programa: una clase o un objeto? Algunas preguntas nos puede ayudar a tomar una decisión:

* ¿De que color es el vehículo? 
* ¿Qué velocidad puede alcanzar? 
* ¿En qué punto concreto del recorrido se encuentra en este momento?

Observa que no podemos responder a esas preguntas si no consideramos un vehículo en concreto. El motivo es que, en nuestro programa, la palabra "vehículo" hace referencia a la *clase* vehículo: nos estamos refiriendo a los vehículos en general, no a un vehículo en concreto.

Por el contrario, si en lo que me fijo es en el "vehículo que está el primero en la carrera" si soy entonces capaz de responder a las cuestiones planteadas. Por ejemplo, ese vehículo puede ser rojo, alcanzar 200 km/h y estar a la mitad del recorrido. Ahora estamos hablando de un objeto en concreto.

Resumiendo, podemos decir que los objetos se crean a partir de clases y que las clases describen las características de un mismo tipo de objetos.


## Creación de objetos

Abre BueJ y carga el proyecto *figures*. En la ventana debería verse a continuación un diagrama formado por 5 rectángulos con una serie de flechas entre ellos. Cada uno de los rectángulos del diagrama representa una clase de nuestro proyecto. En este proyecto disponemos de las clases denominadas `Circle`, `Square`, `Triangle` y `Canvas`, que representan círculos, cuadrados, triángulos y lienzos respectivamente.

Haz clic con el botón derecho sobre la clase `Circle` y, en el menú emergente, selecciona `new Circle()`. BlueJ nos pide que introduzcamos un nombre para el objeto que estamos creando. Como el nombre predeterminado que nos proporciona BlueJ es válido por el momento, basta con hacer clic en *OK*. Ahora podrás ver un rectángulo rojo en la parte inferior izquierda de la pantalla etiquetado como `circle1`. (El área de la parte inferior de la pantalla en la que se muestra el objeto se denomina *banco de objetos*.)

¡Acabamos de crear nuestro primer objeto! Es importante que entiendas que el círculo `Circle` de la parte superior de BlueJ representa la clase `Circle` mientras que el rectángulo inferior representa el objeto `circle1` creado a partir de la clase anterior. 


## Invocación de métodos

Haz clic con el botón derecho del ratón en el objeto círculo que has creado (¡no en la clase!). Se mostrará un menú emergente con muchas opciones. Selecciona `makeVisible` en el menú para hacer visible el objeto; aparecerá así una representación de este círculo en una nueva ventana.

Observa que existen otras muchas operaciones posibles en el menú emergente correspondiente a ese objeto círculo. Seleciona la opción `moveRight` y `moveDown` unas cuantas veces y observa como el círculo se mueve hacia la derecha y hacia abajo, aproximándose al centro de la pantalla. Selecciona también las opciones `makeInvisible` y `makeVisible` para ocultar y mostrar el círculo alternativamente.

Las entradas que componen el menú emergente del objeto círculo representan operaciones que podemos hacer sobre dicho círculo. En Java (y en muchos otros lenguajes de programación) esas operaciones se denominan *métodos*. Los programadores decimos que somos capaces de *invocar métodos sobre objetos*. En consecuencia, a partir de ahora, si se te pide que invoques un método `a` sobre un objeto `b`, ya sabes lo que tienes que hacer.


## Parámetros

Invoca el método `moveHorizontal` sobre el objeto `circle1`. Aparecerá un cuadro de diálogo que te pedirá que introduzcas un cierto dato. Escribe `50` y haz clic en *OK*. Comprueba que el círculo se desplaza 50 píxeles hacia la derecha (un píxel es un punto de la pantalla).

El método `moveHorizontal` que acabamos de llamar está escrito de tal forma que requiere de cierta información adicional para ejecutarse. En este caso, la información requerida es la distancia, es decir, la especificación de cuánto debe moverse el círculo. Por tanto, el método `moveHorizontal` es más flexible que los métodos `moveRight` y `moveLeft`, porque estos dos métodos siempre desplazan el círculo una cantidad fija, mientras que que `moveHorizontal` nos permite indicar a qué distancia queremos que se mueva el círculo.

Invoca sobre tu círculo los métodos `moveVertical` y `slowMoveVertical` y `changeSize` antes de continuar leyendo de forma que te quede claro cómo funciona cada uno de ellos.

Los valores adicionales que requieren algunos métodos para poder comenzar a funcionar se denominan *parametros*. Cada método indica los tipos de parámetros que necesita. Por ejemplo, cuando se invoca el método `moveHorizontal`, el cuadro de diálogo que aparece muestra la siguiente línea en la parte superior:

```
void moveHorizontal(int distance)
```

Esta línea se denomina *cabecera* del método. La cabecera proporciona cierta información acerca del método en cuestión. La parte entre paréntesis `(int distance)` es la información acerca del parámetro requerido. Para cada parámetro se definen dos cosas: el *tipo* y su *nombre*. Por tanto, el método `moveHorizontal` requiere de un parámetro de tipo `int` denominado `distance`. El nombre del parámtro proporciona una pista acerca del significado de los datos que se espera que se introduzcan para ese parámetro cuando se invoca ese método. 

A la cabecera de un método también se la denomina *signatura* y proporciona toda la información necesaria para poder invocar dicho método.


## Tipos de datos

Un tipo especifica cuáles son los datos que pueden traspasarse a un parámetro. El tipo `int` hace referencia, por ejemplo, a los números enteros (`int` es la abreviatura de "integer", que significa entero en inglés).

En el ejemplo anterior, la cabecera del método `moveHorizontal` nos dice que, para ejecutar el método, debemos suministrarle un número entero que especifique la distancia que queremos que se desplace el círculo. El campo de entrada de datos que aparece al invocar el método nos permite introducir dicho número entero.

En los ejemplos vistos hasta ahora, el único tipo de datos con el que nos hemos encontrado es `int`. Los parámetros de los métodos de desplazamiento y del método `changeSize` son todos ellos de este tipo.

Una inspección más detallada del menú emergente de un objeto nos muestra que las entrada del menú correspondientes a los métodos incluyen los tipos de parámetros. Si un método no tiene ningún parámetro, el nombre del método irá seguido de un par de paréntesis vacíos. Si dispone de un parámetro, mostrará el tipo y el nombre de dicho parámetro. En la lista de métodos correspondiente al círculo, solo hay un método con un tipo de parámetro diferente: el método `changeColor`, que sirve paa cambiar el color del círculo y que tiene un parámetro de tipo `String`.

El tipo `String` indica que hace falta una cadena, es decir, una sección de texto (por ejemplo, una palabra o una frase). Las cadenas se encierran siempre entre dobles comillas. Por ejemplo, para introducir la palabra *red* como una cadena y cambiar el color del círculo a rojo debemos escribir `"red"`.

El cuadro de diálogo de invocación del método también incluye una sección de texto denominada *comentario* por encima de la cabecera del método. Los comentarios se incluyen para proporcionar información para los humanos que están usando o leyendo el programa y hablaremos de ellos más adelante. El comentario del método `changeColor` describe los nombre de colores que el sistema reconoce.

Un error común que suelen cometer los programadores principiantes es olvidarse de poner las dobles comillas al introducir un valor de tipo `String`. Si escribes `green` en lugar de `"green"` obtendrás un mensaje de error que dirá algo así como "Error: cannot find symbol - variable green".

Antes de continuar invoca el método `changeColor` sobre tu objeto círculo consiguendo que cambie su color a rojo. Después consigue que cambie su color a otro de tu elección. Prueba también qué sucede si intentas cambiar el circulo a un color que no admita el sistema. Finalmente, vuelve a intentar cambiar el color del objeto introduciendo un color sin comillas y compueba qué sucede.


Java soporta muchos otros tipos de datos, incluidos los números decimales y las letras, que en programación llamamos caracteres. No vamos a hablar de todos ellos ahora, sino que volveremos sobre esta cuestión más adelante.


## Objetos múltiples

Una vez que disponemos de una clase, podemos crear tantos objetos de dicha clase como queramos. A partir de la clase `Circle`, por ejemplo, podemos crear muchos círculos diferentes o iguales y, a partir de la clase `Square`, podemos crear muchos cuadrados diferentes o iguales.

Cada uno de estos objetos creados tiene su propia posición, color y tamaño. Podemos cambiar un atributo de un objeto (por ejemplo, su tamaño), invocando un método sobre dicho objeto. Esto afectará a ese objeto en concreto pero no a los restantes objetos de la misma clase.

Prueba ahora a crear otros dos objetos círculos y consigue que tengas diferente color, tamaño y posición del círculo original.

Es posible que te hayas fijado en un detalle adicional acerca de los parámetros. Examina el método `changeSize` del triángulo. Su cabecera es:

```
void changeSize(int newHeight, int newWidth)
```

Aquí vemos un ejemplo de un metodo con más de un parámetro. Este método tiene dos parámetros distintos y se utiliza una coma para separarlos dentro de la cabecera. De hecho, cada método puede tener cualquier número de parámetros.


## Estado

El conjunto de valores de todos los atributos que definen un objeto (como la posición en el eje x de la pantalla, la posición en el eje y de la pantalla, el color, el diámetro y el estado de visibilidad de un círculo) se denominan el *estado* de ese objeto.

En BlueJ, el estado de un objeto puede inspeccionarse seleccionado la función *Inspect* (Inspeccionar) en el menú emergente del objeto. Cuando se inspecciona un objeto se muestra en pantalla lo que denominamos el *inspector de objetos*. El inspector de objetos es una una vista ampliada del objeto, en la que se muestran los atributos almacenados dentro del mismo.

Algunos métodos, al ser invocados, modifican el estado de un objeto. Por ejemplo, el método `moveLeft` cambia el atributo `xPosition` del objeto sobre el que se invoque. 

Para comprobar cómo funciona este inspector de objetos prueba a ver qué muestra para cada uno de los objetos que tienes ahora mismo creados. De hecho, prueba a cambiar algún atributo de un objeto invocando un método sobre ese objeto con el inspector de objetos abierto y verás cómo se actualiza en el inspector el valor del atributo.

En Java, a cada una de los valores que constituyen el estado de un objeto los denominamos *campos* o *atributos*.


## ¿Qué es lo que contiene un objeto?

Al inspeccionar distintos objetos, observarás que todos los objetos de la misma clase tienen los mismos atributos. Es decir, el número, el tipo y los nombres de los atributos son ideńticos para todos los objetos de la misma clase, mientras que los valores concretos de cada atributo particular de cada objeto pueden ser diferentes. Por el contrario, los objetos de clase diferentes pueden tener diferentes atributos. Un círculo, por ejemplo, tiene un atributo diámetro ("diameter"), mientras que un triángulo tiene atributos para la anchura ("width") y la altura ("height").

La razón es que el número, los tipos y los nombres de los atributos se definen dentro de una clase, no en un objeto. Por tanto, la clase `Circle` define que cada objeto círculo tendrá cinco campos denominados `diameter`, `xPosition`, `yPosition`, `color` e `isVisible`. También define los tipos de esos atributos. Es decir, especifica que los tres primeros son de tipo `int`, mientras que `color` es de tipo `String` e `isVisible` es de tipo `boolean`. `boolean` es un tipo de dato que puede representar dos valores: `true` o `false`, que representan los valores verdadero y falso y que estudiaremos más adelante.

Cuando se crea un objeto de la clase `Circle`, el objeto tiene automáticamemte los 5 atributos anteriores. Los valores de los atributos se almacenarán en el objeto de forma que se garantiza que cada círculo tenga un color, po ejemplo, y que así los distintos círculos puedan tener colores diferentes.

Lo mismo cabe decir de los métodos. Los métodos se definen en la clase del objeto. Como resultado, todos los objetos de una misma clase tienen disponibles los mismos métodos. Sin embargo, los métodos se invocan sobre objetos concretos, no sobre clases. Esto hace que esté claro qué objeto es el que hay que modificar cuando, por ejemplo, se invoca el método `moveRight`.
