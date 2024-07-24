<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

### Lecture: Spring Core Basics

#### Introduction to the Spring Framework
- **Spring Framework** is a powerful tool for creating Java applications that makes dependency and configuration management easy.
- The main goal of Spring is to simplify the development of complex applications by providing a lightweight container that can be configured through simple POJOs.

Benefits of the Spring Framework

- Multi-tier support: Spring offers tools and support for every layer of the application, providing complete architectural flexibility.
- Using POJOs: Spring works with POJOs, which simplifies programming, reduces component coupling, and increases testability.
- Ease of integration and testing: Spring makes it easy to integrate various modules and test them by providing a set of tools for these purposes.
- Declarative Programming: Support for declarative programming allows you to implement functionality without having to write a lot of boilerplate code.
- Resource Management: Spring automates the management of resources such as factory classes and singletons.
- Flexible Configuration: The framework supports various configuration methods, including XML, annotations, and Java configuration.
- Middleware support: Spring provides extensive capabilities for working with middleware, simplifying the creation of complex applications.

#### Dependency injection and IoC (Inversion of Control)

- DI (Dependency Injection): Spring manages dependencies between components, making them easier to communicate and integrate.
- IoC (Inversion of Control): The Spring container manages the life cycle of objects, which reduces dependency and coupling of components.

#### IoC (Inversion of Control)
- IoC in Spring changes the way objects are bound.
  Instead of components creating or searching for their dependencies themselves, they get them from an external source (the Spring container).

#### Dependency Injection (DI)
- **DI** is an IoC implementation where objects provide necessary dependencies to each other through constructors, methods or fields.
- DI reduces component coupling and simplifies application testing.

#### Spring IoC-container
- **Spring IoC Container** manages the lifecycle of objects called beans, including their creation, dependency management, configuration, and destruction.

#### Beans and BeanFactory
- **Beans**: In the Spring context, beans are objects that are managed by the Spring IoC container. One of the key concepts in spring is bean. In essence, it is just an object of some class.
- **BeanFactory**: A simple container that provides basic functions for managing beans.

#### ApplicationContext
- **ApplicationContext** complements BeanFactory, adding integration with broader application context, such as for working with web applications.
- In general, 'Context' is a set of beans (objects). Turning to the context, we can get the bean (object) we need by its name, for example, or by its type, or something else.

#### Bean configuration in the Spring Framework
- **Bean Lifecycle**: Managed by Spring and includes stages such as creating, initializing, using, and destroying the bean.

#### Application configuration methods
There are three main ways to configure an application (that is, tell Spring which objects we need to work):

- using xml files/configs;
- using java configs;
- automatic configuration.

The developers arrange them in this order of priority:

- the most priority method that should be given preference is automatic configuration;
- if using automatic configuration it is not possible to correctly configure all possible beans, use Java configuration (creating objects using Java code);
- Well, the lowest priority way is the old fashioned way, using xml configs.

In addition, Spring allows you to combine these methods. For example, let Spring do everything that can be configured automatically; where you need to specify some special parameters, do it using java configs, and in addition, you can connect some legacy configs in xml format.

#### XML configurations
- Beans and their dependencies have traditionally been configured in XML files, making it easy to change the configuration without changing the source code.

#### Java configuration
- As an alternative to XML, Spring offers configuration with Java, using annotations and configuration classes to define beans.

#### Configuration with annotations
- Spring supports annotations to simplify bean configuration, such as `@Component`, `@Service`, `@Repository` and `@Controller`.

### Java configuration in Spring Framework

This is an approach to configuring a Spring container using Java instead of XML. This approach was introduced in Spring 3.0 and provides the ability to more flexibly and explicitly configure beans, their dependencies, and other aspects of the application.

### Basic Java Configuration Concepts

1. **@Configuration**: Classes annotated with `@Configuration` indicate that the class can contain beans that must be registered with the Spring container. Classes with `@Configuration` are similar to XML configuration files in Spring.

2. **@Bean**: Methods in a class with `@Configuration` annotated with `@Bean` will create objects that are managed by the Spring container. The return objects of these methods automatically become beans in the Spring context.

3. **Dependency Injection**: Dependency injection into methods with `@Bean` can be done through method arguments. Spring will automatically provide the dependencies needed to create the bean.

4. **@ComponentScan**: Allows Spring to scan the specified package for `@Component`, `@Service`, `@Repository`, `@Controller` annotations and automatically register them in the application context as beans.

