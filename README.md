# Proyecto Maven01
Correspondiente a la 2º practica Maven de EGC
Se han añadido diferentes dependencias tanto del repositorio de maven (https://mvnrepository.com/) como externas.

La hemos añadido mediante la incorparación de las etiquetas ```<dependeny>``` en pom.xml y la ejecución de los comandos:

- ```mvn compile``` para compilar y descargas las dependencias necesarias rederenciadas en el pom.xml

- ```mvn clean package``` para borrar el directorio target y realizar automaticamente el "mvn package" para empaquetar el proyecto en: "proy1-1.0-SNAPSHOT.jar"

### Dependencias

- Del repositorio Maven:
  1. **log4j** - Permite escribir mensajes de registro dejando constancia de una determinada transacción en tiempo de ejecución
  2. **org.patterntesting** - Permite y proporciona las anotaciones y las clases base para el marco de pruebas PatternTesting (verificar Arquitectura/Diseño/Mejores)
  3. **org.springframework** - Proporciona un modelo de programación y configuración completa.

- Externas al repositorio Maven:
  1. **ldapjdk** - Desde ```/src/lib/ldapjdk_4.1.jar``` y usada para el rendimiento y seguridad de Netscape.
