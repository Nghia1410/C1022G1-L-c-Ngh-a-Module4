<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <h4>${mess}</h4>
    <tr>
        <th>STT</th>
        <th>Name</th>
        <th>Languages</th>
        <th>PageSize</th>
        <th>Signature</th>
    </tr>
    <c:forEach var="mail" items="${mailList}" varStatus="stt">
        <tr>
            <td>${stt.count}</td>
            <td>${mail.name}</td>
            <td>${mail.languages}</td>
            <td>${mail.pageSize}</td>
            <td>${mail.signature}</td>
            <td><a href="/edit/${mail.name}">Edit</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
