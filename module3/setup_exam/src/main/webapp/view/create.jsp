<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: NguyenVanTien
  Date: 02/05/2021
  Time: 21:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link type="text/css" href="<C:url value="/vendor/css/bootstrap.min.css" />" rel="stylesheet">


    <script type="text/javascript" src="<C:url value="/vendor/js/bootstrap.min.js" />" ></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-8">
            <h1>CREATE FORM</h1>
            <br/>
            <form method="post" action="create">
                <div class="form-group">
                    <label>id</label>
                    <input name="id" type="text" class="form-control" id="id" >
                </div>
                <div class="form-group">
                    <label>renterName</label>
                    <input name="renterName" type="text" class="form-control" id="renterName" >
                </div>
                <div class="form-group">
                    <label>phoneNumber</label>
                    <input name="phoneNumber" type="text" class="form-control" id="phoneNumber">
                </div>
                <div class="form-group">
                    <label>rentDate</label>
                    <input name="rentDate" type="date" class="form-control" id="rentDate">
                </div>
                <div class="form-group">
                    <label>paymentMethod</label>
                    <select name="paymentMethod" class="form-control" id="paymentMethod">
                        <C:forEach items="${list}" var="item">
                            <option value="${item.paymentMethod}">${item.paymentMethod}</option>
                        </C:forEach>
                    </select>
                </div>
                <div class="form-group">
                    <label>remark</label>
                    <input name="remark" type="remark" class="form-control" id="remark">
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
            <br>
            <a id="btnDelete" href="/list" type="button" class="btn btn-success">Back to list</a>
        </div>
    </div>
</div>
</body>
</html>
