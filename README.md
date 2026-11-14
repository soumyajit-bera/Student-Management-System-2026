# 🎓 CampusConnect – Student Management System

A web-based **Student Management System** developed using Java Servlets, JSP, JDBC and PostgreSQL. The application allows an administrator to register new students, store their information in a relational database, and view all registered student records through a web-based interface.

---

## 📌 Project Overview

CampusConnect is a Java Web Application designed to simplify student registration and record management in an educational institution.

The system provides an administrator with an interface to enter student details, save them to a PostgreSQL database using JDBC, and retrieve student records dynamically using Java Servlets and JSP.

## ✨ Features

- **Student Registration:** Register students with personal and academic information.
- **Database Integration:** Store student details in PostgreSQL using JDBC.
- **View Student Records:** Retrieve and display all registered students in a tabular format.
- **Servlet-Based Processing:** Handle HTTP requests using Java Servlets.
- **JSP Integration:** Dynamically display student information.
- **Responsive User Interface:** Modern university ERP-inspired registration interface.
- **Data Validation:** HTML form validation for required fields.

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Java | Backend Programming |
| HTML5 | Frontend Structure |
| CSS3 | UI Styling |
| Java Servlet | Request Processing |
| JSP | Dynamic Web Pages |
| JDBC | Database Connectivity |
| PostgreSQL | Relational Database |
| Apache Tomcat 11 | Web Server |
| Eclipse IDE | Development Environment |

## 📂 Project Structure

```text
Student_Management_System/
│
├── src/
│   └── main/
│       │
│       ├── java/
│       │   └── project/
│       │       │
│       │       ├── DBConnection.java
│       │       ├── Dao.java
│       │       ├── RegisterServlet.java
│       │       └── DisplayServlet.java
│       │
│       └── webapp/
│           │
│           ├── index.html
│           ├── style.css
│           ├── display.jsp
│           │
│           ├── META-INF/
│           │
│           └── WEB-INF/
│               ├── lib/
│               │   └── postgresql.jar
│               │
│               └── web.xml
│
├── .classpath
├── .project
├── .gitignore
└── README.md
```

## ⚙️ Application Architecture

The application follows a simple three-layer architecture:

1. **Presentation Layer:** HTML, CSS and JSP provide the user interface.
2. **Application Layer:** Java Servlets process registration and display requests.
3. **Database Layer:** JDBC and DAO handle communication with PostgreSQL.

### Application Workflow

```text
          Administrator
                |
                v
          index.html
                |
                v
        RegisterServlet
                |
                v
             Dao.java
                |
                v
          DBConnection
                |
                v
           PostgreSQL
                |
                v
          Student Table


       View All Students
                |
                v
         DisplayServlet
                |
                v
             Dao.java
                |
                v
          PostgreSQL
                |
                v
          display.jsp
                |
                v
       Student Records Table
```

## 🗄️ Database Configuration

**Database:** PostgreSQL

**Table Name:** `student`

The STUDENT table stores the following information:

| Column | Description |
|---|---|
| STUDENT_ID | Unique Student ID (Primary Key) |
| STUDENT_NAME | Student's Full Name |
| EMAIL | Student Email Address |
| PHONE | Contact Number |
| GENDER | Gender |
| DOB | Date of Birth |
| COURSE | Course Name |
| SEMESTER | Current Semester |
| ROLL_NUMBER | University Roll Number |
| COLLEGE_NAME | College / University Name |
| ADDRESS | Residential Address |

### Database Setup

1. Install PostgreSQL.
2. Create a database named `student_db`.
3. Execute the following SQL command:

```sql
CREATE TABLE STUDENT (
    STUDENT_ID INTEGER PRIMARY KEY,
    STUDENT_NAME VARCHAR(100) NOT NULL,
    EMAIL VARCHAR(100) UNIQUE NOT NULL,
    PHONE VARCHAR(15),
    GENDER VARCHAR(10),
    DOB DATE,
    COURSE VARCHAR(50),
    SEMESTER SMALLINT,
    ROLL_NUMBER VARCHAR(20) UNIQUE,
    COLLEGE_NAME VARCHAR(150),
    ADDRESS VARCHAR(200)
);
```

## 🚀 How to Run the Project

### Prerequisites

- JDK
- Eclipse IDE for Enterprise Java and Web Developers
- Apache Tomcat 11
- PostgreSQL
- PostgreSQL JDBC Driver

### Step 1: Clone the Repository

```bash
git clone https://github.com/YOUR_USERNAME/Student-Management-System.git
```

### Step 2: Import into Eclipse

1. Open Eclipse IDE.
2. Select File → Import.
3. Choose General → Existing Projects into Workspace.
4. Browse to the cloned project directory.
5. Select the project and click Finish.

### Step 3: Configure PostgreSQL

Open `DBConnection.java` and configure your database connection:

```java
Class.forName("org.postgresql.Driver");

Connection con = DriverManager.getConnection(
    "jdbc:postgresql://localhost:5432/student_db",
    "YOUR_USERNAME",
    "YOUR_PASSWORD"
);
```

Replace the username and password with your PostgreSQL credentials.

### Step 4: Configure JDBC Driver

Add the PostgreSQL JDBC driver to the project's classpath and place the JAR file inside:

```text
src/main/webapp/WEB-INF/lib/
```

### Step 5: Configure Apache Tomcat

1. Add Apache Tomcat 11 to Eclipse.
2. Add the Student Management System project to the server.
3. Clean and publish the project.
4. Start the Tomcat server.

### Step 6: Run the Application

Open the following URL in your browser:

```text
http://localhost:8082/Student_Management_System/index.html
```

## 📸 Application Screenshots

### 1. Student Registration Page

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/2ef29400-7a7d-4cc7-addf-0c558cc78a0e" />

### 2. Successful Student Registration

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/c26a4052-6317-4125-94c5-b97e0405499d" />

### 3. Student Records Display Page

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/45ddfc50-64f2-40d5-a329-79ed2cc5dc8b" />

## 🔮 Future Enhancements

- Student record update functionality.
- Student record deletion functionality.
- Administrator authentication and login.
- Search students by ID or Roll Number.
- Filter student records by course and semester.
- Export student records to PDF or Excel.

## 👨‍💻 Developer

**Developed as an Advanced Java Project**

**Project Name:** CampusConnect – Student Management System

**Technologies:** Java | Servlet | JSP | JDBC | PostgreSQL

---

⭐ If you find this project useful, consider giving the repository a star!

