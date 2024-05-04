# Explicación del Código de Android Studio

### Package y imports:
- `package com.noscript.viewbinding`: Aquí estamos diciendo en qué carpeta está guardado nuestro código.
- Se importan las clases necesarias de Android y la clase de enlace de vista generada `ActivityMainBinding`.

### Clase MainActivity:
- Extiende de `AppCompatActivity`. Básicamente, esto significa que nuestra actividad es una actividad de Android normal.
- Declara variables privadas para el administrador de vibración, el enlace de vista y los permisos de la aplicación. Estas son las cosas que necesitaremos para hacer que nuestra aplicación funcione correctamente.
- Inicializa las variables de usuario y contraseña. Aquí es donde almacenaremos los datos de inicio de sesión.

### Función onCreate:
- Se llama cuando se crea la actividad. Es como el punto de partida de nuestra aplicación.
- **Inflado de Vista**: Aquí cargamos la interfaz de usuario desde el archivo de diseño XML y la conectamos con nuestro código Kotlin.
- **Inicialización de Componentes**: Configuramos todo lo necesario para que nuestra actividad funcione correctamente.
- **Verificación de Permisos**: Comprobamos si tenemos los permisos necesarios, como acceder a la ubicación del dispositivo.

### Funciones setInitComponent y setListener:
- **setInitComponent**: Configuramos el título de la aplicación en la barra superior.
- **setListener**: Aquí es donde escuchamos los eventos, como cuando se hace clic en un botón.

### Función inicioSesion:
- **Vibración del Dispositivo**: Hacemos que el teléfono vibre un poquito para dar retroalimentación al usuario.
- **Obtención de Credenciales**: Recolectamos lo que el usuario ha ingresado en los campos de usuario y contraseña.
- **Comparación de Credenciales**: Comparamos lo que el usuario ha ingresado con lo que tenemos almacenado. Si coinciden, les damos la bienvenida; si no, les decimos que vuelvan a intentarlo.
- **Mensaje Toast de Validación**: Mostramos un mensaje en la pantalla por un rato para darle al usuario información sobre si ha iniciado sesión con éxito o no.

### Comentarios:
- Los comentarios son como pequeñas notas para nosotros mismos (o para otros programadores) que explican qué está pasando en diferentes partes del código.
- Ayudan a entender cómo funciona el código y qué hace cada pieza.
- Por ejemplo, "// aquí crearé las variables de usuario y contraseña" nos recuerda por qué estamos creando esas variables.

### Uso de View Binding:
- Utilizamos View Binding para enlazar nuestras vistas de diseño con nuestro código Kotlin de una manera más segura y sencilla.
- Esto significa que no tenemos que preocuparnos por errores de "vista no encontrada" y cosas así.

### Manejo de Permisos:
- Verificamos si tenemos los permisos necesarios para que nuestra aplicación funcione correctamente.
- Si no los tenemos, pedimos educadamente al usuario que nos los dé.

### Comparación de Credenciales:
- Comprobamos si lo que el usuario ha ingresado coincide con lo que esperábamos.
- Es una medida de seguridad para asegurarnos de que solo las personas autorizadas puedan acceder a la aplicación.


