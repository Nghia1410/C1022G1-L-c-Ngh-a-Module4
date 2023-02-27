<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
<h1 class="bg-danger">Calculator</h1>
<br>
<form action="/calculator" method="post">
    <input name="num1" placeholder="number 1">
    <select name="math">
        <option value="addition">Addition (+)</option>
        <option value="subtraction">Subtractin (-)</option>
        <option value="multiplication">Multiplication (x)</option>
        <option value="division">Division (/)</option>
    </select>
    <input name="num2" placeholder="number 2">
    <br>
    <br>
    <button type="submit">Enter</button>
</form>
<h1>Result : ${result}</h1>
</body>
</html>
