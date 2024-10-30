# MisTareas2

MisTareas2 es una aplicación de Android para gestionar tareas. Permite registrar nuevas tareas, ver una lista de tareas y ver los detalles de cada tarea.

## Características

- Registrar nuevas tareas con título y descripción.
- Ver una lista de tareas registradas.
- Ver detalles de una tarea específica.
- Marcar tareas como completadas.
- Eliminar tareas.

## Tecnologías Utilizadas

- **Kotlin**: Lenguaje de programación principal.
- **Jetpack Compose**: Para la interfaz de usuario.
- **Android Studio**: IDE utilizado para el desarrollo.
- **Gradle**: Sistema de construcción.

## Estructura del Proyecto

- `MainActivity.kt`: Actividad principal que permite navegar a la pantalla de registro de tareas o a la lista de tareas.
- `TaskRegisterActivity.kt`: Actividad para registrar nuevas tareas.
- `TaskListActivity.kt`: Actividad para mostrar la lista de tareas.
- `TaskDetailsActivity.kt`: Actividad para mostrar los detalles de una tarea específica.
- `TaskData.kt`: Contiene la clase `Task` y un objeto `TaskData` que almacena la lista de tareas.

## Instalación

1. Clona el repositorio:
    ```sh
    git clone https://github.com/tu-usuario/mistareas2.git
    ```
2. Abre el proyecto en Android Studio.
3. Sincroniza el proyecto con Gradle.
4. Ejecuta la aplicación en un emulador o dispositivo físico.

## Uso

1. En la pantalla principal, selecciona "Registrar Nueva Tarea" para agregar una nueva tarea.
2. Completa el formulario con el título y la descripción de la tarea y presiona "Registrar Tarea".
3. Para ver la lista de tareas, selecciona "Ver Lista de Tareas" en la pantalla principal.
4. En la lista de tareas, selecciona una tarea para ver sus detalles.
5. En la pantalla de detalles, puedes marcar la tarea como completada o eliminarla.

## Contribuciones

Las contribuciones son bienvenidas. Por favor, abre un issue o envía un pull request para discutir cualquier cambio que desees realizar.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.
