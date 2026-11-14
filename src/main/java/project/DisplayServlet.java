package project;

import java.io.IOException;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws ServletException, IOException {

        try {

            // Create DAO object

            Dao dao = new Dao();


            // Retrieve all student records

            ResultSet rs = dao.viewStudents();


            // Store ResultSet in request attribute

            request.setAttribute("students", rs);


            // Forward request to JSP

            request.getRequestDispatcher("display.jsp")
                   .forward(request, response);

        } catch (Exception e) {

            e.printStackTrace();

            response.getWriter().println(
                "Error retrieving student records: " + e.getMessage()
            );

        }

    }

}
