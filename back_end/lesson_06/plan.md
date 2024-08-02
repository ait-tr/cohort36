
<h3 style="text-align: center; padding-bottom: 14px">2024-02-02</h3>

# Lesson plan No. 6 08/02/2024

# Lesson plan #6 08/02/2024

## What we learned in the last lesson:
### Theory:
JDBC (Java Database Connectivity) is a standard Java API for interacting with databases.

JDBC plays a critical role in Java applications, allowing them to perform queries and updates in databases, as well as receive the results of these queries.

singleton is ...

What does JDBC provide us?
* Connection
* Statement
* ResultSet
  These are the classes that we use to work with the DBMS - we create objects, get the methods we need from them.

### Practice
** Protocol of what was completed in the lesson:**
1. We create a CarRepositoryDB, in it we make a getConnection method, which returns Connection to us.
   In the method, we form a string for accessing the DBMS:

`String dbUrl = String.format("%s%s?user=%s&password=%s", DB_ADDRESS, DB_NAME, DB_USERNAME, DB_PASSWORD );`

2. For ease of working with connection attributes, we create a constants package and create a Constants interface in it, in which we set all the constants required for the connection:
   ` String DB_DRIVER_PATH = "org.postgresql.Driver";
   String DB_ADDRESS = "jdbc:postgresql://localhost:5432/";
   String DB_NAME = "cars_db";
   String DB_USERNAME = "postgres"; // username
   String DB_PASSWORD = "ppp77777";`

3. Connect the PostgreSQL DBMS driver to pom.xml - this is the Maven configuration file, add a dependency.

4. Create the cars_db database, add cars to it using BeeKeeper Studio.
   We check the query for adding a car to the table:
   INSERT INTO car (brand, price, year) VALUES ('%s', '%s', %d;

5. In CarRepositoryDB, we write a method for saving a car to the DB. Important points in it:
* we form a string for transferring to the DB
* we make a Statement for transferring to the DB
* we execute the Statement
* we get a ResultSet
* resultSet.next(); - we move to this result
* we extract the id of the created record from it
* we set this id for the car
* we return from the car method

6. In CarServlet, we change the repository:
   ` // public CarRepository repository = new CarRepositoryMap();
   public CarRepository repository = new CarRepositoryDB();`

7. We configure automatic deployment of our application under the control of the Tomcat http server
   Edit configuration...

8. We launch the PostMan application to test http requests to the server, we check sending a record with a car to the database.

## Topic of today's lesson:
### Reinforcing skills in working with JDBC
* Method of reading from the database of one car
* Method of getting from the database of all cars
* Update, Delete - by analogy

### HIBERNATE Technology

## Practice

___

# План занятия №6 02.08.2024

## Что мы узнали на прошлом занятии:
### Теория:
JDBC (Java Database Connectivity) является стандартным Java API для взаимодействия с базами данных. 
JDBC играет критически важную роль в Java-приложениях, позволяя им выполнять запросы и обновления в базах данных, а также получать результаты этих запросов.

singleton - это ...

Что нам предоставляет JDBC?
* Connection
* Statement
* ResultSet 
Это классы, которые мы используем для работы с СУБД - создаем объекты, получаем от них нужные нам методы. 

### Практика
**Протокол выполненного на занятии:**
1. Создаем CarRepositoryDB, в нем делаем метод getConnection, который нам возвращает Connection.
В методе формируем строку обращения к СУБД:

`String dbUrl = String.format("%s%s?user=%s&password=%s", DB_ADDRESS, DB_NAME, DB_USERNAME, DB_PASSWORD );`

2. Для удобства работы с атрибутами подключения создаем пакет constants и в нем создаем интерфейс Constants, в котором задаем все требуемые лоя подключения константы:
`   String DB_DRIVER_PATH = "org.postgresql.Driver";
   String DB_ADDRESS = "jdbc:postgresql://localhost:5432/";
   String DB_NAME = "cars_db";
   String DB_USERNAME = "postgres"; // username
   String DB_PASSWORD = "ppp77777";`

3. Подключаем драйвер СУБД PostgreSQL в pom.xml - это конфигурационный файл Maven, добавляем зависимость (dependency).

4. Создаем БД cars_db, добавляем в нее автомобили с помощью BeeKeeper Studio. 
Проверяем работу запроса по добавлению автомобиля в таблицу:
   INSERT INTO car (brand, price, year) VALUES ('%s', '%s', %d;

5. В CarRepositoryDB пишем метод для сохранения автомобиля в БД. Важные точки в нем:
* формируем строку для передачи в ДБ
* делаем Statement для передачи в БД
* выполняем Statement
* получаем ResultSet
* resultSet.next(); - сдвигаемся на этот результат
* извлекаем из него id созданной записи
* устанавливаем для car этот id
* возвращаем из метода car

6. В CarServlet изменяем репозиторий:
`   // public CarRepository repository = new CarRepositoryMap();
   public CarRepository repository = new CarRepositoryDB();`

7. Настраиваем автоматический деплоймент нашего приложения под управление http-сервера Tomcat
Edit configeration...

8. Запускаем приложение PostMan для тестирования http-запросов на сервер, проверяем отправку записи с автомобилем в базу данных.

## Тема сегодняшнего занятия:
### Закрепляем навыки работы с JDBC
* Метод чтения из БД одного автомобиля
* Метод получения из БД всех автомобилей
* Update, Delete - по аналогии

### Технология HIBERNATE

## Практика


