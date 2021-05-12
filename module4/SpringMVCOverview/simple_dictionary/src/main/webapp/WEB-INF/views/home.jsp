<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Home Page</title>

</head>

<body>

<h1>Dictionary</h1>


<form method="post" action="/translate">
    <div class="mb-3">
        <label class="form-label">ENG</label>
        <input type="text" class="form-control" id="UsdInput" name="eng">
        <c:if test="${vn != null}">
            <h1>vn : ${vn}</h1>
        </c:if>

        <c:if test="${vn == null}">
            <h1>Not Found</h1>
        </c:if>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>


</body>

</html>