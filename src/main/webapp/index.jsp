<%--<%--%>
<%--    if (session.getAttribute("email") == null) {--%>
<%--        response.sendRedirect("/views/userLogin.jsp");--%>
<%--    }--%>
<%--%>--%>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title> Hello World</title>
</head>
<body>
<p>Home page "/"</p>

<% if (session.getAttribute("email") == null) {%>
<a href="/views/userRegister.jsp">register</a>
<br>
<a href="/views/userLogin.jsp">login</a>
<% } else { %>
<b>
    <%=session.getAttribute("email")%>
</b> <br>
<a href="./logout">logout</a>
<% } %>
</body>
</html>