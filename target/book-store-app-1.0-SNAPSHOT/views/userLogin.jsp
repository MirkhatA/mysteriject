<%--
  Created by IntelliJ IDEA.
  User: Mirkhat
  Date: 4/21/2022
  Time: 7:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row">
        <div>
            <form action="/login" method="POST">
                <div class="form-group">
                    <h2>Sign in</h2>
                </div>

                <div class="form-group">
                    <laber>Email</laber>
                    <input type="email" class="form-control" name="email" placeholder="Your email..." required>
                </div>

                <div class="form-group">
                    <laber>Password</laber>
                    <input type="password" class="form-control" name="password" placeholder="Your password..." required>
                </div>

                <a href="userRegister.jsp">Create an account</a><br>
                
                <button type="submit" class="btn btn-primary">Enter</button>

            </form>
        </div>
    </div>
</div>


</body>
</html>
