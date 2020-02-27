<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%--
  Created by IntelliJ IDEA.
  User: ouguangji
  Date: 2020/2/22
  Time: 0:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>水果列表</title>
</head>
<body>
    <h3>新鲜水果</h3>
    <form action="queryFruitsByCondition.action" method="post">
        id: <input type="text" name="id"/>
        名称：<input type="text" name="name"/>
        产地：<input type="text" name="producing_area"/>
        <input type="submit" value="搜索">
    </form>
    <h4>搜索结果</h4>
    <table width="300px;" border=1>
        <tr>
            <td>ID</td>
            <td>名称</td>
            <td>价格</td>
            <td>产地</td>
        </tr>
        <c:forEach items="${fruitsList}" var="fruit">
            <tr>
                <td>${fruit.id}</td>
                <td>${fruit.name}</td>
                <td>${fruit.price}</td>
                <td>${fruit.producing_area}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
