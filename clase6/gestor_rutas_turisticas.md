## Proyecto en Java: Gestor de Rutas Turísticas Inteligente

### Contexto general:

Colombia es un país lleno de paisajes, cultura e historia. Imagínate que estás desarrollando un sistema para una agencia de turismo que desea organizar **rutas turísticas** a lo largo del país. Estas rutas deben incluir los **puntos de interés** más destacados (como museos, miradores, fincas, playas), y estar agrupadas por **región** (ej. Caribe, Andes, Amazonía, etc.).

Además, la agencia desea que los turistas puedan recibir **recomendaciones de rutas** según sus intereses personales (por ejemplo: naturaleza, historia, cultura, aventura...).

Tu reto será crear una **aplicación en Java** que permita registrar rutas, buscarlas por región y recomendar rutas a los usuarios según sus intereses.

---

### Objetivo del proyecto:

Desarrollar una aplicación en Java, utilizando programación orientada a objetos, estructuras de datos (`ArrayList`, `HashSet`, `HashMap`), y manejo de excepciones, que funcione como un **gestor de rutas turísticas** para una agencia de viajes.

---

### Requisitos funcionales:

1. **Registrar rutas turísticas**, que deben contener:

   - **Nombre de la ruta**\
     Ejemplo: `"Ruta Cafetera"`

   - **Descripción de la ruta**\
     Ejemplo: `"Recorrido por fincas de café artesanal y paisajes del Eje Cafetero"`

   - **Región geográfica** (puede ser cualquier palabra que identifique una zona del país)\
     Ejemplo: `"Eje Cafetero"`

   - **Lista de puntos de interés**:

     - Nombre del punto\
       Ejemplo: `"Finca El Ocaso"`
     - Descripción del punto\
       Ejemplo: `"Experiencia guiada para conocer el proceso del café"`
     - Coordenadas geográficas\
       Ejemplo: `"5.068, -75.517"`

   - **Lista de etiquetas o temas** (sin duplicados, en minúscula preferiblemente):\
     Ejemplo: `["naturaleza", "café", "cultura"]`

2. **Mostrar todas las rutas registradas**, incluyendo sus datos completos (nombre, descripción, región, etiquetas y puntos de interés).

3. **Buscar rutas por región**, mostrando solo aquellas rutas que pertenecen a la región ingresada por el usuario.\
   Ejemplo: Si el usuario busca por `"Costa Caribe"` y hay una ruta con esa región, se mostrarán sus datos. Si no, se notificará que no hay resultados.

4. **Recomendar rutas a un usuario** según sus intereses:

   - El usuario ingresará su **nombre** (Ejemplo: `"María López"`)
   - Y sus **intereses** (Ejemplo: `["historia", "naturaleza"]`)
   - El sistema revisará todas las rutas registradas y le mostrará solo aquellas que tengan **al menos una etiqueta** en común con sus intereses.\
     Ejemplo: Si una ruta tiene etiquetas `["naturaleza", "cultura"]` y el usuario tiene intereses `["aventura", "naturaleza"]`, **esa ruta será recomendada.**

5. **Mostrar un menú por consola** con las opciones para interactuar con el sistema:

   ```
   === MENÚ PRINCIPAL ===
   1. Registrar nueva ruta turística
   2. Ver todas las rutas registradas
   3. Buscar rutas por región
   4. Recomendar rutas a un usuario
   5. Salir
   ```

---

###  Requisitos técnicos:

- Implementa al menos **cuatro clases**:

  - `PuntoInteres`
  - `RutaTuristica`
  - `Usuario`
  - `GestorRutas`

- Utiliza correctamente las diferentes estructuras de datos para administrar la información de la aplicación.

  