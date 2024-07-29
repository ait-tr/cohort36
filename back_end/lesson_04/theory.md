<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

# Lesson 4

### Servlet - what is it and what is it for?

A Servlet is a Java program that runs on a server and processes client requests using the HTTP protocol.
Servlets are a component of Java EE (Enterprise Edition) and are designed to extend the capabilities of servers that handle client requests, such as web servers.

A Servlet in Java is a technology used to create web applications.
It provides a platform for developing server programs in Java that can communicate with clients using the HTTP protocol (or other protocols), handling requests and sending responses.

Servlets perform the following main functions:

1. **Reading client data** sent via HTTP. Data can be sent in a variety of ways, including GET and POST.
2. **Processing this data**: A Servlet can process the input data and perform various operations, such as accessing a database, calling external services, and other computing tasks.
3. **Generate responses**: After processing the data, the servlet generates a response in a format that the client can understand (usually HTML, but can also be JSON, XML, and other data).
4. **Send data back to the client** via HTTP.

Servlets run within a servlet container (also called an **application server**), which handles many of the low-level details, including servlet lifecycle management, scaling, security, session management, and more.

A classic example of an application server that supports servlets is Apache Tomcat, which is one of the most popular servlet containers.

### Java Servlet API

The Java Servlet API is a standardized set of interfaces and classes that makes it possible to develop such web applications.
Servlets run on the server and can handle client requests in the following ways:

1. **Receive a request**: The client (usually a web browser) sends a request to the server where the servlet is hosted. This request can be triggered by various events, for example, a user can fill out a form on a web page and click the submit button.

2. **Processing the request**: The servlet parses the received request, performs the necessary data processing or business logic, and prepares a response. This may include performing database operations, integrating with other web services, and so on.

3. **Sending the response**: After processing the request, the servlet generates a response, which can be in the form of HTML, JSON, XML, and other formats, and sends it back to the client.

Servlets provide high performance and scalability because they support multi-threaded request processing, making them ideal for modern interactive web applications.

The Dispatcher Servlet in the Spring Framework is a servlet that distributes requests to various controllers. It plays a central role in handling all the HTTP requests that pass through an application built using Spring.

When a Spring web application receives an HTTP request, the Dispatcher Servlet determines which controller to route the request to. It bases its decision on configuration, which can be specified by annotations in code or in XML configuration files.

Once the Dispatcher Servlet determines the appropriate controller, it forwards the request to that controller. The controller then processes the request, interacts with the necessary models (for example, to retrieve or update data), and returns the model and view that should be displayed. The Dispatcher Servlet then forwards this response back to the user, usually as an HTML page.

In this way, the Dispatcher Servlet simplifies routing in Spring applications by providing a centralized place to manage all incoming HTTP requests.

### Useful materials:

+ Wikipedia article on HTTP - https://ru.wikipedia.org/wiki/HTTP

+ What is URI, URL and URN - https://habr.com/ru/articles/190154/


</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

# Lesson 4

### Servlet - что это и для чего?

Сервлет — это Java-программа, которая работает на сервере и обрабатывает запросы клиента в рамках протокола HTTP.
Сервлеты являются компонентом Java EE (Enterprise Edition) и предназначены для расширения возможностей серверов, обрабатывающих запросы клиентов, такие как веб-серверы.

Сервлет в Java — это технология, используемая для создания веб-приложений.
Она обеспечивает платформу для разработки серверных программ на Java, которые могут общаться с клиентами по протоколу HTTP (или другим протоколам), обрабатывая запросы и отправляя ответы.

Сервлеты выполняют следующие основные функции:

1. **Чтение данных клиента**, отправленных через HTTP. Данные могут быть отправлены различными способами, включая GET и POST.
2. **Обработка этих данных**: сервлет может обрабатывать входные данные и выполнять различные операции, такие как доступ к базе данных, вызов внешних сервисов и другие вычислительные задачи.
3. **Генерация ответов**: после обработки данных сервлет генерирует ответ в формате, который может воспринимать клиент (обычно это HTML, но также может быть данные JSON, XML и другие).
4. **Отправка данных обратно клиенту** через HTTP.

Сервлеты работают в пределах сервлет-контейнера (также называемого **сервером приложений**), который обрабатывает множество низкоуровневых деталей, включая управление жизненным циклом сервлета, масштабирование, безопасность, управление сессиями и многое другое.

