
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>

    <title>Student Records</title>

    <style>

        body {
            font-family: Arial, sans-serif;
            background-color: #f2f5fa;
            margin: 0;
            padding: 30px;
        }

        h1 {
            text-align: center;
            color: #243b64;
        }

        .container {
            width: 95%;
            margin: auto;
            background: white;
            padding: 25px;
            border-radius: 10px;
            box-shadow: 0 3px 12px rgba(0,0,0,0.1);
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 25px;
        }

        th {
            background-color: #243b64;
            color: white;
            padding: 12px;
        }

        td {
            padding: 10px;
            border: 1px solid #ddd;
            text-align: center;
        }

        tr:nth-child(even) {
            background-color: #f2f5fa;
        }

        .btn {
            display: inline-block;
            margin-top: 25px;
            padding: 12px 20px;
            background-color: #243b64;
            color: white;
            text-decoration: none;
            border-radius: 5px;
        }

        .btn:hover {
            background-color: #16294a;
        }

        .message {
            text-align: center;
            color: #777;
            padding: 20px;
        }

    </style>

</head>

<body>

<div class="container">

    <h1>Student Management System</h1>

    <h2>All Registered Students</h2>

    <table>

        <tr>
            <th>Student ID</th>
            <th>Student Name</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Gender</th>
            <th>DOB</th>
            <th>Course</th>
            <th>Semester</th>
            <th>Roll Number</th>
            <th>College Name</th>
            <th>Address</th>
        </tr>

        <%

            ResultSet rs = (ResultSet) request.getAttribute("students");

            boolean found = false;

            if (rs != null) {

                try {

                    while (rs.next()) {

                        found = true;

        %>

        <tr>

            <td><%= rs.getInt("STUDENT_ID") %></td>

            <td><%= rs.getString("STUDENT_NAME") %></td>

            <td><%= rs.getString("EMAIL") %></td>

            <td><%= rs.getString("PHONE") %></td>

            <td><%= rs.getString("GENDER") %></td>

            <td><%= rs.getDate("DOB") %></td>

            <td><%= rs.getString("COURSE") %></td>

            <td><%= rs.getInt("SEMESTER") %></td>

            <td><%= rs.getString("ROLL_NUMBER") %></td>

            <td><%= rs.getString("COLLEGE_NAME") %></td>

            <td><%= rs.getString("ADDRESS") %></td>

        </tr>

        <%

                    }

                } catch (Exception e) {

                    out.println("<tr><td colspan='11'>");
                    out.println("Error: " + e.getMessage());
                    out.println("</td></tr>");

                } finally {

                    try {

                        Statement st = rs.getStatement();
                        Connection con = st.getConnection();

                        rs.close();
                        st.close();
                        con.close();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }

            }

            if (!found) {

        %>

        <tr>
            <td colspan="11" class="message">
                No Student Records Found!
            </td>
        </tr>

        <% } %>

    </table>

    <a href="index.html" class="btn">
        Back to Registration
    </a>

</div>

</body>
</html>
