<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>redirect 사용해보기</h3>
	
	<form action="login" method="post">
		<input type="text" name="id">
		<input type="password" name="pw">
		<input type="submit" name="확인">
		${msg }
	</form>
</body>
</html>
