<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<form action="/test" method="get">
    <label>First operand</label>
    <input type="number" value="0" name="first"> <br>
    <label>Operator</label>
    <select name="operator">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">/</option>
    </select> <br>
    <label>Second operand</label>
    <input type="number" value="0" name="second"> <br>
    <input type="submit" value="Caculate">
</form>

</body>
</html>