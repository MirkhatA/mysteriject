<%--
  Created by IntelliJ IDEA.
  User: Mirkhat
  Date: 4/18/2022
  Time: 10:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div align="center">
        <h1>User register</h1>
        <form action="<%= request.getContextPath() %>/register" method="post">
            <table style="width: 80%">
                <tr>
                    <td>Username</td>
                    <td><input type="text" name="username"></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password"></td>
                </tr>
            </table>

            <input type="submit" value="Submit">
        </form>
    </div>
</body>
</html>
