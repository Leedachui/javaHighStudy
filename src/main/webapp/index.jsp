<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() +
            ":" + request.getServerPort() + request.getContextPath() + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>首页界面</title>
    <base href="<%=basePath%>"/>

</head>
<body>
<div align="center">
    <table>
        <tr>
            <td>
                <a href="addStudent.jsp">注册用户</a>
            </td>
        </tr>
        <tr>
            <td>
                <a href="/user/loginUser">登录界面</a>
            </td>
        </tr>
        <tr>
            <td>
                <a href="showStudent.jsp">查询用户</a>
            </td>
        </tr>
        <tr>
            <td>
                <a href="deleteUser.jsp">删除用户</a>
            </td>
        </tr>
        <tr>
            <td>
                <a href="/order/moreToMore">多对多测试</a>
            </td>
        </tr>
        <tr>
            <td>
                <a href="updateUser.jsp">修改用户信息</a>
            </td>
        </tr>
    </table>
</div>
</body>
</html>