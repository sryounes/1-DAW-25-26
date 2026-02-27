# 5. XML Attributes (Atributos)

Los atributos son **notas extra** que pones dentro de una etiqueta. No son el contenido principal, sino información que ayuda a identificarlo.

### Lo básico:
1. **¿Dónde van?** Siempre dentro de la primera etiqueta: `<elemento atributo="valor">`.
2. **La regla de oro:** El valor tiene que ir **SÍ O SÍ entre comillas** (si se te olvidan, el código explota).
3. **Para qué sirven:** Normalmente para IDs, idiomas o tipos de datos.

### Ejemplo rápido:
```xml
<estudiante id="1234">Juan</estudiante>