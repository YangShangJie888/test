<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/1/24
  Time: 17:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <%
      pageContext.setAttribute("ctp",request.getContextPath());
    %>
    <script type="text/javascript" src="scripts/jquery-1.9.1.min.js"></script>
  </head>
  <body>

  <%--<a href="haha/hello"> Hello</a>--%>
  <%--<a href="haha/user/admin"> PathVariable</a>--%>

  <%--<form action="haha/book/1" method="post">--%>
    <%--<input type="hidden" name="_method" value="delete">--%>
    <%--<input type="submit" value="删除">--%>
  <%--</form>--%>

  <%--<form action="haha/book" method="post">--%>

    <%--书名<input type="text" name="name" >--%>
    <%--作者<input type="text" name="author" >--%>
    <%--城市<input type="text" name="address.city" >--%>
    <%--街道<input type="text" name="address.street" >--%>
    <%--<input type="submit" value="添加">--%>
  <%--</form>--%>

  <%--<a href="${ctp}/getallajax">获取ajax数据</a>--%>
  <%--<div id="info"></div>--%>
  <%--<script type="text/javascript">--%>
<%--//    $(function () {--%>
<%--//--%>
<%--//    });--%>
    <%--$("a:first").click(function () {--%>

        <%--$.ajax(--%>
            <%--{--%>
                <%--url:"${ctp}/getallajax",--%>
                <%--type:"GET",--%>
                <%--success:function (data) {--%>
                    <%--alert(data);--%>
<%--//                    console.log(data);--%>
<%--//                    $.each(data,function () {--%>
<%--//                        var empInfo = this.lastName;--%>
<%--//                        $("#info").append(empInfo);--%>
<%--//                    });--%>
                <%--}--%>
            <%--}--%>
        <%--);--%>
        <%--return false;--%>
    <%--});--%>
  <%--</script>--%>
  ${msg}
  <form action="${ctp}/upload1" method="post" enctype="multipart/form-data">
    用户头像：<input type="file" name="headerimg"/><br/>
    用户头像1：<input type="file" name="headerimg"/><br/>
    用户头像2：<input type="file" name="headerimg"/><br/>
    用户名：<input type="text" name="username"/><br/>
    <input type="submit"/>
  </form>


  </body>
</html>
