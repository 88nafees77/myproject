<%-- 
    Document   : forgetpassword
    Created on : 26 Sep, 2019, 8:53:34 PM
    Author     : nafees
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

        <!-- Popper JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container-fluid">
            <form action="http://localhost:8080/mvcModel/fc/?page=ForgetPassword&type=model" method="post"><br>
                <label for="email">Email</label>
                <input class="form-control" id="eid" onblur="loginVerify('eid', 'sid')" type="text" name="email" placeholder="username"><span id="sid"></span><br>
                <input type="submit" name="login" class="btn btn-primary">


            </form>



        </div>
    </body>
</html>
