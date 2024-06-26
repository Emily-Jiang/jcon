# MicroProfile generated Application

## Introduction

MicroProfile Starter has generated this MicroProfile application for you.

The generation of the executable jar file can be performed by issuing the following command


    mvn clean package

This will create an executable jar file **jcon.jar** within the _target_ maven folder. This can be started by executing the following command

    java -jar target/jcon.jar



### Liberty Dev Mode

During development, you can use Liberty's development mode (dev mode) to code while observing and testing your changes on the fly.
With the dev mode, you can code along and watch the change reflected in the running server right away; 
unit and integration tests are run on pressing Enter in the command terminal; you can attach a debugger to the running server at any time to step through your code.


    mvn liberty:dev





To launch the test page, open your browser at the following URL

    http://localhost:9080/index.html  


## Next Step

Leave the server-a server running and proceed with the instructions contained in `demo/service-b/readme.md`.


## Specification examples

By default, there is always the creation of a JAX-RS application class to define the path on which the JAX-RS endpoints are available.

Also, a simple Hello world endpoint is created, have a look at the class **HelloController**.

More information on MicroProfile can be found [here](https://microprofile.io/)


### JWT Auth

Using the OpenId Connect JWT token to pass authentication and authorization information to the JAX-RS endpoint. Specification [here](https://microprofile.io/project/eclipse/microprofile-rest-client)

Have a look at the **TestSecureController** class which calls the protected endpoint on the secondary application.
The **ProtectedController** (secondary application) contains the protected endpoint since it contains the _@RolesAllowed_ annotation on the JAX-RS endpoint method.

The _TestSecureController_ code creates a JWT based on the private key found within the resource directory.
However, any method to send a REST request with an appropriate header will work of course. Please feel free to change this code to your needs.

### Rest Client

A type safe invocation of HTTP rest endpoints. Specification [here](https://microprofile.io/project/eclipse/microprofile-rest-client)

The example calls one endpoint from another JAX-RS resource where generated Rest Client is injected as CDI bean.

### GraphQL

GraphQL is a remote data query language initially invented by Facebook and now evolving under it's own specification and community. MicroProfile GraphQL provides annotation-based APIs for building GraphQL services in Java. The specification is available [here](https://microprofile.io/project/eclipse/microprofile-graphql).

The example contains a limited version of the SuperHero example from the TCK and shows the Schema file for it. You can think of it as something a comic-book government agency might use to keep track of Super Heroes.


To get started, run the sample, then browse to: http://localhost:9080/graphql-ui - you can then issue a query of all known super heroes like this:
```
query allHeroes {
    allHeroes {
        name
        primaryLocation
        superPowers
        realName
    }
}
```

