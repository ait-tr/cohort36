
<h3 style="text-align: center; padding-bottom: 14px">2024-02-02</h3>

# Lesson plan No. 3 07/26/2024

## This is my explanation of the following page: 1. Freimwork Spring - обеспечивает ... .

The following mechanisms are implemented: * DI - Dependency Injection - this ... * IoC - Inversion of Control - this ... 2. Beans 3. POJO 4. Application Context 5. Annota ции ## Тема сегодняшнего занятия - Чистая архитектура и разработка на Spring Что мы узнаем сегодня: 1. Principle of Chinese architecture.

2. Разработка приложений на Spring.

3. Notes Spring: @Component, @Repository, @Service, @Qualifier, @Value.

## Practice
The practice of creating the app is that it can be stored in the repository and delivered entity: Product

___

# План занятия №3 26.07.2024

## Что мы узнали на прошлом занятии:
1. Фреймворк Spring - обеспечивает (облегчает, улучшает) создание **зависимостей** в сложных и тяжелых (нагруженных) приложениях. 
Сложные приложения - это когда есть **большое количество** связанных **классов** (сущностей) и наличие бизнес-логика.

Он реализует/опирается на механизмы:
* DI - Dependency Injection - это прописывание зависимостей между классами. Это не жесткая зависимость.
Car
  - String brand;
  - int age;
  - double price;
  - Driver driver; - это жесткая зависимость

* IoC - Inversion of Control - это передача управления от разразработчика ПО Spring. 
   
2. Beans - это превращение обычного объекта в объект, которым управляет Spring
3. POJO - plain old Java object 
4. Application Context 
5. Аннотации - @Bean, @Autowired, @Configuration 

## Тема сегодняшнего занятия - Чистая архитектура и разработка на Spring
Что мы узнаем сегодня:
1. Принципы Чистой архитектуры.

2. Разработка приложений на Spring.

3. Аннотации Spring: @Component, @Repository, @Service, @Qualifier, @Value.

## Практика
Разработаем приложение, которое будет сохранять в репозиторий и доставать из него сущность:
Product:
  - id;
  - title;
  - price;
  - article.
Правила формирования артикула:
Префикс-первая_буква_названия-ID