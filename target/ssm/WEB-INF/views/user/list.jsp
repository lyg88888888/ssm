<%--
  Created by IntelliJ IDEA.
  User: liuyangang
  Date: 2019-03-15
  Time: 19:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
<table border="1">
    <tr>
        <td>id</td>
        <td>username</td>
        <td>name</td>
        <td>password</td>
        <td>type</td>
    </tr>
    <c:forEach items="${userlist}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.name}</td>
            <td>${user.password}</td>
            <td>${user.type}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
