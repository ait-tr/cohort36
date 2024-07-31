
<h3 style="text-align: center; padding-bottom: 14px">2024-02-02</h3>

# Lesson plan No. 5 07/31/2024

## What we learned in the last lesson:
1. Spring annotations:
- @Component is a Spring component
- @Autowired is " ... " (automatic dependency injection)
- @Repository is also a Spring annotation
- @Service is also a Spring annotation
- @Qualifier is also a Sprin annotation, allows you to select the implementation of the implementation
- @Value - allows you to pull an attribute from the application environment, from the application.properties file

2. Interaction on the Internet, HTTP protocol and its use

* HTTP is ...
* JSON is ...
* endpoint is ...

Methods for http requests:
* ...
* ...
* ...
* ...

Execution log:
1. Installing Tomcat - download the latest version, unzip it to an accessible directory, for example C:\Tomcat\
   To run, run the terminal and run C:\Tomcat\bin\startup.bat (for Mac, run ./startup.sh)
   To stop the server C:\Tomcat\bin\shutdown.bat (for Mac, run ./shutdown.sh)

Instructions for starting Tomcat on Windows - https://remontka.pro/environment-variables-windows/
Add a variable to the LOWER window (System variables)

2. Create a new project using the Maven assembler:
   Language - Java, Build system - Maven
3. Supplement the pom.xml file with dependencies on jackson (working with json) and jakarta (processing http requests):
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
4. Add the line

<packaging>war</packaging>

5. Create packages and classes according to the application architecture
* domain - Car
* repository - CarRepository(i), CarRepositoryMap
* service - CarService(i), CarServiceImpl
* controller - SarServlet (http request handler)
6. Create a webapp folder, in it a WEB-INF folder, in it a web.xml file
   In this file we describe the DESCRIPTOR, which determines the processing of http requests (req, resp).
7. Open the Maven tab in IntelliJ IDEA, select Lifecycle, double click on package - the war archive is built and goes to the target folder
8. Rename the archive to ROOT.war and copy it to the webapps folder in the Tomcat directory. Tomcat automatically unzips and is ready to work with the application.
9. Launch the browser, go to the address
   http://localhpst:8080
   make a request from the browser address bar
   http://localhpst:8080/cars
   Get a list of cars available in the repository.

## Topic of today's lesson:
### JDBC Technology
1. Driver Manager
2. How does it work?
3. JDBC architecture
4. JDBC interfaces

## Practice
* Installing the DBMS, administrator, and studio
* Implementing JDBC in a training application
* automatic deployment
* testing with Postman

___

# План занятия №5 31.07.2024

## Что мы узнали на прошлом занятии:
1. Аннотации Spring: 
- @Component - это компонент Spring 
- @Autowired - это аннотация для подключения "зависимостей(бинов)" (автоматическое внедрения зависимости c помощью Spring)
- @Repository - это тоже аннотация Spring 
- @Service  - это тоже аннотация Spring
- @Qualifier - это тоже аннотация Sprin, позволяет выбрать реализацию имлементации
- @Value - позволяет вытащить атрибут из окружения приложения, из файла application.properties

2. Взаимодействие в сети Internet, HTTP - протокол и его использование

* HTTP - это протокол передачи ТЕКСТА поо сети Интернет
* JSON - это файл специального формата {"key":"value"}
* endpoint - это адрес на сервере для получения и взаимодействия по HTTP-протоколу (внутри url - небольшая часть /users, /cars)

Методы для http-запросов:
* GET
* POST
* PUT
* DELETE

**Протокол выполненного на занятии:**
1. Установка Tomcat - скачать актуальную версию, разархивировать в доступную директорию, например C:\Tomcat\
Для запуска запустить терминал и выполнить C:\Tomcat\bin\startup.bat (для Mac надо выполнить ./startup.sh)
Для остановки сервера C:\Tomcat\bin\shutdown.bat (для Mac надо выполнить ./shutdown.sh)

Инструкция по запуску Tomcat на Windows - https://remontka.pro/environment-variables-windows/
Добавлять переменную в НИЖНЕЕ окно (Системные переменные)

2. Создаем новый проект, используя сборщик Maven:
Language - Java, Build system - Maven

3. Дополняем файл pom.xml зависимостями на jackson(работа с json) и jakarta(обработка http-запросов):
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
4. Добавляем строку 

<packaging>war</packaging>

5. Создаем пакеты и классы в соответствии с архитектурой приложения
* domain - Car
* repository - CarRepository(i), CarRepositoryMap
* service - CarService(i), CarServiceImpl
* controller - SarServlet (обработчик http-запросов)

Ключева строка
public class CarServlet extends HttpServlet - наследуемся, расширяемся от класса HttpServlet

6. Создаем папку webapp, в ней папку WEB-INF, в ней файл web.xml  
В этом файле описываем ДЕСКРИПТОР, который определяет обработку http-запросов (req, resp).

7. Открываем закладку Maven в IntelliJ IDEA, в ней Lifecycle, double click на package - выполняется сборка war-архива, он попадает в папку target

8. Переименовываем архив в ROOT.war и копируем его в папку webapps в директории Tomcat. Tomcat самостоятельно проводит разархивацию и готов к работе с приложением.

9. Запускаем браузер, переходим на адрес 
http://localhpst:8080
делаем запрос из адресной строки браузера
http://localhpst:8080/cars
Получаем список имеющихся в репозитории автомобилей.

## Тема сегодняшнего занятия:
### Технология JDBC
1. Driver Manager
2. Как это работает?
3. Архитектура JDBC
4. Интерфейсы JDBC

## Практика
* Установка СУБД, администратора и студии
* Реализация JDBC в учебном приложении
* автоматический деплоймент 
* тестирование с помощью Postman
