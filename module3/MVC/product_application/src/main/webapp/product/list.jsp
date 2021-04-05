<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: NguyenVanTien
  Date: 31/03/2021
  Time: 20:05
  To change this template use File | Settings | File Templates.
--%>
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
    <div class="row clearfix">

        <div class="col-md-12 table-responsive">
            <a href='/create'><button type="button" class="btn btn-primary">Add new Product</button></a> <br>
            <table class="table table-bordered table-hover table-sortable" id="tab_logic">
                <thead>
                <tr >
                    <th class="text-center">
                        Id
                    </th>
                    <th class="text-center">
                        Name
                    </th>
                    <th class="text-center">
                        Price
                    </th>
                    <th class="text-center">
                        Description
                    </th>
                    <th class="text-center">
                        Country
                    </th>
                    <th class="text-center">
                        Edit
                    </th>
                    <th class="text-center">
                        Delete
                    </th>

                </tr>
                </thead>
                <tbody>
                <c:forEach items="${products}" var="product">
                    <tr id='addr0' data-id="0" class="hidden">
<%--                        <td data-name="${product.getId}">--%>
<%--                            <input type="text" name='id'  placeholder='Id' class="form-control"/>--%>
<%--                        </td>--%>
<%--                        <td data-name="${product.getName}">--%>
<%--                            <input type="text" name='name' placeholder='Name' class="form-control"/>--%>
<%--                        </td>--%>
<%--                        <td data-name="${product.getPrice}">--%>
<%--                            <input type="text" name='price' placeholder='Price' class="form-control"/>--%>
<%--                        </td>--%>
<%--                        <td data-name="${product.getDescription}">--%>
<%--                            <input type="text" name='description' placeholder='Description' class="form-control"/>--%>
<%--                        </td>--%>
<%--                        <td data-name="${product.getCountry}">--%>
<%--                            <input type="text" name='country' placeholder='Country' class="form-control"/>--%>
<%--                        </td>--%>

                            <td>${product.getId()}</td>
                            <td>${product.getName()}</td>
                            <td>${product.getPrice()}</td>
                            <td>${product.getDescription()}</td>
                            <td>${product.getCountry()}</td>
                            <td><a href="">edit</a></td>
                            <td><a href="">delete</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

</body>
</html>
