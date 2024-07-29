
<h3 style="text-align: center; padding-bottom: 14px">2024-02-02</h3>

# Lesson plan No. 4 07/29/2024



___

# План занятия №4 29.07.2024

## Что мы узнали на прошлом занятии:
1. Принципы Чистой архитектуры и пример ее реализации на практике.

2. Аннотации Spring: 
- @Component,
- @Repository, 
- @Service, 
- @Qualifier, 
- @Value.

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

2. Обработка http-запроса сервлетами:
- пишем приложение Car