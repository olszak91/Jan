<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.error {
	background-color: red;
	color: white;
}
</style>
</head>
<body>
<h1>Add Currency</h1>
	<form:form method="post" modelAttribute="box">
	Name:
		<form:input path="title" />
		<form:errors path="title" cssClass="error" />		
		
	Url:
		<form:input path="url" />
		<form:errors path="url" cssClass="error" />		
		
	Rate:
		<form:input type="number" path="rate" />
		<form:errors path="rate" cssClass="error" />		
		
	
		
		<input type="submit" value="Save">
	</form:form>
	<INPUT Type="BUTTON" Value="Homepage" Onclick="window.location.href='http://localhost:8080/Spring01hibernate/'">
	
</body>
</html>