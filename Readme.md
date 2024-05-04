# Proyecto Android: Aplicación de Inicio de Sesión 📱

Este proyecto es una aplicación de Android desarrollada en Android Studio que permite a los usuarios iniciar sesión utilizando un nombre de usuario y una contraseña predefinidos.

## Instalación

1. Clona este repositorio en tu máquina local.
2. Abre el proyecto en Android Studio.
3. Configura un emulador o conecta un dispositivo Android para ejecutar la aplicación.
4. Ejecuta la aplicación desde Android Studio.

## Funcionalidades

- **Inicio de Sesión**: Los usuarios pueden ingresar su nombre de usuario y contraseña y hacer clic en un botón para iniciar sesión.
- **Verificación de Permisos**: La aplicación verifica los permisos de ubicación del dispositivo antes de permitir el acceso.

## Ejemplos de Código

Aquí hay un ejemplo de cómo se realiza la verificación de permisos en la clase `MainActivity`:

```kotlin
if (permissions.isLocationOk(this)) {
    println("Permisos de ubicación concedidos")
} else {
    println("Permisos de ubicación denegados")
    permissions.requestLocationPermission(this)
}
```

### Contexto y Organización del Código:
- Este repositorio contiene un caso de estudio de una aplicación desarrollada en Android Studio.
- Dentro del paquete `com.noscript.viewbinding`, encontramos la clase principal `MainActivity`, que es el punto de entrada de la aplicación.

### Descripción de la Clase MainActivity:
- `MainActivity` es una actividad (clase principal que representa una pantalla con la que el usuario puede interactuar) de Android que gestiona la interfaz de usuario y la lógica principal de la aplicación.
- Utiliza View Binding (una técnica que permite acceder de forma segura a los elementos de la interfaz de usuario definidos en XML) para vincular los elementos de la interfaz de usuario definidos en XML con objetos de la clase `ActivityMainBinding`.
- La actividad está diseñada para permitir a los usuarios iniciar sesión utilizando un nombre de usuario y una contraseña predefinidos.

### Funcionalidades Principales:
- **Inicio de Sesión**: Los usuarios pueden ingresar su nombre de usuario y contraseña y hacer clic en un botón para iniciar sesión.
- **Verificación de Permisos**: La aplicación verifica los permisos de ubicación del dispositivo antes de permitir el acceso.

### Funciones Clave:
- `onCreate()`: Método llamado cuando se crea la actividad, donde se realiza la inicialización principal.
- `setInitComponent()`: Inicializa los componentes de la interfaz de usuario, como el título de la aplicación.
- `setListener()`: Configura los listeners (métodos que se llaman cuando se produce un evento, como hacer clic en un botón) para los eventos de usuario, como hacer clic en un botón.
- `inicioSesion()`: Realiza la lógica de inicio de sesión, verificando las credenciales ingresadas por el usuario.

### Comentarios y Documentación:
- Se han agregado comentarios en el código para proporcionar explicaciones sobre el propósito y funcionamiento de cada sección.
- Estos comentarios sirven como guía para otros desarrolladores que revisen o trabajen en el código en el futuro.

### Recursos Adicionales:
- Enlaces a diagramas útiles de Android Developer:
  - **Ciclo de vida de una actividad**: [Diagrama](https://developer.android.com/guide/components/activities/activity-lifecycle).
  - **Arquitectura de Android**: [Diagrama](https://developer.android.com/jetpack/guide).
  - **View Binding**: [Diagrama](https://developer.android.com/topic/libraries/view-binding).
