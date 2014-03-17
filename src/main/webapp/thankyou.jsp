<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: huangshaolong
  Date: 3/14/14
  Time: 2:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Successful</title>
</head>
<body>

<h3><s:text name="thankyou"/></h3>

<p>Your registration information:<s:property value="personBean"/> </p>
<p><a href="<s:url action='index'/>" >Return to home page</a></p>
</body>
<%--<p><s:text name="contact"/></p>--%>
</html>