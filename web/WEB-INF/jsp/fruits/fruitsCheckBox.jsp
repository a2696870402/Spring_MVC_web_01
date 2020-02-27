<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ouguangji
  Date: 2020/2/27
  Time: 23:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="" method="post">
        <table width="300px" border=1>
            <tr>
                <td>名称</td>
                <td>价格</td>
                <td>产地</td>
            </tr>
            <c:forEach items="${fruitsList}" var="fruit" varStatus="status">
                <tr>
                <td><input name="fruitsList[${status.index}].name" value="${fruit.name}"></td>
                <td><input name="fruitsList[${status.index}].price" value="${fruit.price}"></td>
                <td><input name="fruitsList[${status.index}].producing_area" value="${fruit.producing_area}"></td>
                </tr>
            </c:forEach>
        </table>
        <br/>
        <input type="submit" value="批量提交测试">
    </form>
</body>
</html>
