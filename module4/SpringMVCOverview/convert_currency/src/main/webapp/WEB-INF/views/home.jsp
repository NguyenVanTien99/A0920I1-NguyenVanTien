<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Home Page</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">

</head>

<body>

<h1>Convert Currency</h1>


<form method="post" action="/convert">
    <div class="mb-3">
        <label class="form-label">USD</label>
        <input type="number" class="form-control" id="UsdInput" name="usd">
        <c:if test="${vnd != null}">
            <h1>vnd : ${vnd}</h1>
        </c:if>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>

</body>

</html>