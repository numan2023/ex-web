<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="web_basic.User" %>
    
<%
//リクエストスコープからのデータの取得
User objUser = (User)request.getAttribute("RequestUser");
String name = objUser.getName();
int age = objUser.getAge();
%>    
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>自作クラスのオブジェクトを登録する</title>
	</head>
	<body>
		名前は：<%= name %><br>
		年齢は：<%= age %><br>
	</body>
</html>