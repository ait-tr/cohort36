<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

# Lesson 6, 7

**Java Persistence API (JPA), Hibernate, and ORM**

The Java Persistence API (JPA) is part of the Java EE specification that provides a standardized way to work with relational databases in Java applications. This API simplifies development by allowing engineers to manipulate Java objects instead of interacting with SQL directly, improving efficiency and reducing code.

**Major Features of JPA:**

1. **Object Mapping:** JPA allows you to map Java objects to database tables, automating the process of saving, retrieving, updating, and deleting data (CRUD).
2. **Object Lifecycle Management:** JPA manages the state of objects from creation to deletion, ensuring that they are synchronized with the database.
3. **Caching:** Reduces the number of queries to the database, improving application performance.
4. **JPQL Query Language:** Allows you to formulate queries to the database using an object-oriented approach.
5. **Transactional:** Supports grouping operations into a single transaction to ensure data integrity.

**Basic Concepts of ORM and JPA:**

ORM facilitates data translation between disparate types of systems by allowing objects in code to map to tables in the database and vice versa. In JPA, this is achieved through:

- **Entities:** Classes in Java annotated as `@Entity` correspond to tables in the database. Class attributes map to table columns.
- **EntityManager:** The core JPA interface that manages the lifecycle of entities, including operations such as saving, deleting, and querying data.
- **Persistence Unit:** Defined in `persistence.xml`, controls the JPA configuration and scope in which entities are managed.

**Hibernate as a JPA implementation:**

Hibernate extends JPA functionality by providing fine-grained control over mapping and configuration, improving database interaction and application performance.

**Hibernate Configuration:**

Hibernate, a JPA implementation, can be configured via both XML and annotations:

- **XML configuration (hibernate.cfg.xml):** Defines database connection parameters, SQL dialect selection, DDL strategy, and other settings. Mapping files can also be specified to define relationships between classes and tables.

```xml
<hibernate-configuration>
<session-factory>
<property name="hibernate.dialect">org.hibernate.dialect.PostgreSQLDialect</property>
<property name="hibernate.connection.url">jdbc:postgresql://localhost/mydatabase</property>
<!-- Other properties -->
</session-factory>
</hibernate-configuration>
```

- **Annotations:** Provide an intuitive way to map classes and their attributes to database tables and columns, making the configuration more clear and maintainable.

```java
@Entity
@Table(name = "users")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(name = "username")
private String username;
// Other fields and methods
}
```

**Using JPA and Hibernate:**

Integrating JPA and Hibernate into Java applications provides developers with a powerful set of tools for working with relational databases, allowing them to focus on the object model and application logic rather than on the details of the database implementation.

</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

# Lesson 6, 7

**Java Persistence API (JPA), Hibernate и ORM**

Java Persistence API (JPA) является частью спецификации Java EE, предоставляющей стандартизированный способ работы с реляционными базами данных в Java-приложениях. Это API облегчает разработку, позволяя инженерам манипулировать объектами Java вместо прямого взаимодействия с SQL, способствуя повышению эффективности и сокращению кода.

**Основные функции JPA:**

1. **Маппинг объектов:** JPA позволяет связывать Java-объекты с таблицами баз данных, автоматизируя процесс сохранения, извлечения, обновления и удаления данных (CRUD).
2. **Управление жизненным циклом объектов:** JPA управляет состоянием объектов от создания до удаления, обеспечивая их синхронизацию с базой данных.
3. **Кэширование:** Уменьшает количество запросов к базе данных, улучшая производительность приложений.
4. **Язык запросов JPQL:** Позволяет формировать запросы к базе данных, используя объектно-ориентированный подход.
5. **Транзакционность:** Поддерживает группировку операций в единую транзакцию для обеспечения целостности данных.


**Основные концепции ORM и JPA:**

ORM облегчает преобразование данных между несовместимыми типами систем, позволяя объектам в коде отображаться на таблицы в базе данных и наоборот. В JPA это достигается через:

- **Сущности (Entities):** Классы в Java, аннотированные как `@Entity`, соответствуют таблицам в базе данных. Атрибуты класса отображаются на столбцы таблиц.
- **EntityManager:** Основной интерфейс JPA, управляющий жизненным циклом сущностей, включая операции, такие как сохранение, удаление и запросы к данным.
- **Persistence Unit:** Определяется в `persistence.xml`, управляет конфигурацией JPA и областью видимости, в которой сущности управляются.

**Hibernate как реализация JPA:**

Hibernate расширяет функциональность JPA, предоставляя более детальное управление маппингом и конфигурацией, что улучшает взаимодействие с базой данных и производительность приложения.

**Конфигурация Hibernate:**

Hibernate, реализация JPA, может быть настроена как через XML, так и через аннотации:

- **XML-конфигурация (hibernate.cfg.xml):** Определяет параметры подключения к базе данных, выбор диалекта SQL, стратегию DDL и другие настройки. Маппинг-файлы также могут быть указаны для определения отношений между классами и таблицами.

  ```xml
  <hibernate-configuration>
    <session-factory>
      <property name="hibernate.dialect">org.hibernate.dialect.PostgreSQLDialect</property>
      <property name="hibernate.connection.url">jdbc:postgresql://localhost/mydatabase</property>
      <!-- Другие свойства -->
    </session-factory>
  </hibernate-configuration>
  ```

- **Аннотации:** Предоставляют интуитивно понятный способ маппинга классов и их атрибутов на таблицы и столбцы баз данных, делая конфигурацию более наглядной и сопровождаемой.

  ```java
  @Entity
  @Table(name = "users")
  public class User {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;

      @Column(name = "username")
      private String username;
      // Остальные поля и методы
  }
  ```

**Применение JPA и Hibernate:**

Интеграция JPA и Hibernate в Java-приложения обеспечивает разработчикам мощный набор инструментов для работы с реляционными базами данных, позволяя сосредоточиться на объектной модели и логике приложения, а не на деталях реализации базы данных.

</details>