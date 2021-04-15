<%--
  Created by IntelliJ IDEA.
  User: sapce
  Date: 2021/4/10
  Time: 12:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() +
            ":" + request.getServerPort() + request.getContextPath() + "/";
%>
<html>
<head>
    <meta charset="utf-8">
    <title>结果</title>
    <base href="<%=basePath%>"/>
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $.each(${tips},function (i,n){

            })
        })
    </script>
</head>
<body>
<div align="center">
    <table>
        <tr>
            结果页面，操作结果：${tips}

        </tr>
        <tr>
            <td>
                <a href="index.jsp">返回首页</a>
            </td>
        </tr>
    </table>

</div>

</body>
</html>
