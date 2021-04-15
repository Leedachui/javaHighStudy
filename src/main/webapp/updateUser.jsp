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
    <title>修改用户信息</title>
</head>
<body>
    <div align="center">
        <form action="/user/updateUser" method="post">
            <table>
                <tr>
                    <td>用户id：</td>
                    <td>
                        <input type="text" name="uid">
                    </td>
                </tr>
                <tr>
                    <td>姓名：</td>
                    <td>
                        <input type="text" name="uname">
                    </td>
                </tr>
                <tr>
                    <td>性别：</td>
                    <td>
                        <input type="text" name="usex">
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="submit" value="提交"/>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
