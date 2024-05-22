Зарегистрировались в https://drawsql.app

## Диаграммы с занятия:

- https://drawsql.app/teams/racoons-1/diagrams/lesson-02
- https://drawsql.app/teams/oleksandr-derkach/diagrams/brainstorm

```sql
CREATE TABLE
  category (id serial PRIMARY KEY, name varchar(80));

CREATE TABLE
  product (
    id serial PRIMARY KEY,
    name varchar(80),
    price money,
    category_id integer REFERENCES category (id)
  );

```


```sql
INSERT INTO
  category (name)
VALUES
  ('electronics'),
  ('food'),
  ('clothes');
```

```sql
INSERT INTO
  product (name, price, category_id)
VALUES
  ('salami', 10, 2),
  ('iphone x', 500, 1),
  ('jeans', 40, 3),
  ('cheese', 13, 2),
  ('washing mashine', 1000, 1);
```


```sql
SELECT
  *
FROM
  product
  JOIN category ON category.id = product.category_id;
```


```sql
CREATE TABLE
  discipline (id serial PRIMARY KEY, title varchar(80));

CREATE TABLE
  teacher (id serial PRIMARY KEY, name varchar(80));

CREATE TABLE
  discipline_teacher (
    teacher_id integer REFERENCES teacher(id),
    discipline_id integer REFERENCES discipline(id),
    PRIMARY KEY (teacher_id, discipline_id)
  );

```