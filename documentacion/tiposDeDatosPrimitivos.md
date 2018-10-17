### Tipos de datos primitivos

Aunque más adelante veremos por qué les llamamos *tipos primitivos*, por ahora nos basta con saber que los tipos de datos son nombres que les ponemos a conjuntos de valores. Por ejemplo, al conjunto de números enteros comprendidos entre -128 y 127 le llamamos tipo de datos `byte`.

En Java existen muchos tipos de datos diferentes:

* Números enteros:
  * `byte`: números enteros que ocupan 8 bits (por ejemplo, 24 o -2)
  * `short`: números enteros que ocupan 16 bits (por ejemplo, 137 o -119)
  * `int`: números enteros que ocupan 32 bits (por ejemplo, 5409 o -2003)
  * `long`: números enteros que ocupan 64 bits (por ejemplo, 423266353L o 55L)
* Numeros decimales:
  * `float`: números decimales de precision simple (por ejemplo, 43.889F)
  * `double`: números decimales de doble precisión (por ejemplo, 45.63 o 2.4e5)
* Otros tipos:
  * `boolean`: almacena un valor booleano true o false (por ejemplo, `true` o `false`)
  * `char`: almacena una letra (por ejemplo, 'm' o '?')

#### Notas

Un número sin punto decimal es interpretado como un valor de tipo `int`. Java puede convertir valoes de tipo `int` automáticamente a un tipo de dato entero más pequeño siempre que el valor quepa en él. Sin embargo, Java no puede convertir automáticamente un valor de tipo `int` a un `long`. Por este motivo debes  poner una L detrás de un número literal para indicar que quieres que sea directamente un `long` en vez de un `int`.

Un número escrito con un punto decimal se entiende por defecto que es `double`. Puedes especificar que quieres que sea `float` poniendo una `F` después del numero.
