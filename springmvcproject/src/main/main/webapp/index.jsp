<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="hello">안녕하세요</a>
	<a href="happy/난는난난난">메시지</a>
	<a href="parameter?val=3">파라미터 읽기</a>
	<br>
	<h3> Get방식의 Form 전송</h3>
	<form name="f" action="getform" method="GET">
	이름<input type="text" name="name"/><br>
	pw:<input type="password" name="password"/><br>
	<input type="submit" value="전송"/>	
	</form>
	<br>
	<h3> Post방식의 Form 전송</h3>
	<form name="f" action="postform" method="POST">
	이름<input type="text" name="name"/><br>
	pw:<input type="password" name="password"/><br>
	<input type="submit" value="전송"/>	
	

	</form>
	
	
	
	<h3>fileupload</h3>
	<form name="f" action="fileup" method="POST" enctype="multipart/form-data" >
	<input type="text" name="name"/><br>
	<input type="file" name="pictureurl"/><br>
	<input type="submit" value="업로드"/><br>
	
	</form>
			<a href="getitems">파라미터 읽기</a>
</body>
</html>