# Spring Dependency Injection

This guide will walk you through the basics of Spring Dependency Injection.

## The Age of Dependant Technologies

Dependency injection is a very nuanced technique that we actually utilize every day in the analog world. 
For example: The archaic telephone required plastic or metal buttons in order to dial a destination telephone.
This hypothetical phone didn't care what the buttons represent - number, letters, shapes, etc - It just needs
them to interface the underlaying communication system. these days, that button layout is a flat 
sliver of glass with some haptic motors and touch sensors to 'feel' our fingertips on virtual buttons.

It is up to the developer to decide how a telephone interacts with its buttons, be it metal, plastic, glass 
or even exposed contacts. Dependency Injection represents the collaboration of buttons to telephone; thus, 
the telephone depends on buttons - buttons are a dependency of the telephone - but not the other way around.

In Hollwood we call this idea 'dont call us, we'll call you'. It means that DI ultimately resolves when
an object is ready by collecting it's dependencies, and all it's dependencies dependencies Until the full
graph of dependencies is met.

**_NOTE**_: Although a telephone makes calls, the calls themselves are not dependants of the phone. The telephone is merely producing the operation of a phone call.

## Part of the new Tech Stack

DI grants us the ability to compose an object of any complexity, and expect that components it needs will be
fulfilled at least when needed. Some component A required a component B, and component B requires another component C. The DI system is going to start at the edge component - C, for which B is produced, then give rise to an A. The logical operation looks a little like the following graph:

[Component A] <- [Component B] <- [Component C]

This is called a dependency graph. and forms the basis of any DI system that can handle non/trivial dependency relationships such as the above scenario. It is because of this, that frameworks like Spring provide such value. Behind the scenes, Spring implements a powerful dependency graph fulfillment system which ensures the state of your application before it goes live.

## Dependency Injection in practice

Because we are talking about Spring, and since Spring is written largely in Java, we will use Object Oriented design principles going forward. We want to collect objects by constructing them and feeding them to their upstream dependants; this lets

what ISNT dependency injection:
Graph optimizer, Instance verification, object compositing.
What IS dependency Injection:
Seperation of Concerns, Dependency graph compositioning,



core principals  are separation of concerns, reduce coupling, increased testability
when its implemented you interface with 
3 main ways to use DI: Constructor Injection, Setter Injection, reflection Injection.

At the heart of the Spring Framework, 
Spring's Inversion of Control (IoC) container provides the dependency injection (DI) support to your applications
that enables you to configure and integrate application and infrastructure components together (see
Figure). Through IoC, your applications may achieve a low-level of coupling, because all of the bean
configuration can be specified in terms of IoC idioms (such as property collaborators and constructors).
Meanwhile, most if not all of your application’s bean lifecycle (construction to destruction) may be
managed from within the container. This enables you to declare scope – how and when a new object
instance gets created, and when it gets destroyed. For example, the container may be instructed that a
specific bean instance be created only once per thread, or that, upon destruction, a database bean may
disconnect from any active connections. Through requests to the Spring IoC container, a new bean may
either get constructed or a singleton bean may get passed back to the requesting bean. Either way, this is
a transparent event that is configured along with the bean declaration.## Bean Injection

Diagram of the IoC
`Spring Container -> Component, [Dependency -> Component]`

Within the Spring framework are two packages: org.springframework.beans and
org.springframework.context that expose the core functionality of the IoC container. The
org.springframework.beans.factory.BeanFactory interface is designed to expose the basic functionality
of any Spring container, and thus provides basic lifecycle methods for bean initialization and
destruction. The org.springframework.context.ApplicationContext is a sub-interface of the
BeanFactory, and offers more powerful features, such as Spring AOP integration, message resource
handling, and further sub-interfaces, such as the
org.springframework.web.context.WebApplicationContext used in web applications.

The Spring Container supports loading application using XML, JavaBeans, and newer Builder tools.
Although XML is not deprecated, it is legacy, and is not advisable unless your needs reuqire it.
The typical method today is JavaConfig. This means configuration is exposed throughout your code
and processed

## Application Events

https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.spring-application.application-events-and-listeners
