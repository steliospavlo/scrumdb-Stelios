<%-- 
    Document   : index
    Created on : Apr 29, 2020, 2:39:10 PM
    Author     : Walter
--%>

<%@page import="entities.User"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="entities.Answer"%>
<%@page import="entities.Question"%>
<%@page import="entities.User"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="index.jsp" method="GET">
            <div class="form-group">
                <label for="user">User</label>
                <input type="text" class="form-control" id="user" name="user" maxlength="50" required>
            </div>
            <div id="alert"></div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
        <%
            String username = request.getParameter("user");
            entities.User = new entities.User(username);
        %>
    </body>
</html>
