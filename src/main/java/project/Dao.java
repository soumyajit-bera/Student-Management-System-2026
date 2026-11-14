package project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao 
{

    // Function to insert student details

    public boolean addStudent(int studentId, String studentName, String email, String phone, String gender, String dob, String course, int semester, String rollNumber, String collegeName, String address) 
    {

        boolean status = false;

        try {

            Connection con = DBConnection.getConnection();

            String query = "INSERT INTO STUDENT VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, studentId);
            ps.setString(2, studentName);
            ps.setString(3, email);
            ps.setString(4, phone);
            ps.setString(5, gender);
            ps.setDate(6, java.sql.Date.valueOf(dob));
            ps.setString(7, course);
            ps.setInt(8, semester);
            ps.setString(9, rollNumber);
            ps.setString(10, collegeName);
            ps.setString(11, address);

            int result = ps.executeUpdate();

            if (result > 0) {
                status = true;
            }

            ps.close();
            con.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

        return status;
    }


    // Function to view all student records

    public ResultSet viewStudents() 
    {

        ResultSet rs = null;

        try {

            Connection con = DBConnection.getConnection();

            String query = "SELECT * FROM STUDENT ORDER BY STUDENT_ID";

            PreparedStatement ps = con.prepareStatement(query);

            rs = ps.executeQuery();

        } catch (Exception e) {

            e.printStackTrace();

        }

        return rs;
    }

}
