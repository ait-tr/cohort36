Установка сервера и Beekeeper Studio

Обсудили что такое БД и СУБД

Разборали, что такое таблица, строки, столбцы, primary key, нормализация в общих словах: 
[ссылка на таблицу](https://docs.google.com/spreadsheets/d/1mn1_AQoMEw9CAwJrS5kxwCJSXG5YbZRdVx-21i8r-24/edit?hl=de#gid=0)


```sql
CREATE USER
  alisher
WITH
  PASSWORD 'qwerty007';
```


```sql
CREATE DATABASE
  students_db OWNER alisher;
```

```sql
CREATE TABLE students (
  id serial PRIMARY KEY, name varchar(80), age integer, hobby varchar(80)
  );
```

```sql
INSERT INTO
  students (name, age, hobby)
VALUES
  ('Ruslan', 43, 'sport'),
  ('Alexey', 30, 'music'),
  ('Alisher', 29, 'music');
```

```sql
SELECT
  name,
  hobby
FROM
  students;
```

```sql
SELECT
  name,
  hobby
FROM
  students;
```

```sql
SELECT
  name
FROM
  students
WHERE
	age < 32;
```


```sql
DELETE FROM students;
```
```sql
DELETE FROM
  students
WHERE
  age = 60
  OR hobby = 'sport';
```
```sql
DELETE FROM students WHERE hobby = 'music';
```
```sql
DELETE FROM
  students
WHERE
  hobby = 'music'
  AND age > 30;
```
```sql
SELECT
  name,
  age FROM
  students
ORDER BY
  age DESC;
```
```sql
INSERT INTO students (name, age, hobby) VALUES 
('Vladimir', 60, 'music');

```
```sql
UPDATE
  students
SET
  age = 30
WHERE
  name = 'Alisher';
```
