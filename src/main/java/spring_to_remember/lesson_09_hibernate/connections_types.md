1. **JDBC (Java Database Connectivity)**
    - Низкоуровневый доступ к базам данных с использованием SQL-запросов.

2. **Spring JDBC**
    - Обертка над JDBC, упрощающая выполнение CRUD-операций и работу с базой данных.

3. **Spring Data JPA**
    - Высокоуровневый доступ с использованием JPA (Java Persistence API) для работы с объектно-реляционным маппингом (ORM).

4. **Hibernate**
    - Популярная реализация JPA с расширенными возможностями для ORM.

5. **Spring Data JDBC**
    - Обеспечивает подход, аналогичный Spring Data JPA, но с использованием JDBC вместо JPA.

6. **JPA (Java Persistence API)**
    - Стандартный API для ORM, абстрагирующий детали работы с базой данных.

Реактивное объектно-реляционное отображение
Hibernate Reactive — реактивный API для Hibernate ORM, поддерживающий неблокирующие 
драйверы баз данных и реактивный стиль взаимодействия с базой данных.

Hibernate Reactive предназначен для использования в реактивной среде программирования, 
такой как Vert.x или Quarkus , где взаимодействие с базой данных должно происходить 
неблокирующим образом. Операции сохранения организуются посредством построения 
реактивного потока, а не посредством прямого вызова синхронных функций в процедурном 
коде Java.

JDBC, JPA и Hibernate ORM используют блокирующий IO для взаимодействия с базой данных 
и поэтому не подходят для использования в реактивной среде. Hibernate Reactive — это 
многофункциональная реализация ORM, разработанная для использования преимуществ 
неблокирующих клиентов базы данных.
