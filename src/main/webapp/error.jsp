<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <h1>ERROR !!!</h1>
    <h4>The application has malfunctioned.</h4>

    <p>  Please contact technical support with the following information:</p>

    <h4>Exception Name: <s:property value="exception" /> </h4>

    <h4>Exception Details: <s:property value="exceptionStack" /></h4>
</head>
</html>