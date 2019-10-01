<%-- 
    Document   : newPassword
    Created on : 27 Sep, 2019, 1:30:23 AM
    Author     : nafees
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>forget password</title>
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
            <div class="container center_div">
                <% String str=request.getParameter("email"); %>
                
                
                <form action="fc/?page=Updater&type=model&email=str" method="get" class="centre">
                    <input class="form-control" type="text" name="password" placeholder="Enter New Password">
                    <input class="form-control" type="text" name="password" placeholder="Enter Again Password">
                    <button class="button btn btn-primary" type="submit">change</button>
                </form>
            </div>


        </div>
    </body>
</html>
