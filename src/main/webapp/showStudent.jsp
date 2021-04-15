<%--
  Created by IntelliJ IDEA.
  User: sapce
  Date: 2021/4/8
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() +
            ":" + request.getServerPort() + request.getContextPath() + "/";
%>
<html>
<head>
    <title>查询学生</title>
    <base href="<%=basePath%>"/>
    <script src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function () {
            showStudent();
        });
        function showStudent() {
            $.ajax({
                url:"user/showAllUser",
                type:"get",
                dataType:"json",
                success:function (data) {
                    //清除原来的数据
                    $("#showInfo").html("");
                    $.each(data,function (i,n) {
                        //添加新的数据
                        $("#showInfo").append("<tr>")
                            .append("<td>"+n.uid+"</td>")
                            .append("<td>"+n.uname+"</td>")
                            .append("<td>"+n.usex+"</td>")
                            .append("</tr>")
                    })
                }
            })
        }
    </script>
</head>
<body>
    <div align="center">
        <table>
            <tr>
                <td>学号</td>
                <td>姓名</td>
                <td>性别</td>
            </tr>
            <tbody id="showInfo">
            
            </tbody>
        </table>
        <form action="/user/showUserById"  method="post">
            <table>
                <input type="text" name="id" placeholder="输入用户id">
                <input type="submit"  value="查询">
            </table>
        </form>
    </div>
</body>
</html>
