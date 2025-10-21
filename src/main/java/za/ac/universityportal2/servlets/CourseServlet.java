package za.ac.universityportal2.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import za.ac.universityportal2.dao.CourseDAO;
import za.ac.universityportal2.model.Course;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/courses")
public class CourseServlet extends HttpServlet {

    private CourseDAO courseDAO;

    @Override
    public void init() throws ServletException {
        courseDAO = new CourseDAO(); 
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Fetch list of courses from DAO
            List<Course> courses = courseDAO.getAllCourses();

            // Attach to request
            request.setAttribute("courses", courses);

            // Forward to JSP page
            request.getRequestDispatcher("courses.jsp").forward(request, response);

        } catch (SQLException e) {
            throw new ServletException("Error retrieving courses", e);
        }
    }
}