Классическим примером сервера приложений, поддерживающего сервлеты, является Apache Tomcat, который представляет собой один из самых популярных сервлет-контейнеров.


### Java Servlet API

Java Servlet API представляет собой стандартизированный набор интерфейсов и классов, который делает возможной разработку таких веб-приложений.
Сервлеты работают на сервере и могут обрабатывать клиентские запросы следующим образом:

1. **Получение запроса**: Клиент (обычно веб-браузер) отправляет запрос на сервер, где размещается сервлет. Этот запрос может быть вызван различными событиями, например, пользователь может заполнить форму на веб-странице и нажать кнопку отправки.

2. **Обработка запроса**: Сервлет анализирует полученный запрос, выполняет необходимую обработку данных или бизнес-логику, и подготавливает ответ. Это может включать в себя выполнение операций с базой данных, интеграцию с другими веб-сервисами и так далее.

3. **Отправка ответа**: После обработки запроса сервлет генерирует ответ, который может быть в форме HTML, JSON, XML и других форматов, и отправляет его обратно клиенту.

Сервлеты обеспечивают высокую производительность и масштабируемость, поскольку они поддерживают многопоточную обработку запросов, что делает их идеальными для современных интерактивных веб-приложений.


Dispatcher Servlet в Spring Framework — это сервлет, который распределяет запросы на различные контроллеры. Он играет центральную роль в обработке всех HTTP-запросов, которые проходят через приложение, созданное с использованием Spring.

Когда веб-приложение на Spring получает HTTP-запрос, Dispatcher Servlet определяет, к какому контроллеру следует направить этот запрос. Он основывает свое решение на конфигурации, которая может быть задана аннотациями в коде или в XML-файлах конфигурации.

После того как Dispatcher Servlet определяет соответствующий контроллер, он перенаправляет запрос к этому контроллеру. Контроллер затем обрабатывает запрос, взаимодействует с необходимыми моделями (например, для получения или обновления данных) и возвращает модель и представление, которые должны быть отображены. Dispatcher Servlet затем перенаправляет этот ответ обратно пользователю, обычно в виде HTML-страницы.

Таким образом, Dispatcher Servlet упрощает маршрутизацию в приложениях Spring, обеспечивая централизованное место для управления всеми входящими HTTP-запросами.

### Полезные материалы:

+ Статья об HTTP в Википедии - https://ru.wikipedia.org/wiki/HTTP

+ Что такое URI, URL и URN - https://habr.com/ru/articles/190154/

+ Основные HTTP методы:

    1. GET - используется для запроса данных с определенного ресурса,
       на котором данные не изменяются, поскольку GET-запросы не изменяют состояние ресурса.
    2. PUT - метод для обновления существующего на сервере ресурса,
       при этом используется содержимое тела запроса.
    3. POST - используется для отправки данных на сервер для создания ресурса.
    4. DELETE - удаляет определённый ресурс.

+ Servlet — это Java компонент, который управляется контейнером и генерирует динамическое содержимое. Как и другие Java компоненты, сервлет является Java классом, который скомпилирован в байт-код и может быть загружен на веб-сервер, использующий технологию Java.

+ Контейнер сервлетов — это некоторая часть веб-сервера или сервера приложений, предоставляющая сетевые сервисы, через которые отправляются запросы и ответы.

+ Для того чтобы приложение могло работать на веб-сервере, оно упаковывается в WAR файл.

+ WAR (Web ARchive) файл - разновидность архива, имеющая определённую структуру файлов и папок и содержащая все файлы, необходимые для работы приложения

+ Tomcat

Tomcat (в старых версиях — Catalina) — контейнер сервлетов с открытым исходным кодом,
разрабатываемый Apache Software Foundation. Реализует спецификацию сервлетов,
спецификацию JavaServer Pages (JSP) и JavaServer Faces (JSF). Написан на языке Java.

Tomcat позволяет запускать веб-приложения и содержит ряд программ для самоконфигурирования.

Скачать Tomcat можно с официального сайта разработчика - https://tomcat.apache.org/

Если Tomcat не запускается, нужно добавить системную переменную среды:
Имя: JAVA_HOME
Значение: путь к установленной JDK, например C:\Program Files\Java\jdk-17.0.3

Инструкция - https://remontka.pro/environment-variables-windows/
Добавлять переменную в НИЖНЕЕ окно (Системные переменные)

Для тестирования веб-приложений удобно использовать Postman.
Скачать можно по ссылке - https://www.postman.com/downloads/


</details>