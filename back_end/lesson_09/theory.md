<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

# Lesson 8

Due to the cumbersome configuration of dependencies, configuring Spring for enterprise applications has become a tedious and error-prone task.

This is especially true for applications that use multiple third-party libraries.

Every time you create a new enterprise Java application based on Spring, you have to repeat the same routine steps:

1. Import the necessary Spring modules depending on the type of application (Spring MVC, Spring JDBC, Spring ORM, etc.).

2. Add the web container library (for web applications).

3. Import the necessary third-party libraries (e.g. Hibernate, Jackson), taking into account their compatibility with the Spring version.

4. Configure DAO components such as data sources and transaction management.

5. Configure web layer components such as resource manager and view resolver.

6. Define a class that will load all the necessary configurations.

Spring Boot aims to simplify this process by providing developers with convenient tools to automate the configuration and creation of Spring-based applications.

It offers convenient tools
- dependency management,
- automatic configuration
- built-in servlet containers,
  which significantly speeds up and simplifies the process of developing and deploying applications.

The simplicity of dependency management in Spring Boot is achieved through the use of special tools, such as starters and automatic dependency management.

1. **Starters**: Spring Boot comes with a large number of pre-configured sets of dependencies, called starters. Each starter is a specific set of libraries and tools needed to develop a certain type of application or solution. For example, there are starters for web applications, data access, testing, etc. The developer only needs to add the necessary starters to the configuration file (pom.xml for Maven or build.gradle for Gradle), and Spring Boot will automatically connect all the necessary dependencies.

2. **Automatic dependency management**: Spring Boot uses dependency management principles by default, which allows you to significantly reduce the amount of configuration code. For example, if you add a dependency on a database, Spring Boot will automatically detect and add to the project not only the libraries for working with the database, but also the configuration for establishing a connection to the database. This frees the developer from the need to explicitly specify each dependency and their configuration, reducing time and simplifying the development process.

Thus, thanks to starters and automatic dependency management, developers can focus on writing the business logic of the application, minimizing the time spent on routine dependency management tasks.

Automatic configuration in Spring Boot is a mechanism that allows an application to automatically configure itself based on the components and settings it contains, without the need for explicit configuration by the developer.

Here's how it works:

1. **Configuration conventions**: Spring Boot uses certain configuration conventions based on the structure of the project and the presence of certain components in it. For example, if you have classes annotated with `@Controller`, `@Service`, `@Repository`, or `@Component`, Spring Boot will automatically detect them and configure them accordingly.

2. **Automatic component scanning**: Spring Boot automatically scans your application packages for classes annotated with special annotations and automatically registers them as Spring beans. This eliminates the need to explicitly specify these beans in configuration files.

3. **Smart guessing**: Spring Boot can make smart guesses about how to configure components based on the information available. For example, if you add a database dependency, Spring Boot will automatically create and configure a `DataSource` for you using the settings specified in the configuration file.

4. **Built-in defaults**: Spring Boot comes with a set of default settings for various technologies and components. This means that in most cases you can start developing your application without having to explicitly specify the configuration, as Spring Boot will already provide reasonable defaults.

With automatic configuration, developers can focus on developing the business logic of the application without spending a lot of time manually setting up and configuring the Spring infrastructure.

The built-in application server or servlet container support in Spring Boot is the ability to use built-in application servers without the need for explicit configuration and installation.

The main aspects of the built-in application server support in Spring Boot are:

1. **Built-in servlet containers**: Spring Boot comes with all the

</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

# Lesson 8

Из-за громоздкой конфигурации зависимостей настройка Spring для корпоративных приложений стала утомительной и подверженной ошибкам задачей.
Особенно это относится к приложениям, использующим несколько сторонних библиотек.

При создании каждого нового корпоративного Java-приложения на базе Spring приходится повторять одни и те же рутинные шаги:

1. Импортировать необходимые Spring-модули в зависимости от типа приложения (Spring MVC, Spring JDBC, Spring ORM и т. д.).
2. Добавить библиотеку веб-контейнеров (для веб-приложений).
3. Импортировать необходимые сторонние библиотеки (например, Hibernate, Jackson), при этом учитывая их совместимость с версией Spring.
4. Конфигурировать компоненты DAO, такие как источники данных и управление транзакциями.
5. Конфигурировать компоненты веб-слоя, такие как диспетчер ресурсов и view resolver.
6. Определить класс, который загрузит все необходимые конфигурации.

Spring Boot призван упростить этот процесс, предоставляя разработчикам удобные инструменты для автоматизации настройки и создания приложений на базе Spring.
Он предлагает удобные средства
- управления зависимостями,
- автоматическую конфигурацию
- встроенные контейнеры сервлетов,
  что значительно ускоряет и упрощает процесс разработки и развертывания приложений.

