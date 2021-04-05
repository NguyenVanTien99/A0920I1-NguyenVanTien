<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: NguyenVanTien
  Date: 31/03/2021
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <td>id</td>
        <td>name</td>
        <td>age</td>
        <td>address</td>
    </tr>
    <c:forEach items= "${student}" var="students">
        <tr>

            <td>${students.id}</td>
            <td>${students.name}</td>
            <td>${students.age}</td>
            <td>${students.address}</td>

        </tr>
    </c:forEach>
</table>
</body>
</html>
