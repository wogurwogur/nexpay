<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%

	String ctxPath = request.getContextPath();
	//     /myspring
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="<%=ctxPath%>/js/jquery-3.7.1.min.js"></script>

</head>
<body>
	<div style="background-color: blue; width:100%; height: 500px;"></div>
</body>
</html>