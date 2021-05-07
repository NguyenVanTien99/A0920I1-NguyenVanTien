<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: NguyenVanTien
  Date: 02/05/2021
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

<%--    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"--%>
<%--          integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">--%>

    <link type="text/css" href="<C:url value="/vendor/css/bootstrap.min.css" />" rel="stylesheet">
    <script type="text/javascript" src="<C:url value="/vendor/js/bootstrap.min.js" />" ></script>

</head>
<body>
    <div class="container">
        <nav class="navbar navbar-light bg-light">
            <a class="navbar-brand" href="#">
                <label>ROOM MANAGEMENT</label>
            </a>
        </nav>
        <div class="row">
            <div class="col-md-12">
                <a  id="btnCreate" href="create" type="button" class="btn btn-primary" >Create</a>
                <table class="table">
                    <thead>
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">renterName</th>
                        <th scope="col">phoneNumber</th>
                        <th scope="col">rentDate</th>
                        <th scope="col">PaymentMethod</th>
                        <th scope="col">remark</th>
                        <th scope="col">Action</th>
                    </tr>
                    </thead>
                    <tbody>
                    <C:forEach items="${list}" var="item">
                        <tr>
                            <th scope="col">${item.id}</th>
                            <th scope="col">${item.renterName}</th>
                            <th scope="col">${item.phoneNumber}</th>
                            <th scope="col">${item.rentDate}</th>
                            <th scope="col">${item.paymentMethod}</th>
                            <th scope="col">${item.remark}</th>
                            <td class="text-center">

                                <a id="btnDelete" href="/delete?id=${item.id}" type="button" class="btn btn-danger" onclick="return confirm('Are you sure you want to delete this item?');">Delete</a>
                                <a id="btnEdit" href="/update?id=${item.id}" type="button" class="btn btn-info" >Update</a>
                            </td>


                        </tr>
                    </C:forEach>

                    </tbody>
                </table>

                <script>


                </script>




<%--                <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>--%>
<%--                <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>--%>
<%--                <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js" integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF" crossorigin="anonymous"></script>--%>

            </div>
        </div>
    </div>


</body>

</html>
