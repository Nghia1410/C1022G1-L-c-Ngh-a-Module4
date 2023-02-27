<%--
  Created by IntelliJ IDEA.
  User: HP Victus
  Date: 2/24/2023
  Time: 4:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Change</title>
</head>
<body>
<div style="text-align: center">
    <h1 style="color: coral">Change Money</h1>
    <form action="/change" method="post">
        <p>USD: <input type="text" name="amount"></p>
        <p>Rate: <input type="text" name="rate"></p>
        <button type="submit">Change</button>
    </form>
    <p>Result: ${result}</p>
</div>
</body>
</html>