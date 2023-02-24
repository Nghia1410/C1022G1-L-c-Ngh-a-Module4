<%--
  Created by IntelliJ IDEA.
  User: HP Victus
  Date: 2/24/2023
  Time: 5:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<div style="text-align: center">
    <h1 style="color: dodgerblue">Dictionary</h1>
    <form action="/lookUp" method="post">
        <p>Input word here: <input type="text" name="word"></p>
        <button type="submit">RESULT</button>
    </form>

    <p>${result}</p>
</div>
</body>
</html>
