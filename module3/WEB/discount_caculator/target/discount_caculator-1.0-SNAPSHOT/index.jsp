<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Category</h1>
<form method="post" action="/display-discount">
    <input type="text" name="ProDescription" placeholder="Product Description"/>
    <input type="number" name="Price" placeholder="Product Price"/>
    <input type="number" name="Discount" placeholder="Product Discount (%)"/>
    <input type = "submit" id = "submit" value = "Calculator"/>
</form>
</body>
</html>