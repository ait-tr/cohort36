<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

# Lesson 5

#### 1. Introduction to JDBC

JDBC (Java Database Connectivity) is a standard Java API for interacting with databases. JDBC plays a critical role in Java applications, allowing them to query and update databases, and retrieve the results of those queries.

**Code example:**
```java
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM mytable");
while (rs.next()) {
System.out.println(rs.getString("columnname"));
}
```

---

#### 2. History of databases: DB and DBMS

Databases were developed for convenient storage and access to large amounts of data. DBMS (database management system) provides an interface for interacting with databases, providing operations for creating, reading, updating and deleting data.

---

#### 3. Popular DBMS and MySQL

Different DBMS, such as Oracle, MySQL, PostgreSQL, have their own unique features, but they all provide mechanisms for data management.

**Code examples:**

**Oracle:**
```java
Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:mydb", "user", "password");
```

**MySQL:**
```java
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
```

**PostgreSQL:**
```java
Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb", "user", "password");
```

---

#### 4. NoSQL Databases

NoSQL databases, such as MongoDB or Cassandra, offer alternative data storage models that may be more suitable for certain types of applications, such as those requiring horizontal scaling or storing unstructured data.

---

#### 5. Database Server and DBMS

A database server provides a centralized data store and provides mechanisms for managing access to that data. The DBMS manages the interaction between the client and the database server, executing queries and returning results.

---

#### 6. SQL Databases

SQL (Structured Query Language) is a language used to manage and manipulate relational databases. It allows you to create, modify, query, and manage data.

**SQL Query Example:**
```sql
SELECT * FROM users WHERE age > 18;
```

---

#### 7. Database Tables: Columns and Columns

In relational databases, data is stored in tables consisting of rows and columns. Columns represent attributes of the data, and rows represent specific records.

**Code Example:**
```java
ResultSet rs = stmt.executeQuery("SELECT name, age FROM users");
while (rs.next()) {
String name = rs.getString("name");
int age = rs.getInt("age");
System.out.println("Name: " + name + ", Age: " + age);
}
```

---

#### 8. JDBC — Java Database Connectivity — architecture

JDBC provides a unified interface for interacting with various DBMS, allowing Java applications to communicate with the database regardless of the specific DBMS.

**Example of using PreparedStatement:**
```java
String sql = "INSERT INTO users (name, age) VALUES (?, ?)";
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setString(1, "John Doe");
pstmt.setInt(2, 30);
pstmt.executeUpdate();
```

---

#### 9. Data Access Object (DAO)

DAO is a design pattern that provides an abstract interface to a database type, allowing data access logic to be separated from business logic.

**DAO implementation example:**
```java
public class UserDAO {
public User getUser(int id) {
Connection conn = DriverManager.getConnection(/* connection details */);
PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM users WHERE id = ?");
pstmt.setInt(1, id);
ResultSet rs = pstmt.executeQuery();
if (rs.next()) {
return new User(rs.getInt("id"), rs.getString("name"), rs.getInt("age"));
}
return null;
}
}
```

### Detailed information about JDBC drivers and basic JDBC methods

### 1. Types of JDBC drivers

There are four types of drivers in JDBC, each with different characteristics and intended for different use cases:

1. **JDBC-ODBC Bridge (Type 1)**: This driver uses the ODBC driver to connect to the database. It converts JDBC calls to ODBC calls. This approach is not recommended, as it introduces an additional layer of overhead and requires the presence of an ODBC driver.

2. **Native API partly in Java (Type 2)**: Type 2 uses the client API to interact with the database, and requires the presence of native libraries on the client side. This provides better performance compared to Type 1, but limits portability.

3. **Pure Java Network Protocol (Type 3)**: This driver translates JDBC calls into database server-specific network calls. This allows clients to use different databases via

4. **Thin Java driver (Type 4)**: This driver translates JDBC calls directly into network calls to a specific database, bypassing the database client library. This is the most popular driver type, as it does not require additional native libraries and provides good performance.

---

### 2. Basic JDBC methods

#### DriverManager

`DriverManager` is a factory for creating `Connection` objects. It selects the appropriate driver from those loaded in the system to establish a connection to the database.

**Sample code:**
```java
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
```

#### Registering the JDBC driver

Before JDBC 4.0, drivers had to be registered with the system using `Class.forName()`. With JDBC 4.0, drivers are loaded automatically.

