<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="./css/style.css" >
		<title>ユーザー登録完了</title>
	</head>
	<body>
		<br>
		<h1>以下のユーザー登録が完了しました</h1>
		<table>
			<tbody>	
				<tr>
					<th>USERNAME</th>
					<th>PASSWORD</th>
				</tr>
				<s:iterator value="#session.loginDTOList">
					<tr>
						<td><s:property value="username" /></td>
						<td><s:property value="password" /></td>
					</tr>
				</s:iterator>
			</tbody>
		</table>
	</body>
</html>