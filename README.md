# Spring Dependency Injection

This guide will walk you through the basics of Spring Dependency Injection.

## The Inversion of Control Container

The Inversion of Control (IoC) container provides the dependency injection support to your applications
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
