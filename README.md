## TABLAMULTIPLICARCRISTINA## 

    Este proyecto permite generar la tabla de multiplicar para un número dado, multiplicando del 1 al 12. Este proyecto está diseñado como una aplicación Spring Boot y contiene los controladores y configuraciones necesarias para gestionar las solicitudes de generación de tablas.

## Estructura del Proyecto## 

    TABLAMULTIPLICAR/
    ├── .mvn/                       # Configuraciones de Maven 
    ├── src/
    │   ├── main/
    │   │   ├── java/com/multiplicar/tabla_multiplicar/
    │   │   │   ├── MultiplicacionTablaController.java    # Controlador principal para la tabla de multiplicar
    │   │   │   ├── ServletInitializer.java               # Configuración del servlet para inicializar Spring Boot
    │   │   │   └── TablaMultiplicarApplication.java      # Clase principal que inicia la aplicación Spring Boot
    │   │   └── resources/                                # Directorio para archivos de recursos
    │   └── test/                                         # Directorio para pruebas
    ├── target/                                           # Archivos generados después de la compilación
    ├── .gitignore                                        # Archivos y carpetas a ignorar por Git
    ├── dockerfile                                        # Archivo Docker para construir la imagen de la aplicación
    ├── pom.xml                                           # Archivo de configuración de Maven
    └── README.md                                         # Documentación del proyecto

## Requisitos ##
    Java 8 o superior
    Spring Boot
    Maven
## Instalación
1. Clona este repositorio:
   git clone 
2. Navega al directorio del proyecto:

   cd TABLAMULTIPLICAR
3. Construye el proyecto con Maven:

   mvn clean install
## Ejecuta la aplicación:

   mvn spring-boot:run
## Uso
Una vez que la aplicación esté en ejecución, acceda al endpoint para generar la tabla de multiplicar.

   Endpoint
   URL: http://localhost:8080/table/{number}
   Método HTTP: GET
## Parámetro:
   number: Número entero para el cual se generará la tabla de multiplicar.
   Ejemplo
   Si deseas obtener la tabla de multiplicar del número 5, realiza una solicitud GET a:
   
   http://localhost:8080/table/5

## Contribuciones
   Si deseas contribuir a este proyecto, debes hacer un fork y enviar tus cambios mediante un pull request.

## Licencia
   Autor
   Cristina Colcha

   Esta estructura es visualmente más agradable y utiliza un formato de árbol para mostrar la organización de los archivos en el proyecto. ¡Espero que te guste!



