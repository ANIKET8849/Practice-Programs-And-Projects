<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:out value="Hello World!!"></c:out>
	
	<c:set var="number1" value="10"></c:set>
	<c:out value="${number1}"></c:out>
	
	<c:set var="age" value="22"></c:set>
	<c:if test="${age>=18}">
		<c:out value="You are eligible for vote!!"></c:out>
	</c:if>
	
	
	<c:set var="marks" value="26"></c:set>
	<c:choose>
		<c:when test="${marks>=75}">
			<c:out value="A Grade"></c:out>
		</c:when>
		<c:when test="${marks>=60}">
			<c:out value="B Grade"></c:out>
		</c:when>
		<c:when test="${marks>=45}">
			<c:out value="C Grade"></c:out>
		</c:when>
		<c:when test="${marks>=35}">
			<c:out value="D Grade"></c:out>
		</c:when>
		<c:otherwise>
			<c:out value="Fail"></c:out>
		</c:otherwise>
	</c:choose>
</body>
</html>