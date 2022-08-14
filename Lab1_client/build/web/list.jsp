<%-- 
    Document   : list
    Created on : 15-Aug-2022, 00:02:36
    Author     : Mirai
--%>
<%@ page isELIgnored="false" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table style="border: thin solid black;">
            <tr>
                <th>Roll No.</th>
                <th>Name</th>
                <th>Class Name</th>
                <th>Update</th>
                <th>Delete?</th>
            </tr>
            <c:forEach items="${sv}" var="sv">
                <tr>
                    <td>${sv.rollId}</td>
                    <td>${sv.fullName}</td>
                    <td>${sv.className}</td>
                    <td><a href="GetUpdate?roll=${sv.rollId}">Update</a></td>
                    <td><a href="DeleteServlet?roll=${sv.rollId}" onclick="return confirm('Would you like to delete this student information?')">Delete</a></td>
                </tr>
            </c:forEach>
    </body>
</html>
