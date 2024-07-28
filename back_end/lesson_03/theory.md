<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

# Lesson 03

## Principles of Clean Architecture

Clean Architecture is often represented as concentric circles:
* Entities: Core business objects and rules that do not depend on other elements.
* Variant of use (Use Cases): Provides business practice for a specific situation of use and realize the logic of the program.
* Adapters for interfaces (interface adapters): contains the logic for converting data to levels Also, adapt the data for the implementation in different levels or in other systems.
* Freelancers and drivers (Frameworks and Drivers): Different languages, other freedrivers and instruments тебе. This also includes a mobile interface, based on data, web-free work and other technologies.

**Dependency Principle**
One of the key principles of Clean Architecture is the Dependency Principle, which states that the direction of dependency in code should go to great high-level politicians. This shows that the details of the realization can be seen from abstraction, not a single object.

Clean Architecture in Practice: 1. Entities: Core business objects and rules that do not depend on external elements.
2. Repositories: Provide storage and storage.
3. Services: Provide logic for converting data to levels that adapt Data for protection in different areas or other systems.
4. Controllers: Included in this mobile interface.

## Annotations Spring in the world Java developers, annotations Spring Framework plays a key role in the control Visualization and configuration app.

### @Component The `@Component` annotation is intended for the description of this component by Spring. Components of automatic detection are excellent for scanning the boat in. This annotation is based on the spring formation of the bin (bean) for this class and control it in the color blue (default).
**Singleton** is a design pattern in programming that ensures that a class has only one instance and provides a global point of access to this example. In Java, this pattern is used to control access to resources that should be unique to the entire program, such as managing a database connection.

Primer: ```java @Component public class MyComponent { // ... } ``` ### @Autowired `@Autowired` indicates that automatic injection This is the production of a local designer, pole, setter or method.
Spring occurs, even if the example occurs, it is sent to the container эту.

Example: ```java @Component public class MyService { private MyRepository repository;

@Autowired public MyService(MyRepository repository) { this.repository = repository;
} } ``` ### @Qualifier `@Qualifier` specifies which bean should be injected when there are high school candidates. One should remember the fact that the concrete name of Bina is clear for the antecedent.

Example: ```java @Autowired @Qualifier("specificRepository") private MyRepository repository;
``` ### @Value Abstract `@Value` is valid for the international registration of property files in Poland great. This can be done for the purpose of the configuration, which is the menu, outside of the code.

Example: ```java @Component public class MyComponent { @Value("${my.value}") private String value;
} ``` The `@Autowired` annotation may be used for the design, this is the case for dependency injection in Spring.
If you use `@Autowired` on the designer, Spring will be automatically installed , what this designer does.
After the primer, `MyRepository` connects to the constructor `MyService`.

When `@Autowired` is applied to a constructor, there is no need to `@Autowired` on individual fields (e.g. `private MyRepository repository;`), since the dependency is already injected via the constructor.

This is one of the prescriptive methods of obtaining the information in Spring, after school Supports the immutability of components and ensures testing.

Regarding constructor removal: if your class has only one constructor, Spring since version 4.3 supports automatic dependency injection without the need to explicitly specify `@Autowired` to the designer.

This means that if you are a designer, Spring is automatic If you are interested in the system, you can choose `@Autowired`.

Primer without `@Autowired` for the designer and without the designer default field injection): ```java @Component public class MyService { @Autowired private MyRepository repository;
} ``` However, using a constructor to inject dependencies (constructor injection) is the preferred approach, as it ensures that dependencies are immutable and simplifies testing of the component by allowing all dependencies to be passed through the constructor, making all required dependencies obvious For the subsequent exemplary class.

</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

# Lesson 03

## Принципы Чистой архитектуры

Чистая архитектура часто представляется в виде концентрических кругов:
* Энтити (Entities): Основные бизнес-объекты и правила, не зависящие от внешних элементов.
* Варианты использования (Use Cases): Определяют бизнес-правила для конкретного случая использования и реализуют логику приложения.
* Адаптеры интерфейсов (Interface Adapters): Содержат логику преобразования данных между уровнями, адаптируя данные для использования в верхних слоях или внешних системах.
* Фреймворки и драйверы (Frameworks and Drivers): Внешний слой, содержащий фреймворки и инструменты. Этот слой также включает пользовательский интерфейс, базы данных, веб-фреймворки и другие технологии.

