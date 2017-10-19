<%-- 
    Document   : home
    Created on : 19/10/2017, 08:35:51 AM
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            HttpSession sesion = request.getSession();
            out.print("<h1>Bienvenido " + sesion.getAttribute("claveSesion") + "</h1>");
        %>
        <br>
        <img src="descarga.jpg" alt=""/>
        <form action="index.jsp" method="post">
            <input type="submit" value="Cerrar Sesion">
        </form>
    </body>
</html>
