# ejemploJava_Feign
Es un repositorio de ejemplo para una aplicación desarrollada en java con Feign y EurekaServer con springCloud y Springboot
-Son 3 aplicaciones
La primera de productos es un api que ocupa la base de datos embebida de spring y añado algunos campos y los mando a listar con el controller en el localhost:8001
La segunda consume esa aplicación con Feign ocupando los endpoints de la primera aplicación corre en el puerto 9001
La tercera es el eureka server que registra ambas apis y en las otras dos aplicaciones se ven registrados con el enableEurekaclient para que se puedan registrar
en las propiedades viene especificado el eurekaZone donde indico el puerto donde esta corriendo eureka.