**Принцип зависимости**
Одним из ключевых принципов Чистой архитектуры является принцип зависимости, который гласит, что направление зависимости в коде должно идти к более высокоуровневым политикам. Это означает, что детали реализации должны зависеть от абстракций, а не наоборот.

Чистая архитектура на практике:
1. Сущности (Entities): Основные бизнес-объекты и правила, не зависящие от внешних элементов.
2. Репозитории (Repositories): Определяют способы хранения и извлечения сущностей.
3. Сервисы (Services): Содержат логику преобразования данных между уровнями, адаптируя данные для использования в верхних слоях или внешних системах.
4. Контроллеры (Controllers): Включает в себя пользовательский интерфейс.

## Аннотации Spring 

В мире Java разработки, аннотации Spring Framework играют ключевую роль в управлении зависимостями и конфигурацией приложения.

### @Component

Аннотация `@Component` используется для указания того, что класс является компонентом Spring. Компоненты автоматически обнаруживаются благодаря сканированию путей классов. Эта аннотация говорит Spring создать бин (bean) для такого класса и управлять им как синглтоном (по умолчанию).
**Синглтон** - это паттерн проектирования в программировании, который гарантирует, что у класса есть только один экземпляр, и предоставляет глобальную точку доступа к этому экземпляру. В Java этот паттерн используется для управления доступом к ресурсам, которые должны быть единственными для всей программы, например, управление подключением к базе данных.

Пример:
```java
@Component
public class MyComponent {
    // ...
}
```

### @Autowired

`@Autowired` обозначает, что автоматическое внедрение зависимостей должно произойти через указанный конструктор, поле, сеттер или метод.
Spring решает, какой экземпляр внедрить, основываясь на доступных бинах в контексте.

Пример:
```java
@Component
public class MyService {
    private MyRepository repository;

    @Autowired
    public MyService(MyRepository repository) {
        this.repository = repository;
    }
}
```

### @Qualifier

`@Qualifier` уточняет, какой именно бин должен быть внедрен, когда имеется несколько кандидатов. Она помогает избежать путаницы, указывая конкретное имя бина для внедрения.

Пример:
```java
@Autowired
@Qualifier("specificRepository")
private MyRepository repository;
```

### @Value

Аннотация `@Value` используется для внедрения значений из property-файлов в поля класса. Это может быть полезно для внедрения настроек конфигурации, которые могут меняться вне кода.

Пример:
```java
@Component
public class MyComponent {
    @Value("${my.value}")
    private String value;
}
```

Аннотация `@Autowired` может использоваться для конструктора, что является одним из способов внедрения зависимостей в Spring.
Когда вы используете `@Autowired` на конструкторе, Spring автоматически внедряет зависимости, которые этот конструктор требует.
В нашем примере, `MyRepository` внедряется через конструктор `MyService`.

Когда `@Autowired` применяется к конструктору, нет необходимости ставить `@Autowired` на отдельные поля (например, `private MyRepository repository;`), так как зависимость уже внедряется через конструктор.
Это один из предпочтительных методов внедрения зависимостей в Spring, поскольку он поддерживает иммутабельность компонентов и облегчает тестирование.

По поводу удаления конструктора: если ваш класс имеет только один конструктор, Spring с версии 4.3 поддерживает автоматическое внедрение зависимостей без необходимости явно указывать `@Autowired` на конструкторе.
Это означает, что если у вас только один конструктор, Spring автоматически использует его для внедрения зависимостей, и вы можете опустить `@Autowired`.

Пример без `@Autowired` на конструкторе и без явного конструктора (используется конструктор по умолчанию и внедрение в поле):

```java
@Component
public class MyService {
    @Autowired
    private MyRepository repository;
}
```

Однако, использование конструктора для внедрения зависимостей (конструкторное внедрение) является предпочтительным подходом, так как это обеспечивает неизменность зависимостей и упрощает тестирование компонента, позволяя передавать все зависимости через конструктор, что делает очевидными все требуемые зависимости для создания экземпляра класса.


</details>