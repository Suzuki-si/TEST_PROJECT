<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
<link href="css/commons.css" rel="stylesheet">
</head>
<body>
  <form:form action="login" modelAttribute="loginForm" >
  <p>
  <label>ID</label><form:input path="id" />
  </p>
  <p>
  <label>PASS</label><form:password path="pass" />
  </p>
  <form:button>ログイン</form:button>
</form:form>

</body>
</html>