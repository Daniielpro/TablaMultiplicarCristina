# Usa una imagen base de Java 17
FROM openjdk:17-slim

# Establece el directorio de trabajo
WORKDIR /app

# Copia el archivo .jar al contenedor
COPY target/tabla-multiplicar-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto en el que se ejecutará el servidor
EXPOSE 8080

# Comando para ejecutar el programa
CMD ["java", "-jar", "app.jar"]
