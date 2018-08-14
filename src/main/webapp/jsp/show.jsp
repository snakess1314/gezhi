<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: AYA
  Date: 2018/8/2
  Time: 19:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ss</title>
</head>
<body>
<c:forEach items="${lists}" var="ls">
    ${ls}
</c:forEach>
</body>
</html>
