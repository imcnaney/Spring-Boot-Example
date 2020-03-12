# Spring-Boot-Example
Spring Boot Restful API example with Controllers, Services, Repositories, Entities, Hibernate, JPA.  It uses the in-memory H2 database, so you don't need to stand up a separate db.  If you want to do that you'll have to update the configuration in src/main/resources/application.properties.

The purpose of this example is to show how the pieces fit together, so I've ignored things like error handling.  Spring Boot provides a default exception handler that's adequate for demonstration.  You can see what it does if you try to GET a non-existent Foo by ID.

The API handling entry point is in FooController.java, so start tracing execution from there.

You can launch the server by running `./gradlew bootRun` from the project root.

Instructions to POST and GET using curl are in the json directory's readme.
