<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form action="/edit/save" method="post" modelAttribute="mail">
    <fieldset style="display: inline">
        <form:hidden path="name"/>
        <table>
            <tr>
                <th>
                    <form:label path="languages">Languages: </form:label>
                </th>
                <td>
                    <form:select path="languages" items="${listLanguages}"/>
                </td>
            </tr>
            <tr>
                <th>
                    <form:label path="pageSize">PageSize: </form:label>
                </th>
                <td>
                    <form:select path="pageSize" items="${listSize}"/>
                </td>
            </tr>
            <tr>
                <th>
                    <form:label path="filter">Filter: </form:label>
                </th>
                <td>
                    <form:checkbox path="filter"/>
                </td>
            </tr>
            <tr>
                <th>
                    <form:label path="signature"/>
                </th>
                <td>
                    <form:textarea path="signature"/>
                </td>
            </tr>
            <tr>
                <td>
                    <form:button>Submit</form:button>
                </td>
            </tr>
        </table>
    </fieldset>
</form:form>
</body>
</html>
