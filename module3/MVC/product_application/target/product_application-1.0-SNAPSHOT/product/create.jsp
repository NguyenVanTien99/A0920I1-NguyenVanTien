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
    <h2>Horizontal form</h2>
    <form class="form-horizontal" action="/create">
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Email:</label>
            <div class="col-sm-10">
                <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Password:</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <div class="checkbox">
                    <label><input type="checkbox" name="remember"> Remember me</label>
                </div>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Submit</button>
            </div>
        </div>
    </form>
</div>


<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 table-responsive">

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

                        </th>

                    </tr>
                    </thead>
                    <tbody>
                    <tr id='addr0' data-id="0" class="hidden">
                        <form action="/create" method="post">
                        <td>
                            <input type="text" name='id'  placeholder='Id' class="form-control"/>
                        </td>
                        <td>
                            <input type="text" name='name' placeholder='Name' class="form-control"/>
                        </td>
                        <td>
                            <input type="text" name='price' placeholder='Price' class="form-control"/>
                        </td>
                        <td>
                            <input type="text" name='description' placeholder='Description' class="form-control"/>
                        </td>
                        <td>
                            <input type="text" name='country' placeholder='Country' class="form-control"/>
                        </td>

                        <td> <input type="submit" value="Add"/></td>
                        </form>
                    </tr>

                    </tbody>
                </table>


        </div>
    </div>
</div>

</body>
</html>