Простота управления зависимостями в Spring Boot достигается за счёт использования специальных инструментов, таких как стартеры (starters) и автоматическое управление зависимостями.

1. **Стартеры (starters)**: Spring Boot поставляется с большим количеством предварительно сконфигурированных наборов зависимостей, называемых стартерами. Каждый стартер представляет собой определенный набор библиотек и инструментов, необходимых для разработки определенного типа приложения или решения. Например, есть стартеры для веб-приложений, доступа к данным, тестирования и т. д. Разработчику достаточно добавить нужные стартеры в файл конфигурации (pom.xml для Maven или build.gradle для Gradle), и Spring Boot автоматически подключит все необходимые зависимости.

2. **Автоматическое управление зависимостями**: Spring Boot использует принципы управления зависимостями по умолчанию, что позволяет значительно сократить объем конфигурационного кода. Например, если вы добавляете зависимость на базу данных, Spring Boot автоматически определит и добавит в проект не только библиотеки для работы с базой данных, но и конфигурацию для установки соединения с базой данных. Это освобождает разработчика от необходимости явно указывать каждую зависимость и их конфигурацию, сокращая время и упрощая процесс разработки.

Таким образом, благодаря стартерам и автоматическому управлению зависимостями, разработчики могут сосредоточиться на написании бизнес-логики приложения, минимизируя время, затрачиваемое на рутинные задачи по управлению зависимостями.

Автоматическая конфигурация в Spring Boot представляет собой механизм, который позволяет приложению автоматически настраивать себя на основе имеющихся в нем компонентов и настроек, без необходимости явного указания конфигурации разработчиком.

Вот как это работает:

1. **Соглашения по конфигурации**: Spring Boot использует определенные соглашения по конфигурации, основанные на структуре проекта и наличии в нем определенных компонентов. Например, если вы имеете классы, помеченные аннотациями `@Controller`, `@Service`, `@Repository` или `@Component`, Spring Boot автоматически обнаружит их и настроит соответствующим образом.

2. **Автоматическое сканирование компонентов**: Spring Boot автоматически сканирует пакеты вашего приложения в поисках классов, помеченных специальными аннотациями, и автоматически регистрирует их как компоненты Spring. Это позволяет избежать необходимости явно указывать эти компоненты в конфигурационных файлах.

3. **Умное предположение**: Spring Boot умеет делать умные предположения о том, как нужно настроить компоненты на основе имеющейся информации. Например, если вы добавляете зависимость на базу данных, Spring Boot автоматически создаст и настроит `DataSource` для вас, используя параметры, указанные в файле конфигурации.

4. **Встроенные настройки по умолчанию**: Spring Boot поставляется с набором настроек по умолчанию для различных технологий и компонентов. Это означает, что в большинстве случаев вы можете начать разработку приложения без необходимости явно указывать конфигурацию, так как Spring Boot уже предоставит разумные значения по умолчанию.

Благодаря автоматической конфигурации разработчики могут сосредоточиться на разработке бизнес-логики приложения, не тратя много времени на ручную настройку и конфигурирование инфраструктуры Spring.

Встроенная поддержка сервера приложений или контейнера сервлетов в Spring Boot представляет собой возможность использования встроенных серверов приложений без необходимости явного настройки и установки.

Основные аспекты встроенной поддержки сервера приложений в Spring Boot:

1. **Встроенные контейнеры сервлетов**: Spring Boot поставляется с предварительно сконфигурированными встроенными серверами приложений, такими как Tomcat, Jetty или Undertow. Это означает, что вам не нужно самостоятельно устанавливать или настраивать сервер приложений, Spring Boot автоматически обнаружит и сконфигурирует его в зависимости от выбранной зависимости.

2. **Простота использования**: Для запуска приложения на встроенном сервере приложений вам просто необходимо добавить соответствующую зависимость в файл конфигурации (pom.xml для Maven или build.gradle для Gradle). Spring Boot автоматически обнаружит эту зависимость и настроит встроенный сервер приложений для вас.

3. **Разработка и развертывание**: Использование встроенного сервера приложений делает процесс разработки и развертывания приложений проще и более гибким. Вам не нужно беспокоиться о настройке и управлении внешним сервером приложений, что сокращает время и усилия, необходимые для разработки и тестирования приложений.

4. **Поддержка различных серверов приложений**: Spring Boot поддерживает несколько встроенных серверов приложений, что позволяет выбирать подходящий сервер в зависимости от требований вашего приложения или личных предпочтений.

Таким образом, встроенная поддержка сервера приложений в Spring Boot упрощает разработку, тестирование и развертывание приложений, обеспечивая гибкость и удобство использования.


</details>