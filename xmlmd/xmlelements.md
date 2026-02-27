# 4. Elementos XML (Elements)

Un elemento XML es todo lo que comprende desde la etiqueta de inicio hasta la etiqueta de cierre (incluyéndolas).

## Características de los Elementos:
* **Contenido variado:** Un elemento puede contener texto, otros elementos (elementos hijos), atributos, o una combinación de todos.
* **Elementos vacíos:** Si un elemento no tiene contenido, se puede cerrar en una sola etiqueta: `<producto />`.
* **Nombres de elementos:**
    * Pueden contener letras, números y otros caracteres.
    * **No** pueden empezar con un número ni con caracteres de puntuación.
    * **No** pueden empezar con las letras "xml" (en cualquier combinación de mayúsculas/minúsculas).
    * **No** pueden contener espacios.

## Mejores prácticas para nombres:
W3Schools recomienda nombres descriptivos y cortos. En lugar de `<n>`, usa `<nombre>`. También es común usar el guion bajo para separar palabras: `<nombre_usuario>`.