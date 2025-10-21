## Alcance del proyecto
El objetivo principal de esta práctica es diseñar e implementar las clases del modelo de dominio para un sistema básico de E-commerce, siguiendo buenas prácticas de programación orientada a objetos (POO) y principios de encapsulamiento.
El alcance incluye:
•	Creación de la estructura del proyecto con Spring Boot.
•	Implementación de las clases de modelo (Person, Customer, Product, SaleOrder, OrderLine, Payment).
•	Inclusión de enumeraciones (OrderStatus, PaymentMethod, CustomerType, TaxIdType).
•	Aplicación de encapsulamiento, constructores, getters, setters y toString().
•	Verificación mediante un método main o prueba simple.
•	Documentación del proceso de desarrollo.
### Dependencias del Proyecto
El proyecto fue creado utilizando Spring Initializr con las siguientes dependencias:
•	spring-boot-starter-web
•	spring-boot-devtools
•	mysql-connector-j
•	lombok
### Implementación del paquete model
Se creó el paquete com.dasudla.crm_api.model, donde se incluyeron todas las clases correspondientes al diagrama de clases UML:
### Verificación
Para probar el correcto funcionamiento, se creó un método main en una clase de prueba temporal
 
