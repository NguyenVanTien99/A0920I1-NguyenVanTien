<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <style>
        .table-sortable tbody tr {
            cursor: move;
        }
    </style>
</head>
<body>



<div class="container">
    <h2>Edit Product</h2>

    <form class="form-horizontal" action="/edit" method="post">

        <div class="form-group">
            <label class="control-label col-sm-2" >id:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="id" placeholder="Enter id" name="id" value="${product.getId()}">
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" >Name:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="name" placeholder="Enter name" name="name" value="${product.getName()}">
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" >Price:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="price" placeholder="Enter price" name="price" value="${product.getPrice()}">
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2">Description:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="description" placeholder="Enter description" name="description" value="${product.getDescription()}">
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" >Country:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="country" placeholder="Enter country" name="country" value="${product.getCountry()}">
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Submit</button>
            </div>
        </div>
    </form>
</div>

</body>
</html>
