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
    <title>Register</title>
    <s:head/>
</head>
<body>
    <h3>Register for a prize by completing this form.</h3>
<s:form action="register">
    <%--<s:textfield name="personBean.firstName" label="First Name"/>--%>
    <s:textfield key="personBean.firstName"/>
    <s:textfield key="personBean.lastName"/>
    <%--<s:textfield name="personBean.lastName" label="Last Name"/>--%>
    <s:textfield key="personBean.email"/>
    <%--<s:textfield name="personBean.email" label="Email"/>--%>
    <s:textfield key="personBean.age"/>
    <%--<s:textfield name="personBean.age" label="Age"/>--%>
    <s:submit/>
</s:form>
</body>
</html>