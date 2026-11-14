package project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
		PrintWriter out = response.getWriter();

        try {

            // Retrieve all student records

            ResultSet rs = Dao.viewStudents();

            // Store ResultSet in request attribute

            request.setAttribute("students", rs);

            // Forward request to JSP

            request.getRequestDispatcher("display.jsp").forward(request, response);

        } catch (Exception e) {

            e.printStackTrace();

            out.println("Error retrieving student records: " + e.getMessage());

        }

    }

}
