<%--
  Created by IntelliJ IDEA.
  User: GT
  Date: 2019/5/24
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/test2" method="post">
    <input type="text" name="name">
    <input type="text" name="age">
    <input type="checkbox" name="list" value="code">
    <input type="checkbox" name="list"value="book">
    <input type="checkbox" name="list" value="vedio">

    <input type="submit" value="submit">
    <a href="/test3?name=ll">跳转</a>
    <a href="/test4/ll">跳转</a>

</form>
</body>
</html>
