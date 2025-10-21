<%-- 
    Document   : courses
    Created on : 07 Oct 2025, 00:36:43
    Author     : Siphe
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Courses</title>
</head>
<body>
<h2>Available Courses</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Code</th>
        <th>Name</th>
        <th>Instructor</th>
        <th>Schedule</th>
    </tr>
    <c:forEach var="course" items="${courses}">
        <tr>
            <td>${course.id}</td>
            <td>${course.courseCode}</td>
            <td>${course.courseName}</td>
            <td>${course.instructor}</td>
            <td>${course.schedule}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
