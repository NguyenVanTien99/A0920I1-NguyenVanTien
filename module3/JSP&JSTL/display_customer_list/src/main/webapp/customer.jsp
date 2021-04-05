<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customer</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<table class="table table-dark">

    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">First</th>
        <th scope="col">Last</th>
        <th scope="col">Handle</th>
    </tr>
    </thead>

    <tbody>

    <c:forEach items="${customer}" var="cus">
    <tr>
        <th scope="row">${cus.name}</th>
        <td>${cus.dayOfBirth}</td>
        <td>${cus.address}</td>
        <td><img src="${cus.image}" alt="image" border=3 height=100 width=100></img></td>
    </tr>
    </c:forEach>

    </tbody>

</table>

</body>
</html>
