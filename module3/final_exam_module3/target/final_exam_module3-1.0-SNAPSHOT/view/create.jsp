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
                    <input name="id" type="number" class="form-control" id="id" required>
                </div>
                <div class="form-group">
                    <label>Name</label>
                    <input name="name" type="text" class="form-control" id="renterName" required>
                </div>
                <div class="form-group">
                    <label>Price</label>
                    <input name="price" type="number" class="form-control" id="phoneNumber" required min="100">
                </div>
                <div class="form-group">
                    <label>discount</label>
                    <select name="discount" class="form-control" id="paymentMethod">
                            <option value="5">5</option>
                            <option value="10">10</option>
                            <option value="15">15</option>
                            <option value="20">20</option>
                    </select>
                </div>
                <div class="form-group">
                    <label>Stock</label>
                    <input name="stock" type="number" class="form-control" id="remark" min="10">
                </div>
                <button type="submit" class="btn btn-primary">ADD</button>
            </form>
            <br>
            <a id="btnDelete" href="/list" type="button" class="btn btn-success">Back to list</a>
        </div>
    </div>
</div>
</body>
</html>
