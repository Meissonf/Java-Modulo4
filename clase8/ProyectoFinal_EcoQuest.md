# Proyecto Final Módulo 8: "EcoQuest: Sistema de Gestión de Aventuras Ecológicas"

## Contexto
Una organización ambiental llamada **EcoQuest** organiza misiones para explorar parques naturales, plantar árboles y limpiar ríos. Necesitan un sistema en Java que gestione **misiones ecológicas**, **voluntarios** y **puntos ecológicos**. El sistema debe permitir organizar a los participantes, asignar misiones y llevar un registro de su impacto positivo.

## Requerimientos mínimos

### Modelo de Datos
- Implementar clases:
  - `Voluntario` (nombre, ID, habilidades, misiones completadas).
  - `Mision` (ID, descripción, ubicación, fecha, nivel de dificultad).
  - `PuntoEco` (parques, ríos, reservas naturales con coordenadas y tipo de ecosistema).
- Usar **herencia** para diferentes tipos de misiones (por ejemplo: `MisionPlantacion`, `MisionLimpieza`, `MisionEducacion`).
- Aplicar **interfaces** para misiones que otorguen **recompensas especiales**.

### Gestión de Colecciones
- Utilizar:
  - **HashSet** y **LinkedHashSet** para evitar duplicados en voluntarios y puntos ecológicos.
  - **HashMap**, **TreeMap** y **LinkedHashMap** para organizar misiones por ID, por nivel de dificultad y en orden de registro.
  - **List** para gestionar la lista de misiones activas y completadas.

### Operaciones Principales
- Registrar nuevos voluntarios, misiones y puntos ecológicos.
- Asignar voluntarios a misiones, controlando duplicados y disponibilidad.
- Completar misiones y actualizar estadísticas de los voluntarios.
- Buscar voluntarios por habilidades o misiones completadas usando **Streams y Lambdas**.

### Reportes
- Listar:
  - Voluntarios con más misiones completadas.
  - Misiones pendientes y completadas por nivel de dificultad.
  - Puntos ecológicos más visitados.
- Calcular estadísticas de impacto (por ejemplo: árboles plantados, ríos limpiados).

### Manejo de Excepciones
- Controlar errores como:
  - Intentar registrar voluntarios con IDs repetidos.
  - Asignar un voluntario a una misión ya completada.
  - Intentar acceder a misiones inexistentes.

### Proyecto Integrador
- Crear un **menú interactivo** en consola para gestionar EcoQuest.
- Aplicar buenas prácticas de **POO** y documentación.
- Explicar en un breve documento por qué se eligieron ciertas colecciones para cada parte del sistema.

## Entrega
- Código fuente en un archivo .zip.
- Documento con:
  - Diagrama UML de las clases.
  - Justificación del uso de las colecciones.
  - Capturas de pantalla de la ejecución del programa.


# Ejemplo de Ejecución de la Aplicación EcoQuest

```text
=== ECOQUEST MENU ===
1. Registrar Voluntario
2. Registrar Misión
3. Registrar Punto Ecológico
4. Asignar Voluntario a Misión
5. Completar Misión
6. Buscar Voluntarios por Habilidad
7. Mostrar Reportes
8. Salir
Seleccione una opción: 1
ID: V001
Nombre: Angélica Torres
Habilidades (separadas por coma): plantar árboles,educar
Voluntario registrado.

=== ECOQUEST MENU ===
Seleccione una opción: 2
ID Misión: M101
Descripción: Reforestación de la ribera del río
Ubicación: Parque Nacional Verde
Dificultad: Media
Tipo de misión: 1. Plantación 2. Limpieza 3. Educación
1
Misión registrada.

=== ECOQUEST MENU ===
Seleccione una opción: 3
Nombre del Punto Ecológico: Parque Nacional Verde
Punto ecológico registrado.

=== ECOQUEST MENU ===
Seleccione una opción: 4
ID Voluntario: V001
ID Misión: M101
Voluntario asignado a la misión.

=== ECOQUEST MENU ===
Seleccione una opción: 5
ID Misión completada: M101
Misión completada y voluntarios actualizados.

=== ECOQUEST MENU ===
Seleccione una opción: 6
Habilidad a buscar: educar
Angélica Torres (ID: V001, habilidades: [plantar árboles, educar], misiones completadas: 1)

=== ECOQUEST MENU ===
Seleccione una opción: 7

=== Top Voluntarios ===
Angélica Torres (ID: V001, habilidades: [plantar árboles, educar], misiones completadas: 1)

=== Misiones Pendientes ===
(No hay misiones pendientes)

=== Misiones Completadas ===
M101

=== ECOQUEST MENU ===
Seleccione una opción: 8
¡Gracias por usar EcoQuest!
```

