package za.ac.universityportal2.dao;

import za.ac.universityportal2.util.DBUtil;
import za.ac.universityportal2.model.Course;
import java.sql.*;
import java.util.*;

public class CourseDAO {
    public List<Course> getAllCourses() throws SQLException {
        List<Course> courses = new ArrayList<>();
        String sql = "SELECT * FROM Courses";

        try (Connection conn = DBUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Course c = new Course(
                    rs.getInt("course_id"),
                    rs.getString("course_code"),
                    rs.getString("course_name"),
                    rs.getString("instructor"),
                    rs.getString("schedule")
                );
                courses.add(c);
            }
        }
        return courses;
    }
}

