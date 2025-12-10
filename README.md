This is a very simple demo project showing how to use pure JPA (Jakarta Persistence API) with Hibernate as the provider — without Spring Boot or Spring Data JPA.

The goal of this project is to understand the basics of:

Creating an entity
Configuring persistence.xml
Using EntityManager
Performing basic database operations

Technologies use :

Java
JPA (Jakarta Persistence 3.1)
Hibernate ORM
Maven
MySQL

How to run:

1. Update your database credentials in persistence.xml
2. Build the project:
   mvn clean package
3. Run the main class: App.java
4. A new Student entity will be persisted into your database.
