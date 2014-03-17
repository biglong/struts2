<%--
  Created by IntelliJ IDEA.
  User: huangshaolong
  Date: 3/17/14
  Time: 5:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Update information</title>
    <s:head/>
</head>
<body>
<h3>Update Information</h3>
<s:form action="save" method="post">
    <s:textfield key="personBean.firstName"/>
    <s:textfield key="personBean.lastName"/>
    <s:textfield key="personBean.email"/>
    <s:textfield key="personBean.phoneNumber"/>
    <s:select key="personBean.sport" list="sports" />
    <s:radio key="personBean.gender" list="genders" />
    <s:select key="personBean.residency" list="states" listkey="stateAbbr" listvalue="stateName"/>
    <s:checkbox key="personBean.over21" />
    <s:checkboxlist key="personBean.carModels" list="allCarModels"/>
    <s:textfield key="personBean.age"/>
    <s:submit/>
</s:form>
</body>
</html>