<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.example.subject.entities.Subject" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<%--<html>--%>
<head>
    <title>All Subjects</title>
    <link rel="stylesheet" href="css/output.css">
</head>
<body>
<nav class="flex justify-between p-5 mb-10 items-center">
    <h2 class="text-3xl text-red-500">FavSubject</h2>
    <ul>
        <li class="cursor-pointer"><a href="create-subject.jsp">Add Subject</a></li>
    </ul>
</nav>
<h1 class="text-3xl font-bold mb-4 text-center underline">List of All Subjects</h1>
<div class="flex justify-center items-center">
    <table class="table-auto">
        <!-- Table Header -->
        <thead>
        <tr>
            <th class="py-2 px-4 border">ID</th>
            <th class="py-2 px-4 border">Title</th>
            <th class="py-2 px-4 border">Credit</th>
        </tr>
        </thead>

        <!-- Table Body -->
        <tbody>
        <!-- Use JSP scriptlet to loop through the List of subjects -->
        <c:forEach var="subject" items="${subjects}">
            <tr>
                <td class="py-2 px-4 border">${subject.getId()}</td>
                <td class="py-2 px-4 border">${subject.getTitle()}</td>
                <td class="py-2 px-4 border">${subject.getCredit()}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