5. **@Import**: Used to import other configuration classes into the current configuration class. This is useful for modularizing the configuration.

6. **@Profile**: Allows you to specify in which environment profile this configuration class or bean should be active.

7. **@PropertySource**: Used to specify the properties file that should be loaded into the context.

###Usage example

Let's look at an example configuration class that demonstrates the use of `@Configuration`, `@Bean`, and other aspects of Java configuration:

```java
@Configuration
@PropertySource("classpath:/app.properties")
public class AppConfig {

 @Bean
 public MyService myService() {
 return new MyServiceImpl();
 }

 @Bean
 public MyController myController(MyService myService) {
 return new MyController(myService);
 }
}
```

In this example:

- The `AppConfig` class is marked as `@Configuration`, making it the source of bean definitions.
- The `@PropertySource` annotation points to a property file, values from which can be injected into beans.
- The `myService` method is marked with `@Bean`, which tells Spring to create and manage a `MyServiceImpl` object.
- The `myController` method, also marked `@Bean`, injects the `MyService` dependency. Spring will automatically provide an instance of `MyService` when creating `MyController`.

Java configuration provides strong typing and refactoring convenience that is not available in XML. This makes the code easier to understand and maintain, and allows you to use the full power of the Java language to configure Spring applications.


</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

# Lesson 02

### Лекция: Основы Spring Core

#### Введение в Spring Framework
- **Spring Framework** — это мощный инструмент для создания приложений на Java, облегчающий управление зависимостями и конфигурацией.
- Основная цель Spring — упрощение разработки сложных приложений, предоставляя легковесный контейнер, который можно настроить через простые POJOs.

**POJO** (plain old Java object) - старый добрый Java-объект:
это термин, используемый для обозначения простых Java-объектов, которые не зависят от каких-либо специфических фреймворков, библиотек или технологий. 
Простыми словами, это обычные Java-классы, которые содержат поля (атрибуты) и методы (в основном геттеры и сеттеры) для работы с этими полями.

Преимущества Spring Framework:

- Мультиуровневая поддержка: Spring предлагает инструменты и поддержку для каждого уровня приложения, обеспечивая полную архитектурную гибкость.
- Использование POJO: Spring работает с POJO, что упрощает программирование, уменьшает связность компонентов и повышает их тестируемость.
- Легкость интеграции и тестирования: Spring облегчает интеграцию различных модулей и их тестирование, предоставляя набор инструментов для этих целей.
- Декларативное программирование: Поддержка декларативного программирования позволяет реализовывать функциональность без необходимости писать много шаблонного кода.
- Управление ресурсами: Spring автоматизирует управление ресурсами, такими как фабричные классы и синглтоны.
- Гибкая конфигурация: Фреймворк поддерживает различные способы конфигурации, включая XML, аннотации и Java-конфигурацию.
- Поддержка middleware: Spring предоставляет обширные возможности для работы с middleware, упрощая создание сложных приложений.

#### Внедрение зависимостей и IoC (Inversion of Control)

- DI (Dependency Injection): Spring управляет зависимостями между компонентами, упрощая их связь и интеграцию.

- IoC (Inversion of Control): Spring контейнер управляет жизненным циклом объектов, что уменьшает зависимость и связность компонентов.

#### IoC (Inversion of Control)
- IoC в Spring меняет способ связывания объектов. 
Вместо того чтобы компоненты самостоятельно создавали или искали свои зависимости, они получают их от внешнего источника (контейнера Spring).

#### Dependency Injection (DI)
- **DI** — это реализация IoC, где объекты предоставляют друг другу необходимые зависимости через конструкторы, методы или поля.
DI уменьшает связность компонентов и упрощает тестирование приложений.

#### Spring IoC-container
- **Spring IoC Container** управляет жизненным циклом объектов, называемых **бинами** (см. ниже 👇), включая их создание, управление зависимостями, конфигурацию и уничтожение.

#### Beans и BeanFactory
- **Beans**: В контексте Spring бины — это объекты, которыми управляет Spring IoC контейнер. 
Одно из ключевых понятий в спринге — это бин. По сути, это просто **объект** какого-то класса.

- **BeanFactory**: Простейший контейнер, предоставляющий основные функции для управления бинами.

#### ApplicationContext
- **ApplicationContext** является дополнением к BeanFactory, добавляя интеграцию с более широким контекстом приложения, например, для работы с веб-приложениями.
- Вообще 'Контекст' — это набор бинов (объектов). Обращаясь к контексту — мы можем получить нужный нам бин (объект) по его имени например, или по его типу, или еще как-то.

