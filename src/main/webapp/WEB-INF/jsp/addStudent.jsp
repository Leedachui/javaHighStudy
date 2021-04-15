<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() +
            ":" + request.getServerPort() + request.getContextPath() + "/";
%>
<html>
<head>
    <title>增加学生</title>
    <base href="<%=basePath%>"/>
</head>
<body>
<div align="center">
    <form action="/student/addStudent" method="post">
        <table>
            <tr>
                <td>姓名：</td>
                <td>
                    <input type="text" name="stuname">
                </td>
            </tr>
            <tr>
                <td>性别：</td>
                <td>
                    <input type="text" name="stusex">
                </td>
            </tr>
            <tr>
                <td>电话：</td>
                <td>
                    <input type="number" name="stunum">
                </td>
            </tr>
            <tr>
                <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                <td>
                    <input type="submit" name="提交">
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
