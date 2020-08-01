# Angular 9, Spring boot and MySQL Web Applicaton - Expense Tracker
A simple expense tracking application built with Angular 9 and Spring boot that connects to the MySQL database. Application built using spring data JPA to perform database operations. Users can add, list, update, delete, sort, and filter the expenses.

## Requirements

1. Java - 1.8.x

2. Maven - 3.x.x

3. Mysql - 5.x.x

4. Angular - 9.x.x

5. Node - 12.x.x

6. Npm - 6.x.x

## Steps to Setup

**1. Clone the application**

```bash
git clone https://github.com/scbushan05/angular9-springboot-expensetracker.git
```

**2. Create Mysql database**
```bash
create database expensetracker
```

**3. Change mysql username and password as per your installation**

+ open `src/main/resources/application.properties`

+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

**4. Build and run the app using maven (expensetracker)**

```bash
mvn package
java -jar target/expensetracker-v1.jar
```

Alternatively, you can run the app without packaging it using -

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:8080>.

## Explore Rest APIs

The app defines following CRUD APIs.

    GET /api/v1/expenses
    
    POST /api/v1/expenses
    
    GET /api/v1/expenses/{expenseId}
    
    DELETE /api/v1/expenses/{expenseId}

You can test them using postman or any other rest client.

**5. Install node modules for angular application (expense-tracker-frontend)**

```bash
npm install
```

**6. Run the angular application**

```bash
ng serve
```

Alternatively, you can run the below command to open the application in default web browser -

```bash
ng serve --open
```

## Learn more

You can find the tutorial for this application on my blog -

<https://bushansirgur.in/angular-9-and-spring-boot-crud-tutorial-introduction-and-setup/>
