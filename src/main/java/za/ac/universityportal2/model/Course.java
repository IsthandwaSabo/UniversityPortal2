package za.ac.universityportal2.model;

public class Course {
    private final int id;
    private final String courseCode;
    private final String courseName;
    private final String instructor;
    private final String schedule;

    public Course(int id, String courseCode, String courseName, String instructor, String schedule) {
        this.id = id;
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
        this.schedule = schedule;
    }

    // getters and setters
    public int getId() { return id; }
    public String getCourseCode() { return courseCode; }
    public String getCourseName() { return courseName; }
    public String getInstructor() { return instructor; }
    public String getSchedule() { return schedule; }
}