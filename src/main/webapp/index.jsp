<%@taglib prefix="s" uri="/struts-tags" %>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <title></title>
    <s:head/>
</head>
<body>
<h1><s:text name="greeting"/></h1>
<h2>Welcome to Struts 2!!</h2>
<p><a href="<s:url action='hello'/>">Hello World</a></p>
<s:url action="hello" var="helloLink">
    <s:param name="userName">Bruce Phillips</s:param>
</s:url>
<p><a href="${helloLink}">Hello Bruce Phillips</a></p>
<p>Get your own personal hello by filling out and submitting this form</p>
<p><s:form action="hello">
    <s:textfield name="userName" label="Your name"/>
    <s:submit value="Submit" />
</s:form>
</p>
<p>I've said hello  <s:property value="helloCount" /> times! </p>
<p><s:property value="messageStore" /> from toString </p>
<s:url action="registerInput" var="registerInputLink">
    <s:param name="request_locale" >zh_CN</s:param>
</s:url>
<s:url action="edit" var="editInputLink">
    <s:param name="request_locale" >zh_CN</s:param>
</s:url>
<p><a href="${registerInputLink}">Please register</a> for our prize drawing</p>
<p><a href="${editInputLink}">Edit</a> if you has login</p>

<hr/>
<p><s:text name="contact"/></p>
</body>
</html>
