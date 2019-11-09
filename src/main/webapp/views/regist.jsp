<%--
  Created by IntelliJ IDEA.
  User: 16393
  Date: 2019/10/31
  Time: 21:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <center>
        <form action="/user/saveUser" method="post">
            用户名：<input type="text" name="name"/><br>
            年龄：<input type="text" name="age"/><br>
            住址：<input type="text" name="address"/><br>
            <input type="submit" value="添加"/><br>
        </form>
    </center>
</body>
</html>