#### Конфигурация бинов в Spring Framework
- **Bean Lifecycle**: Управляется Spring и включает этапы, такие как создание, инициализация, использование и уничтожение бина.

#### Способы конфигурации приложения
Существует **три основных способа конфигурации приложения** (то-есть, указания спрингу какие именно объекты нам нужны для работы):

- при помощи xml файлов/конфигов;
- при помощи java-конфигов;
- автоматическая конфигурация.

Разработчики выстраивают их в таком порядке приоритетности:

- наиболее приоритетный способ, которому стоит отдавать предпочтение — это автоматическая конфигурация;
- если при помощи автоматической конфигурации нет возможности правильно настроить все возможные бины — использовать джава-конфигурацию (создание объектов используя джава код);
- ну и самый низкоприоритетный способ — это по-старинке, используя xml конфиги.

Кроме того, Spring позволяет комбинировать эти способы. Например, все то, что может быть настроено автоматически — пусть Spring сделает сам, там где надо указать какие-то особые параметры — сделать при помощи java-конфигов, и кроме того, можно подключить какие-то легаси конфиги в xml формате.

#### XML-конфигурации
- Бины и их зависимости традиционно конфигурировались в XML-файлах, что позволяет легко изменять конфигурацию без изменения исходного кода.

#### Java конфигурация
- В качестве альтернативы XML, Spring предлагает конфигурацию с помощью Java, используя аннотации и классы конфигурации для определения бинов.

#### Конфигурация с аннотациями
- Spring поддерживает аннотации для упрощения конфигурации бинов, такие как `@Component`, `@Service`, `@Repository` и `@Controller`.

### Java-конфигурация в Spring Framework

Это подход к конфигурации Spring контейнера с использованием Java вместо XML. Этот подход был введен в Spring 3.0 и предоставляет возможность более гибко и явно конфигурировать бины, их зависимости, а также другие аспекты приложения.

### Основные концепции Java-конфигурации

1. **@Configuration**: Классы, аннотированные с `@Configuration`, указывают, что данный класс может содержать бины, которые должны быть зарегистрированы в Spring контейнере. Классы с `@Configuration` аналогичны XML-файлам конфигурации в Spring.

2. **@Bean**: Методы в классе с `@Configuration`, аннотированные с `@Bean`, будут создавать объекты, которые управляются Spring контейнером. Возвращаемые объекты этих методов автоматически становятся бинами в Spring контексте.

3. **Внедрение зависимостей**: Внедрение зависимостей в методы с `@Bean` можно осуществлять через аргументы метода. Spring автоматически предоставит зависимости, необходимые для создания бина.

4. **@ComponentScan**: Позволяет Spring сканировать указанный пакет на наличие аннотаций `@Component`, `@Service`, `@Repository`, `@Controller` и автоматически регистрировать их в контексте приложения как бины.

5. **@Import**: Используется для импорта других конфигурационных классов в текущий конфигурационный класс. Это полезно для модульной организации конфигурации.

6. **@Profile**: Позволяет указать, в каком профиле окружения должен быть активен данный конфигурационный класс или бин.

7. **@PropertySource**: Используется для указания файла свойств, который должен быть загружен в контекст.

### Пример использования

Давайте рассмотрим пример конфигурационного класса, который демонстрирует использование `@Configuration`, `@Bean`, и других аспектов Java-конфигурации:

```java
@Configuration
@PropertySource("classpath:/app.properties")
public class AppConfig {

    @Bean
    public MyService myService() {
        return new MyServiceImpl();
    }

    @Bean
    public MyController myController(MyService myService) {
        return new MyController(myService);
    }
}
```

В этом примере:

- Класс `AppConfig` помечен как `@Configuration`, что делает его источником определений бинов.
- Аннотация `@PropertySource` указывает на файл свойств, значения из которого можно инжектировать в бины.
- Метод `myService` помечен `@Bean`, что говорит Spring о том, что нужно создать и управлять объектом `MyServiceImpl`.
- В метод `myController`, также помеченный `@Bean`, внедряется зависимость `MyService`. Spring автоматически обеспечит передачу экземпляра `MyService` при создании `MyController`.

Java-конфигурация предоставляет сильную типизацию и удобство рефакторинга, которые недоступны в XML. Это делает код более простым для понимания и поддержки, а также позволяет использовать всю мощь языка Java для конфигурирования приложений Spring.


</details>