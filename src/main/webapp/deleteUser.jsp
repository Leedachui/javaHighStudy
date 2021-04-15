<%--
  Created by IntelliJ IDEA.
  User: sapce
  Date: 2021/4/11
  Time: 13:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除用户</title>
</head>
<body>
    <div align="center">
        <form action="/user/deleteUser">
            <table>
                <input type="text" name="id" placeholder="输入用户id">
                <input type="submit" value="删除">
            </table>
        </form>
    </div>
</body>
</html>