**Code example:**
```java
Class.forName("com.mysql.jdbc.Driver");
```

#### Statement

`Statement` is used to execute SQL queries without parameters.

**Code example:**
```java
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery("SELECT * FROM mytable");
```

#### ResultSet

`ResultSet` represents the result of executing a SQL query, providing access to data retrieved from the database.

**Code example:**
```java
while (resultSet.next()) {
System.out.println(resultSet.getString("column_name"));
}
```

#### PreparedStatement

`PreparedStatement` is a precompiled SQL query that can contain one or more input parameters.

**Code example:**
```java
PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO mytable (column1, column2) VALUES (?, ?)");
preparedStatement.setString(1, "value1");
preparedStatement.setInt(2, 123);
preparedStatement.executeUpdate();
```

`PreparedStatement` improves performance and prevents SQL injection by precompiling and using placeholders for parameters.

---

Installing the DBMS.

# For Windows:
Installation instructions - https://winitpro.ru/index.php/2019/10/25/ustanovka-nastrojka-postgresql-v-windows/
Link to the installer - https://www.postgresql.org/download/
Username: postgres
For educational purposes, you can choose a light password, for example, ppp77777
But do not use light passwords in real development.
Link to the Beekeeper installer - https://github.com/beekeeper-studio/beekeeper-studio/releases/

# For MAC OS:
Links to installers:
https://postgresapp.com/
https://github.com/beekeeper-studio/beekeeper-studio/releases/

Data types - https://www.postgresql.org/docs/current/datatype.html

</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

# Lesson 5

#### 1. Введение в JDBC

JDBC (Java Database Connectivity) является стандартным Java API для взаимодействия с базами данных. JDBC играет критически важную роль в Java-приложениях, позволяя им выполнять запросы и обновления в базах данных, а также получать результаты этих запросов.

**Пример кода:**
```java
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM mytable");
while (rs.next()) {
    System.out.println(rs.getString("columnname"));
}
```

---

#### 2. История появления баз данных: БД и СУБД

Базы данных были разработаны для удобного хранения и доступа к большим объемам данных. СУБД (система управления базами данных) предоставляет интерфейс для взаимодействия с базами данных, обеспечивая операции создания, чтения, обновления и удаления данных.

---

#### 3. Популярные СУБД и MySQL

Различные СУБД, такие как Oracle, MySQL, PostgreSQL, обладают своими уникальными особенностями, но все они предоставляют механизмы для управления данными.

**Примеры кода:**

**Oracle:**
```java
Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:mydb", "user", "password");
```

**MySQL:**
```java
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
```

**PostgreSQL:**
```java
Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb", "user", "password");
```

---

#### 4. NoSQL базы данных

NoSQL базы данных, такие как MongoDB или Cassandra, предлагают альтернативные модели хранения данных, которые могут быть более подходящими для определенных типов приложений, например, требующих горизонтального масштабирования или хранения неструктурированных данных.

---

#### 5. Сервер баз данных и СУБД

Сервер баз данных обеспечивает централизованное хранилище данных и предоставляет механизмы для управления доступом к этим данным. СУБД управляет взаимодействием между клиентом и сервером баз данных, обеспечивая выполнение запросов и возвращение результатов.

---

#### 6. SQL базы данных

SQL (Structured Query Language) - это язык, используемый для управления и манипулирования реляционными базами данных. Он позволяет создавать, изменять, запрашивать и управлять данными.

**Пример запроса SQL:**
```sql
SELECT * FROM users WHERE age > 18;
```

---

#### 7. Таблицы в базе данных: колонки и столбцы

В реляционных базах данных данные хранятся в таблицах, состоящих из строк и столбцов. Столбцы представляют собой атрибуты данных, а строки - конкретные записи.

**Пример кода:**
```java
ResultSet rs = stmt.executeQuery("SELECT name, age FROM users");
while (rs.next()) {
    String name = rs.getString("name");
    int age = rs.getInt("age");
    System.out.println("Name: " + name + ", Age: " + age);
}
```

---

#### 8. JDBC — Java Database Connectivity — архитектура

JDBC предоставляет унифицированный интерфейс для взаимодействия с различными СУБД, позволяя Java-приложениям общаться с базой данных независимо от конкретной СУБД.

