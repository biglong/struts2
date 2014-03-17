<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: huangshaolong
  Date: 3/13/14
  Time: 4:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html;charset=ISO-8859-1">
    <title>Hello World!!</title>
</head>
<body>
    <h2><s:property value="messageStore.message"/></h2>
    <h2><s:property value="helloCount"/></h2>
    <h2><s:property value="userName"/></h2>
</body>
</html>