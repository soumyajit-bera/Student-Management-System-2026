
# Student Management System

A web-based Student Management System developed using
Java Servlet, JSP, JDBC and PostgreSQL.

## Technologies Used

- Java
- HTML5
- CSS3
- Java Servlet
- JSP
- JDBC
- PostgreSQL
- Apache Tomcat 11
- Eclipse IDE

## Features

- Student Registration
- Store student details in PostgreSQL
- Display all registered students
- JDBC database connectivity
- Responsive registration interface

## Project Structure

```text
Student_Management_System/
├── src/main/java/project/
│   ├── DBConnection.java
│   ├── Dao.java
│   ├── RegisterServlet.java
│   └── DisplayServlet.java
│
└── src/main/webapp/
    ├── index.html
    ├── style.css
    ├── display.jsp
    └── WEB-INF/
        └── lib/
```

## Database

Database: PostgreSQL

Table: STUDENT

Configure your PostgreSQL database credentials
in DBConnection.java before running the project.

## How to Run

1. Import the project into Eclipse.
2. Configure Apache Tomcat 11.
3. Create the STUDENT table in PostgreSQL.
4. Configure the JDBC driver.
5. Run the project on Tomcat.
6. Open the registration page in your browser.
