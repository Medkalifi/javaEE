<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="j_spring_security_check" method="post">
		<table>
			<tr> 
				<td> login </td>
				<td> <input type="text" name="j_username"></td>
			</tr>
			<tr> 
				<td> mot de passe  </td>
				<td> <input type="password" name="j_password"></td>
			</tr>
			<tr>
				<td> <input type="submit" value="Login"> </td>
			 </tr>
		</table>
	
	</form>
</body>
</html>