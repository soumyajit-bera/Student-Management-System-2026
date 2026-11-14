package project;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        try {

            // Retrieve form values

            int studentId = Integer.parseInt(
                request.getParameter("studentId")
            );

            String studentName = request.getParameter("studentName");

            String email = request.getParameter("email");

            String phone = request.getParameter("phone");

            String gender = request.getParameter("gender");

            String dob = request.getParameter("dob");

            String course = request.getParameter("course");

            int semester = Integer.parseInt(
                request.getParameter("semester")
            );

            String rollNumber = request.getParameter("rollNumber");

            String collegeName = request.getParameter("collegeName");

            String address = request.getParameter("address");


            // Create DAO object

            Dao dao = new Dao();


            // Insert student details

            boolean status = dao.addStudent(
                studentId,
                studentName,
                email,
                phone,
                gender,
                dob,
                course,
                semester,
                rollNumber,
                collegeName,
                address
            );


            // Display result

            if (status) {

                response.getWriter().println(
                    "<h2>Student Registered Successfully!</h2>"
                );

                response.getWriter().println(
                    "<a href='index.html'>Register Another Student</a>"
                );

                response.getWriter().println(
                    "<br><br><a href='DisplayServlet'>View All Students</a>"
                );

            } else {

                response.getWriter().println(
                    "<h2>Student Registration Failed!</h2>"
                );

                response.getWriter().println(
                    "<a href='index.html'>Try Again</a>"
                );

            }

        } catch (Exception e) {

            e.printStackTrace();

            response.getWriter().println(
                "<h2>Error: " + e.getMessage() + "</h2>"
            );

        }

    }

}
