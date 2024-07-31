
<h3 style="text-align: center; padding-bottom: 14px">2024-02-02</h3>

# Lesson plan No. 4 07/29/2024

## What we learned in the last lesson:
1. Principles of Clean Architecture and an example of its implementation in practice.

2. Spring annotations:
- @Component,
- @Repository,
- @Service,
- @Qualifier,
- @Value.

## Topic of today's lesson:

### Interaction on the Internet, HTTP protocol and its use
1. HTML forms as a means of entering information.
2. HTTP protocol.
3. Client-server interaction. How data gets from an HTML form to the backend.
4. Installing Tomcat and integrating into the IDE.
5. Request processing by servlets.

## Practice

1. Installing Tomcat and integrating into the IDE.
   https://tomcat.apache.org/
   Choose the latest stable version: Apache Tomcat 10
   https://tomcat.apache.org/download-10.cgi

2. Create a new project using the Maven builder and its pom.xml configuration file
   Necessary dependencies:
   <dependencies>
   <dependency>
   <groupId>jakarta.servlet</groupId>
   <artifactId>jakarta.servlet-api</artifactId>
   <version>6.0.0</version>
   <scope>provided</scope>
   </dependency>
   <dependency>
   <groupId>com.fasterxml.jackson.core</groupId>
   <artifactId>jackson-databind</artifactId>
   <version>2.16.0</version>
   </dependency>
   </dependencies>

2. Processing the http request with servlets:
- writing a Car application

___

# План занятия №4 29.07.2024

## Что мы узнали на прошлом занятии:
1. Принципы Чистой архитектуры и пример ее реализации на практике:
Сущности } Репозиторий } Сервисы } Контроллер

- сущности затрагиваем по минимуму
- Репозитории -> хранилище для Сущностей -> подключение к СУБД
- Сервисы -> бизнес-логика, прослойка между Репозиторий и Контроллер
- Контроллер -> это лицо приложения перед Пользователем

2. Аннотации Spring: 
- @Component - это компонент Spring 
- @Autowired - " ... "
- @Repository - это тоже аннотация Spring 
- @Service  - это тоже аннотация Spring
- @Qualifier - это тоже аннотация Sprin, позволяет выбрать реализацию имлементации
- @Value - позволяет вытащить атрибут из окружения приложения, из файла application.properties

## Тема сегодняшнего занятия:

### Взаимодействие в сети Internet, HTTP - протокол и его использование
1. HTML-формы как средство ввода информации.
2. Протокол HTTP.
3. Клиент-серверное взаимодействие. Как данные попадают из HTML-формы на бэкенд.
4. Установка Tomcat и интеграция в IDE.
5. Обработка запроса сервлетами.


## Практика

1. Установка Tomcat и интеграция в IDE.
   https://tomcat.apache.org/ 
Выбираем стабильную последнюю версию: Apache Tomcat 10
   https://tomcat.apache.org/download-10.cgi

2. Создание нового проекта с использованием сборщика Maven и его файла конфигурации pom.xml
Необходимые зависимости:
   <dependencies>
        <dependency>
            <groupId>jakarta.servlet</groupId>
            <artifactId>jakarta.servlet-api</artifactId>
            <version>6.0.0</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.16.0</version>
        </dependency>
    </dependencies>

3. Обработка http-запроса сервлетами:
- пишем приложение Car