**Пример использования PreparedStatement:**
```java
String sql = "INSERT INTO users (name, age) VALUES (?, ?)";
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setString(1, "John Doe");
pstmt.setInt(2, 30);
pstmt.executeUpdate();
```

---

#### 9. Data Access Object (DAO)

DAO — это шаблон проектирования, который предоставляет абстрактный интерфейс к типу базы данных, позволяя отделять логику доступа к данным от бизнес-логики.

**Пример реализации DAO:**
```java
public class UserDAO {
    public User getUser(int id) {
        Connection conn = DriverManager.getConnection(/* connection details */);
        PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM users WHERE id = ?");
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            return new User(rs.getInt("id"), rs.getString("name"), rs.getInt("age"));
        }
        return null;
    }
}
```


### Детальная информация о драйверах JDBC и основных методах JDBC


### 1. Типы драйверов JDBC

В JDBC существует четыре типа драйверов, каждый из которых имеет разные характеристики и предназначен для различных сценариев использования:

1. **JDBC-ODBC мост (Тип 1)**: Этот драйвер использует ODBC драйвер для подключения к базе данных. Он преобразует вызовы JDBC в вызовы ODBC. Такой подход не рекомендуется, так как он вносит дополнительный уровень накладных расходов и требует наличия ODBC драйвера.

2. **Нативный API частично в Java (Тип 2)**: Тип 2 использует клиентский API для взаимодействия с базой данных, и требует наличия нативных библиотек на стороне клиента. Это обеспечивает лучшую производительность по сравнению с типом 1, но ограничивает переносимость.

3. **Сетевой протокол чисто в Java (Тип 3)**: Этот драйвер преобразует JDBC вызовы в специфические для сервера баз данных сетевые вызовы. Это позволяет клиентам использовать различные базы данных через один и тот же интерфейс.

4. **Тонкий драйвер чисто в Java (Тип 4)**: Этот драйвер преобразует вызовы JDBC непосредственно в сетевые вызовы для конкретной базы данных, минуя клиентскую библиотеку БД. Это самый популярный тип драйвера, так как он не требует дополнительных нативных библиотек и обеспечивает хорошую производительность.

---

### 2. Основные методы JDBC

#### DriverManager

`DriverManager` — это фабрика для создания объектов `Connection`. Он выбирает подходящий драйвер из загруженных в систему для установления соединения с базой данных.

**Пример кода:**
```java
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
```

#### Регистрация JDBC драйвера

До JDBC 4.0 драйверы необходимо было регистрировать в системе, используя `Class.forName()`. С JDBC 4.0 драйверы загружаются автоматически.

**Пример кода:**
```java
Class.forName("com.mysql.jdbc.Driver");
```

#### Statement

`Statement` используется для выполнения SQL-запросов без параметров.

**Пример кода:**
```java
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery("SELECT * FROM mytable");
```

#### ResultSet

`ResultSet` представляет собой результат выполнения SQL-запроса, предоставляя доступ к данным, полученным из базы данных.

**Пример кода:**
```java
while (resultSet.next()) {
    System.out.println(resultSet.getString("column_name"));
}
```

#### PreparedStatement

`PreparedStatement` представляет собой предварительно скомпилированный SQL-запрос, который может содержать один или несколько входных параметров.

**Пример кода:**
```java
PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO mytable (column1, column2) VALUES (?, ?)");
preparedStatement.setString(1, "value1");
preparedStatement.setInt(2, 123);
preparedStatement.executeUpdate();
```

`PreparedStatement` улучшает производительность и предотвращает SQL-инъекции благодаря предварительной компиляции и использованию плейсхолдеров для параметров.

---

Установка СУБД.

# Для Windows:
Инструкция по установке - https://winitpro.ru/index.php/2019/10/25/ustanovka-nastrojka-postgresql-v-windows/
Ссылка на установщик - https://www.postgresql.org/download/
Имя юзера: postgres
В учебных целях можно выбрать лёгкий пароль, например, ppp77777
Но не используйте лёгкие пароли в реальной разработке.
Ссылка на установщик Beekeeper - https://github.com/beekeeper-studio/beekeeper-studio/releases/

# Для MAC OS:
Ссылки на установщики:
https://postgresapp.com/
https://github.com/beekeeper-studio/beekeeper-studio/releases/

Типы данных - https://www.postgresql.org/docs/current/datatype.html

</details>