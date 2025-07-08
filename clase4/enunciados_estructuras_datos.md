## Ejercicio 1: Sistema de Gestión de Tokens Activos (HashSet)

Desarrolla una aplicación de consola en Java que permita gestionar los **tokens activos** de usuarios en una aplicación.

La aplicación debe permitir:

1. Registrar tokens cuando los usuarios inician sesión.
2. Verificar si un token existe o está activo.
3. Eliminar tokens cuando los usuarios cierren sesión.
4. Mostrar todos los tokens activos registrados.

**¿Por qué usar HashSet y no otra estructura?**

Porque HashSet ofrece inserciones, búsquedas y eliminaciones extremadamente rápidas, sin preocuparse por el orden.
Además, evita duplicados automáticamente, lo cual es esencial en sistemas de autenticación donde no puede haber tokens repetidos.
Otras estructuras como listas requerirían búsquedas manuales mucho más lentas.

---

## Ejercicio 2: Historial de Búsquedas de Productos (LinkedHashSet)

Desarrolla una aplicación de consola en Java que permita gestionar el **historial de búsquedas** de un usuario en una tienda en línea.

La aplicación debe permitir:

1. Registrar términos de búsqueda.
2. Mostrar el historial de búsquedas en el orden en que fueron realizadas.
3. Evitar que se repitan términos en el historial.
4. Limpiar el historial si el usuario lo desea.

**¿Por qué usar LinkedHashSet y no otra estructura?**

Porque LinkedHashSet mantiene el orden de inserción de los elementos, garantizando que el historial respete el orden en que los términos fueron buscados.
Además, evita duplicados automáticamente.
Otras estructuras como listas requerirían buscar duplicados manualmente y no ofrecen una forma tan sencilla de mantener el orden original sin esfuerzo adicional.

---

## Ejercicio 3: Lista de Clientes Ordenada Alfabéticamente (TreeSet)

Desarrolla una aplicación de consola en Java que permita gestionar una **lista de clientes** de una empresa.

La aplicación debe permitir:

1. Registrar clientes mediante su nombre.
2. Mostrar la lista de clientes ordenada alfabéticamente de forma automática.
3. Evitar nombres duplicados.
4. Eliminar un cliente por su nombre o limpiar toda la lista si es necesario.

**¿Por qué usar TreeSet y no otra estructura?**

Porque TreeSet ordena automáticamente los elementos cada vez que se insertan, sin necesidad de realizar ordenamientos manuales.
También evita duplicados.
Otras estructuras como listas o conjuntos sin orden requerirían ordenar manualmente cada vez que se insertan datos, lo cual sería ineficiente y más complejo de programar.

